package es.upm.miw.klondike.Views;

import es.upm.miw.klondike.Utils.IO;

public class ErrorView {
	
	public void render() {
		IO io = new IO();
		io.write("Movimiento no permitido\n");
	}

}
