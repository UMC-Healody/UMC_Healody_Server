package dev.umc.healody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    public static void main(String[] args) {
        String dateString = "2023-09-05";

        Date start = new Date();
        Date end = new Date();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            start = format.parse(dateString + " 00:00");
            end = format.parse(dateString + " 23:59");
        } catch (ParseException e) {
            System.out.println("예외 처리");
        }

        System.out.println("start = " + start);
        System.out.println("end = " + end);
    }

}
