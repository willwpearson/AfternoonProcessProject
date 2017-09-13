package process.controller;

import java.util.Scanner;
import process.model.PlayDohCircle;
import process.model.PlayDohSnake;

public class ProcessController
{
	public ProcessController()
	{
		
	}
	
	public void start()
	{
		System.out.println("This is a practice project. ");
		System.out.println("By practicing I develop muscle memory :D");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		PlayDohSnake firstSnake = new PlayDohSnake();
		PlayDohSnake secondSnake = new PlayDohSnake();
		
		System.out.println("Look I also made a snake");
		System.out.println(firstSnake);
		System.out.println(secondSnake);
		
		PlayDohSnake thirdSnake = new PlayDohSnake(circleSize);
		System.out.println(thirdSnake);
		
		System.out.println("What size should we change the circle to?" );
		int updated = myScanner.nextInt();
		thirdCircle.setSize(updated);
		System.out.println("The circle now is... ");
		System.out.println(thirdCircle);
		
		
	}
	
}
