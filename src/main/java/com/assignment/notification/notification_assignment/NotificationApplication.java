package com.assignment.notification.notification_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

import javax.annotation.PostConstruct;

/*
	TODO:		
	- Create a @PostConstruct method to be executed after spring container has completed configuration.
	- Invite input using Scanner and System.in for value "to" and "message".
	- Set the input to setup(string, string) method in NotificationService.java.
	- Invoke send() method in Notification.java.
*/

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	// inject NotificationService as a dependency
	private NotificationService notificationService;

	@Autowired
	public NotificationApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@PostConstruct
	public void myMethod() {
		Scanner scanner = new Scanner(System.in);

		// question for 'to'
		System.out.println("Who is this message for?");
		// read the 'to' message
		String to = scanner.nextLine();

		// question for 'message'
		System.out.println("Type your message.");
		String message = scanner.nextLine();

		// close the scanner
		scanner.close();

		// set up message and channel using setup() method from notificationService bean
		notificationService.setup(to, message);

		// send the notification with send method
		notificationService.send();
	}
}