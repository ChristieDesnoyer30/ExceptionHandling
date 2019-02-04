package com.company;

public class AttendeeManager {

    public Attendee createByID(String id) throws InvalidIDNumberException {


        if (id.length() == 8) {

            Attendee attendee = new Attendee(id);

            attendee.printDetails();

            return attendee;

        } else {
                throw new InvalidIDNumberException("Please enter an 8 " +
                        "digit number.");

        }
    }



}
