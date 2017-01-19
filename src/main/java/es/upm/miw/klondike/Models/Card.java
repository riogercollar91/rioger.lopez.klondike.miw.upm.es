package es.upm.miw.klondike.Models;

public class Card {

	public static final int MAX_VALUE = 12;
	public static final int MIN_VALUE = 1;
	private CardType cardType;
	private int value;
	boolean hidden;

	public Card(int value, CardType cardType) {
		this.value = value;
		this.cardType = cardType;
		hidden = true;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public CardType getCardType() {
		return cardType;
	}
	
	public char getCharCardType() {		
		return cardType.toString().charAt(0);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isAce() {
		return value == 1;
	}

}
