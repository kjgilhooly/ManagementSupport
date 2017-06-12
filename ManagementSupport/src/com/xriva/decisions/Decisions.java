package com.xriva.decisions;


public class Decisions
{

	public static void main(String[] args)
	{
		System.out.println(CoinToss.flip());
		System.out.println(RockPaperScissors.myThrow());
		System.out.println(RockPaperScissors.myThrow("Demo"));
		System.out.println(RockPaperScissors.myThrow("Rock"));
		System.out.println(RockPaperScissors.myThrow("Paper"));
		System.out.println(RockPaperScissors.myThrow("Scissors"));

		System.out.println(Dice.die());
		System.out.println("9-sided die: " + Dice.die(9));
		int dice[] = Dice.dice();
		for (int x = 0; x < 2; x++)
			System.out.println(x + ": " + dice[x]);
		System.out.println(MagicEightBall.qskQuestion());
		System.out.println(YesMen.opinion("We need to sell turnips"));
		System.out.println();
	}

}
