package es.upm.miw.klondike.Models;

import java.util.ArrayList;

public class MenuOption {
	
	ArrayList<String> menu = new ArrayList<String>();
	
	public MenuOption(){
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

}
