package process.controller;

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
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		System.out.println(thirdCircle);
		
		PlayDohSnake firstSnake = new PlayDohSnake();
		PlayDohSnake secondSnake = new PlayDohSnake();
		
		System.out.println("Look I made a snake");
		System.out.println(firstSnake);
		System.out.println(secondSnake);
		PlayDohSnake thirdSnake = new PlayDohSnake(3);
		System.out.println(thirdSnake);
	}
}
