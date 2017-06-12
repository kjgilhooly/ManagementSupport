package com.xriva.decisions;

import java.util.Random;

public class Dice
{
	private static Random die = new Random();

	public Dice()
	{
		super();
	}
	
	public static int die()
	{
		return die.nextInt(6) + 1;
	}

	public static int die(int sides)
	{
		return die.nextInt(sides) + 1;
	}

	public static int[] dice()
	{
		int[] results = {0, 0};

		for (int x = 0; x < 2; x++)
			results[x] = Dice.die();

		return results;
	}
	public static int[] dice(int dice)
	{
		int[] results = new int[dice];

		for (int x = 0; x < dice; x++)
			results[x] = Dice.die();

		return results;
	}
}
