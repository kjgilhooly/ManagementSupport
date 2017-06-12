package com.xriva.decisions;

import java.util.Random;

public class CoinToss
{
	public static Random coin = new Random(); 
	
	public CoinToss()
	{
		super(); 
	}

	public static String flip()
	{
		return ((coin.nextInt(301) % 2) == 0 ? "Heads" : "Tails");
	}
}
