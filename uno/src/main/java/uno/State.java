package uno;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

public class State {
	private List<Event> eventSource;

	public State(List<Event> initialEventSource) {
		eventSource = (initialEventSource == null) ? Collections.EMPTY_LIST : initialEventSource;
	}

	//FIXME instanceOf is evil!!!!
	public Event decide(StartGame startGame) {
		return GameStartedEvent.gameStarted(
					startGame.getId(),
					startGame.getPlayerCount(),
					startGame.getFirstCard());
	}
	public Event decide(PlayCard playCard) {
		return null;
	}
	
	public State apply(Event event) {
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((eventSource == null) ? 0 : eventSource.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if(eventSource.size() != other.eventSource.size()) {
			return false;
		}
		for (int i = 0; i < eventSource.size(); i++) {
			if (! eventSource.get(i).equals(other.eventSource.get(i)))
				return false;
		}
		return true;
	}
	
	
	// given Liste d'evenements du passé
	// When Une commande
	// Expect Liste d'evenments resultat
	// Given saves a list of events
	// When gives a Command , folds and apply command over the list 
	// Then compares the produced list with the expected list
}
