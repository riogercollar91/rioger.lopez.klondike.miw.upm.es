package es.upm.miw.klondike.Controllers;

import es.upm.miw.klondike.Models.Game;

public abstract class Controller {
	protected Game game;

	protected Controller(Game game) {
		assert game != null;
		this.game = game;
	}
}
