package input.controller;

import java.util.Scanner;

public class InputController
{
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		questions();
		questions();
	}
	
	private void questions()
	{
		System.out.println("Please type in your name");
		String myInput;
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Greetings good sir " + myInput + ", do you like things?");
		System.out.println("Did you type more than one name? I am sorry, please type your full name");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is: " + fullName);
		System.out.println("My name is Java");
		System.out.println("Yo whats you age?");
		int age = inputScanner.nextInt();
		System.out.println("You are " + age + " years old? W0W");
	}
}
