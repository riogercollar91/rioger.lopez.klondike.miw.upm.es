package es.upm.miw.klondike.Models;

import java.util.Stack;

public class FoundationStack extends Stack<Card> {

	private static final long serialVersionUID = 1L;
	private FoundationType foundationType;

	public FoundationStack(FoundationType foundationType) {

		this.foundationType = foundationType;
	}

	public FoundationType getFoundationType() {
		return foundationType;
	}

}
