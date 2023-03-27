package com.fcampos.javapattenrs.adapter;

public class Client {

    public static void main(String[] args){
        /** Using Class/Two.way adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeDate(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("************************************************");

        /** Using Object adapter **/
        Employee employee = new Employee();
        populateEmployeeDate(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(employeeObjectAdapter);
        System.out.println(card);

    }

    private static void populateEmployeeDate(Employee employee){
        employee.setFullName("Fernando Campos");
        employee.setJobTitle("Software Engineer TWO");
        employee.setOfficeLocation("Calle 36 n1228 Depto 11 (CASA)");
    }
}
