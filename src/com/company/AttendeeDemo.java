package com.company;

public class AttendeeDemo {

    public static void main(String[] args) {

        AttendeeManager am = new AttendeeManager();

        try{

            am.createByID("12348");

        } catch(InvalidIDNumberException ex){

            System.out.println("Error creating attendee. Invalid ID Number.");
            ex.printStackTrace();

        }



    }
}
