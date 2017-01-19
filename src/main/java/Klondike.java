
import es.upm.miw.klondike.Models.Game;
import es.upm.miw.klondike.Views.GameView;

public class Klondike {
	
	public static void main(String[] args) {
		Game game = new Game();
		
	    GameView gameView  = new GameView(game);
	    gameView.renderView(game);
	}

}
