package es.upm.miw.klondike.Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Game {

	private StockStack stockStack;
	private WasteStack wasteStack;
	private ArrayList<TableauStack> tableaus;
	private ArrayList<FoundationStack> foundations;

	public Game() {

		stockStack = new StockStack();
		wasteStack = new WasteStack();

		tableaus = new ArrayList<TableauStack>();

		stacksInizialization(stockStack, tableaus);

		foundations = new ArrayList<FoundationStack>();

		for (FoundationType foundationType : FoundationType.values()) {
			foundations.add(new FoundationStack(foundationType));
		}
	}

	public void stacksInizialization(StockStack stockStack, ArrayList<TableauStack> tableauStack) {

		for (CardType cardType : CardType.values()) {
			for (int i = Card.MIN_VALUE; i <= Card.MAX_VALUE; i++) {
				stockStack.push(new Card(i, cardType));
			}
		}
		Collections.shuffle(stockStack);

		for (int i = 0; i < StockStack.NUM_TABLEAU_STACKS; i++) {
			tableauStack.add(new TableauStack());
			for (int j = 0; j < i + 1; j++) {
				tableauStack.get(i).push(stockStack.pop());
			}
			tableauStack.get(i).peek().setHidden(false);
		}

	}

	public ArrayList<TableauStack> getTableau() {
		return this.tableaus;

	}

	public StockStack getStockStack() {
		return this.stockStack;

	}

	public WasteStack getWasteStack() {
		return this.wasteStack;

	}

	public void setWasteStack(WasteStack wasteStack) {
		this.wasteStack = wasteStack;
	}

	public ArrayList<FoundationStack> getFoundation() {
		return this.foundations;

	}
	
	 public FoundationStack getFoundationByIndex(int index) {
	 	return this.foundations.get(index);
	 }
	 
	 public boolean sameFoundationType(Card card1, FoundationStack foundation){
		 if(card1.getCharCardType() == foundation.getFoundationType().toString().charAt(0)){
			 return true;
		 }else{
			 return false;
		 } 
	 }
	 
	 public boolean checkPush(int from, int to){
		 if(++from == to){
			 return true;
		 }
		return false;
	 }
	 
	 public void move(Stack<Card> from, Stack<Card> to){
		 from.peek().setHidden(false);
		 to.push(from.pop());	
	 }
	 
	 public boolean checkMoveWasteToFundation(WasteStack fromStack, FoundationStack toStack){
		 assert fromStack != null;
	     assert toStack != null;

	     if(!fromStack.isEmpty()){    	 
	    	 if(!toStack.isEmpty()){
	    		 if(this.sameFoundationType(fromStack.peek(),toStack) 
	    				 && this.checkPush(fromStack.peek().getValue(),toStack.peek().getValue())){
	    			 return true;
	    		 }else{	    				    			     			 
	    			 return false;
	    		 }	    		 
	    	 }else{
	    		 if(this.sameFoundationType(fromStack.peek(),toStack) && fromStack.peek().isAce()){	    			 
	    			 return true;
	    		 }else{
	    			 return false;	    			 
	    		 }
	    	 }	    	 
	     }else{
	    	 return false;
	    	
	     }
	     		 
	 }

}
