package com.github.aastrandemma;

import com.github.aastrandemma.model.Email;
import com.github.aastrandemma.service.EmailService;
import com.github.aastrandemma.service.EmailServiceImpl;
import com.github.aastrandemma.exception.EmailException;

public class App {
    public static void main(String[] args) {
        EmailService service = new EmailServiceImpl();
        try {
            service.createAndSend("RECEIVER_EMAIL", "Test subject 2", "Test content 2");
            service.findAll().forEach(email -> System.out.println(email.summary()));
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }
    }
}