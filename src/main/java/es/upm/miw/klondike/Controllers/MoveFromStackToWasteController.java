package es.upm.miw.klondike.Controllers;

import es.upm.miw.klondike.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.klondike.Models.Game;

public class MoveFromStackToWasteController extends Controller implements MoveFromStackToStack {
	
	protected MoveFromStackToWasteController(Game game) {
		super(game);
	
	}

	@Override
	public boolean canMove() {
		
		return false;
	}

	@Override
	public void move() {
		if (game.getStockStack().empty()) {
			System.out.print("END OF StockStack");
		} else {
			game.getWasteStack().push(game.getStockStack().pop());
			game.getWasteStack().peek().setHidden(false);
		}

	}

	

}
