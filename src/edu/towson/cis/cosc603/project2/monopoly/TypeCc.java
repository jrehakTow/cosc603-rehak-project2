package edu.towson.cis.cosc603.project2.monopoly;


/**
 * @see edu.towson.cis.cosc603.project2.monopoly.Card#TYPE_CC
 */
public class TypeCc extends Type {
	public Card btnDrawCardClicked(Card card, GameBoard gameBoard) {
		card = gameBoard.drawCCCard();
		card.applyAction();
		return card;
	}
}