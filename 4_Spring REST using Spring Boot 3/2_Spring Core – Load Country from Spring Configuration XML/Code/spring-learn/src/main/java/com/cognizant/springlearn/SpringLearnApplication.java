package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {
    public static void main(String[] args) {
        displayDate();
    }

    private static void displayDate() {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("date-format.xml");


        SimpleDateFormat format =
                ctx.getBean("dateFormat", SimpleDateFormat.class);


        try {
            Date d = format.parse("31/12/2018");
            System.out.println("Parsed date = " + d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}