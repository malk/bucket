package uno;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static uno.Card.*;
import static uno.Color.*;
import static uno.CardValue.*;
import static uno.StartGame.*;
import static uno.GameStartedEvent.*;
public class StateTest {

	State state;
	
	@Test
	public void testGameStart() {
		given();
		when(startGame(1, 3, card(ONE, BLUE)));
		Then(gameStarted(1, 3, card(ONE, BLUE)));
	}

	@Test
	public void testGameShouldBeStarted() {
//		given(GameStartedEvent.gameStarted(1, 3, card(ONE, BLUE)))
	}
	
	// game starts
	// game should be started
	// cant have less than 3 players
	// Use the type system to make sure your command is valid
	// then test if you can use a valdi command in the current context
		// ex: the game cannot be started twice
	// Keep topcard for apeek
	// en aggregat on veut pas se coupler aux consequences
	// process: ecotue des evene ments et emet des commandes, ne dit pas etre plsu qu'une machin a etats
		// un process peut etre la liaison entre deux bounded contexts
	// le apply est tres pauvre en code forcement
	// pas de decisins dans apply, que changement d'etat (+1 de tours, mettre derniere carte etc)
	// on sait mieux ce qu'on a fait le 11 septembre 2001 que le mardi dernier
		// car on garde les evenemetns qui passent, marquants
			// Event sourcing c'est garder les evenements noitoires
	// Votre domaine ne change que avec une raison
	
	// Finalement la plupart de notre code n'est que modeliser le domaine e executer le domaine
	// lire l'article de martinfowler sur eventsourcing
	
	// si la regle change, les evenenmnts avant date X sont dans une ancienne regle
	// si changement de donnes: adaptateur dans le deserialisateur poru toujorus les avori a jour
	// En cas de bug hsitorique: compensation (on ne reecrit pas l'histoire, on cree des nouveax evenements qui corrigent la valeur apres elles)

	// les contables on compris le stream d'evenment: on fait des exercices
		// on taille notre strem en taille arbitraire
		// on finit a la fin de cet exercice, on compte la fin
		// on garde/corrige pur l'exercice suivant et on ferme
		// Chercher dans le domaine de la taille de son exercice
			// Evitez l'infini
				// les metiers papiers avaient tous des exercices
					// les nouveaux metiers nueriques pas toujours: faut trouver
	
	// handler
		// tnat qu'on a pas assez d'eenemetn pour justifier une autre strategie: on papply sur tous
	
	
	// etat empty!
	
	
	// Merge business
		// Deux evenements essaeent de louer la même chambre, un payant 100 euros, l'autre a 2000
			// je laisse les deux se clasher, et je dis au business de se debrouiller
	private void Then(Event... events) {
		Assertions.assertThat(state).isEqualTo(State.state(Arrays.asList(events)));
	}

	private void when(Command command) {
//		state.decide(command);
	}

	private void given(Event... events) {
		state = new State(Arrays.asList(events));
	}
}
