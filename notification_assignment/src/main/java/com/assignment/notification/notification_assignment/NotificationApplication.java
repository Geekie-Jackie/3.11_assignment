package com.assignment.notification.notification_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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


	@PostConstruct
	public void myMethod() {
		
		Scanner scanner = new Scanner(System.in);
		
		// question for 'to'
		System.out.println("Who is this message for?");
		// read the 'to' message
		String to = scanner.nextLine();

		// question for 'message'
		System.out.println("Type your message");
		String message = scanner.nextLine();

		// close the scanner
		scanner.close();



	}

	

	// public class ScannerExample {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read an integer
//         int number = scanner.nextInt();
//         System.out.println("The integer is: " + number);

//         // Read a double
//         double floatingPointNumber = scanner.nextDouble();
//         System.out.println("The floating point number is: " + floatingPointNumber);

//         // Read a string
//         String text = scanner.nextLine();
//         System.out.println("The string is: " + text);
//     }
// }

	}





}



