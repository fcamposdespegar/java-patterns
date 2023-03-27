package com.fcampos.javapattenrs.flyweight;

import javax.lang.model.type.ErrorType;
import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {
        GenericSystemError,
        PageNotFoundError,
        ServerError
    }

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance(){
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessage = new HashMap<>();

    private ErrorMessageFactory(){
        errorMessage.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("A generic error of type $errorCode occurred. please refer to:\n",
                        "https://google.com/Q="));

        errorMessage.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not found. An error of type $errorCode occurred. please refer to:\n",
                        "https://google.com/Q="));
    }

    public SystemErrorMessage getError(ErrorType type){
        return errorMessage.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId){
        return new UserBannedErrorMessage(caseId);
    }


}
