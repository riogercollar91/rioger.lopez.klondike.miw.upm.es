package es.upm.miw.klondike.Views;

import java.util.ArrayList;

import es.upm.miw.klondike.Utils.IO;
import es.upm.miw.klondike.Utils.LimitedIntDialog;

public class MenuView {
	IO io = new IO();
	ArrayList<String> menu = new ArrayList<String>();
	
	public MenuView(){
		menu.add("1. Mover de baraja a descarte");
		menu.add("2. Mover de descarte a baraja");
		menu.add("3. Mover de descarte a palo");
		menu.add("4. Mover de descarte a escalera");
		menu.add("5. Mover de escalera a palo");
		menu.add("6. Mover de escalera a escalera");
		menu.add("7. Mover de palo a escalera");
		menu.add("8. Voltear en escalera");
		menu.add("9. Salir");
	}

	

	public void renderMenu() {
		for (String m : this.menu) {
			io.writeln(m);
		}
	}
	
	public int optionSelectorGenerator(String titulo, int max) {
		return new LimitedIntDialog(titulo, 1, max).read();
	}

}
