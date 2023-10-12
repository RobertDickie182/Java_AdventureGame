package HealingTests;

import Characters.Good.Dwarf;
import Healing.Potion;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;

    Dwarf dwarf;

    Axe axe;

    @Before
    public void before(){
        potion = new Potion("Elixir", 80);
        axe = new Axe("Bane");
        dwarf = new Dwarf("Yilmaz", 10, axe);
    }

    @Test
    public void hasName() {
        assertEquals("Elixir", potion.getName());
    }

    @Test
    public void canHeal() {
        potion.heal(dwarf);
        assertEquals(90, dwarf.getPlayerHealth());
    }
}
