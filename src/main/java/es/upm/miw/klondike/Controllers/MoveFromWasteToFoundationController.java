package es.upm.miw.klondike.Controllers;

import es.upm.miw.klondike.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.klondike.Models.Game;
import es.upm.miw.klondike.Utils.LimitedIntDialog;
import es.upm.miw.klondike.Views.ErrorView;
import es.upm.miw.klondike.Views.MenuView;

public class MoveFromWasteToFoundationController extends Controller implements MoveFromStackToStack {
	MenuView menuView;
	ErrorView errorView;
	int selector;
	protected MoveFromWasteToFoundationController(Game game) {
		super(game);
		menuView = new MenuView();	
		errorView = new ErrorView();
	}

	@Override
	public boolean canMove() {		
		selector = menuView.optionSelectorGenerator("Seleccione palo?", 4)-1;
		if(game.checkMoveWasteToFundation(game.getWasteStack(), game.getFoundationByIndex(this.selector))){
			return true;
		}else{
			errorView.render();
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(this.game.getWasteStack(), this.game.getFoundationByIndex(this.selector));
		}
		
	}

}
