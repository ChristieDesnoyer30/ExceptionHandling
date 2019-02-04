package com.company;

public class Attendee {
    private String idNumber;

    public Attendee() {
    }

    public Attendee(String idNumber){

        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

   public void printDetails(){
       System.out.println("Attendee created. ID NUMBER: " + idNumber);

    }


}
