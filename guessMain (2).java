package com.guess;

import java.util.Random;
import java.util.Scanner;
class GuessTheNumber
{
	private int randomNum;
	private int count;
	int userInput;
	GuessTheNumber()
	{
		count=0;
		Random random = new Random();
		randomNum = random.nextInt(11);
	}
	public void takeInput(int num)
	{
		this.userInput = num;
	}
	public boolean isCorrectNumber()
	{
		if (this.userInput > randomNum)
		{
			System.out.println("The number is lesser than the number you have entered");
			this.count +=1;
		}
		else if(this.userInput < randomNum)
		{
			System.out.println("The number is greater than the number you have entered");
			this.count +=1;
		}
		else
		{
			this.count +=1;
			return true;
		}
		return false;
	}
	public int showResult()
	{
		System.out.println("You guessed the number:"+this.randomNum);
		return this.count;
	}
}

public class guessMain
{
	public static void main(String args[])
	{
		GuessTheNumber gs = new GuessTheNumber();
		boolean yes=false;
		while(yes!=true)
		{
			System.out.println("Enter the number between 0 and 10");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			gs.takeInput(i);			
			yes=gs.isCorrectNumber();
		}
		System.out.println("Total count is :"+gs.showResult());
	}
}