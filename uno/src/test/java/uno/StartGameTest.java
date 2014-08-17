package uno;

import static org.fest.assertions.Assertions.*;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static uno.StartGame.*;
import static uno.Card.*;
import static uno.Color.*;
import static uno.CardValue.*;

public class StartGameTest {
	@Test
	public void testSunny() {
		Assertions.assertThat(startGame(0, 3, card(ONE, BLUE))).isNotNull();
		Assertions.assertThat(startGame(0, 4, card(ONE, BLUE))).isNotNull();
		Assertions.assertThat(startGame(0, 5, card(ONE, BLUE))).isNotNull();
	}
	
	@Test
	public void testNoLessThan3Players() {
		Assertions.assertThat(startGame(0, 0, card(ONE, BLUE))).isNull();
		Assertions.assertThat(startGame(0, 1, card(ONE, BLUE))).isNull();
		Assertions.assertThat(startGame(0, 2, card(ONE, BLUE))).isNull();
	}

	@Test
	public void testNoMoreThan5Players() {
		Assertions.assertThat(startGame(0, 6, card(ONE, BLUE))).isNull();
		Assertions.assertThat(startGame(0, 10, card(ONE, BLUE))).isNull();
		Assertions.assertThat(startGame(0, 15, card(ONE, BLUE))).isNull();
	}
}
