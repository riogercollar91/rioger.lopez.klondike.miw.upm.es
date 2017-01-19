package es.upm.miw.klondike.Controllers;

import es.upm.miw.klondike.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.klondike.Models.Game;
import es.upm.miw.klondike.Views.ErrorView;
import es.upm.miw.klondike.Views.MenuView;

public class MoveFromWasteToTableauController extends Controller implements MoveFromStackToStack {
	MenuView menuView;
	ErrorView errorView;
	int selector;
	protected MoveFromWasteToTableauController(Game game) {
		super(game);
		menuView = new MenuView();	
		errorView = new ErrorView();
	}

	@Override
	public boolean canMove() {
		selector = menuView.optionSelectorGenerator("A qué escalera?", 7)-1;
		return false;
	}

	@Override
	public void move() {
		this.canMove();

	}

}
