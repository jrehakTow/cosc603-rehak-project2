package edu.towson.cis.cosc603.project2.monopoly;


public class DiceRoll {
	private Die[] dice;
	private boolean testMode;

	public void setDice(Die[] dice) {
		this.dice = dice;
	}

	public void setTestMode(boolean testMode) {
		this.testMode = testMode;
	}

	/**
	 * Roll dice.
	 * @return  the int[]
	 */
	public int[] rollDice(MonopolyGUI gui) {
		if (testMode) {
			return gui.getDiceRoll();
		} else {
			return new int[] { dice[0].getRoll(), dice[1].getRoll() };
		}
	}
}