package sk.model;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest {
    @org.junit.Test
    public void getName() throws Exception {

        final String name = "Ivan";

        final Player player = new Player(name, null);

        assertEquals(name, player.getName());

    }

    @org.junit.Test
    public void getFigure() throws Exception {

        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, inputValue);

        assertEquals(expectedValue, inputValue);
    }

}