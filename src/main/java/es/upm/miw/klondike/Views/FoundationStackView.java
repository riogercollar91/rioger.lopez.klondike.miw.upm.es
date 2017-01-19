package es.upm.miw.klondike.Views;

import java.util.ArrayList;

import es.upm.miw.klondike.Models.FoundationStack;
import es.upm.miw.klondike.Utils.IO;

public class FoundationStackView {
	public void renderView(ArrayList<FoundationStack> foundationStack) {
		IO io = new IO();
		
		//REPETIDO
		for (int i = 0; i < foundationStack.size(); i++) {
			io.write("Palo " + foundationStack.get(i).getFoundationType() + ":");
			if(foundationStack.get(i).isEmpty()){
				io.write(" <vacio>\n");			
			}else{
				for (int j = 0; j < foundationStack.get(i).size(); j++) {
					new CardView(foundationStack.get(i).get(j)).render();
				}		
				io.write("\n");	
			}
		}

	}

}
