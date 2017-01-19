package es.upm.miw.klondike.Controllers;

import es.upm.miw.klondike.Models.Game;
import es.upm.miw.klondike.Views.MenuView;

public class MenuController extends Controller {

	public MenuController(Game game) {
		super(game);
	}

	MenuView menuView = new MenuView();
	
	MoveFromStackToWasteController moveFromStackToWaste = new MoveFromStackToWasteController(this.game); 
	MoveFromWasteToFoundationController moveFromWasteToFoundation = new MoveFromWasteToFoundationController(this.game); 
	MoveFromWasteToTableauController moveFromWasteToTableau = new MoveFromWasteToTableauController(this.game); 

	public void optionSelector() {	
		switch (this.menuView.optionSelectorGenerator("Opcion?", 9)) {
			case 1:
				moveFromStackToWaste.move();
				break;
			case 2:
				break;
			case 3:
				moveFromWasteToFoundation.move();
				break;
			case 4:
				moveFromWasteToTableau.move();
				break;			
		}

	}

	public void renderOptions() {
		menuView.renderMenu();
		this.optionSelector();

	}

}
