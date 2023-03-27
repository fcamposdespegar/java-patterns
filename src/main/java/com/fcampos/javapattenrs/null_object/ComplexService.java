package com.fcampos.javapattenrs.null_object;

public class ComplexService {

    public StorageService storage;

    public String reportName;

    public ComplexService(final StorageService storage) {
        this.storage = storage;
        this.reportName = "A complex report";
    }

    public ComplexService(final String reportName, final StorageService storage ) {
        this.storage = storage;
        this.reportName = reportName;
    }

    public void generateReport(){

        System.out.println("Starting a complex report build!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Done with report");
        storage.save(new Report(this.reportName));
    }
}
