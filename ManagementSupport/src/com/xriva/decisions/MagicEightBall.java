package com.xriva.decisions;

import java.util.Random;

public class MagicEightBall
{
	private static Random support = new Random();

	private static String[] m8b =
	{
			"It is certain", "It is decidedly so", "Without a doubt",
			"Yes, definitely", "You may rely on it", "As I see it, yes",
			"Most likely", "Outlook good", "Yes", "Signs point to yes",
			"Reply hazy try again", "Ask again later",
			"Better not tell you now", "Cannot predict now",
			"Concentrate and ask again", "Don't count on it", "My reply is no",
			"My sources say no", "Outlook not so good", "Very doubtful"
	};

	public MagicEightBall()
	{
		super();
	}

	public static String qskQuestion()
	{
		return m8b[support.nextInt(m8b.length) + 1];
	}
}
