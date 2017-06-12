package com.xriva.decisions;

import java.util.Random;

public class RockPaperScissors
{
	private static Random support = new Random();
	private static String keys = "ROCK----PAPER---SCISSORS";
	
	private static String[] rpsChoices =
	{
			"Rock", "Paper", "Scissors"
	};

	public static String myThrow()
	{
		return rpsChoices[support.nextInt(3)];
	}

	public static String myThrow(String yourThrow)
	{
		String challenge = yourThrow.toUpperCase().trim();
		String response = rpsChoices[support.nextInt(3)].toUpperCase().trim();
		int player = keys.indexOf(challenge); 
		int computer = keys.indexOf(response);
		
		player = (player == -1) ? -1 : (player / 8);
		computer /= 8;
		
		
		if (player == -1)
			return "Please play only rock, paper or scissors";
		
		if (player == 0 && computer == 1)
			return "My paper covers your rock";

		if (player == 0 && computer == 2)
			return "Your rock breaks my scissors";

		if (player == 1 && computer == 0)
			return "Your paper covers my rock";
	
		if (player == 1 && computer == 2)
			return "My scissors cuts your paper";
		
		if (player == 2 && computer == 0)
			return "My rock breaks your scissors";
	
		if (player == 2 && computer == 1)
			return "Your scissors cuts my paper";
		
		return "We tied (" + challenge.toLowerCase() + ", " + response.toLowerCase() + ").";
	}
}
