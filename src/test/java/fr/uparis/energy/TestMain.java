package fr.uparis.energy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import fr.uparis.energy.Main;
public class TestMain {
    @Test
    public void testSum() {
        //assertEquals(1, 0);
        Main.main(new String[2]);
    }
}
