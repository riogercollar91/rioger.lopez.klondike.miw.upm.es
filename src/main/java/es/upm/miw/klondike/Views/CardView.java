package es.upm.miw.klondike.Views;

import es.upm.miw.klondike.Models.Card;
import es.upm.miw.klondike.Utils.IO;

public class CardView {

	private Card card;

	public CardView(Card card) {
		this.card = card;
	}

	public void render() {
		IO io = new IO();

		if (!this.card.isHidden()) {
			io.write("[" + this.card.getValue() + "," + this.card.getCardType() + "]");
		} else {
			io.write("[");
		}

	}

}
