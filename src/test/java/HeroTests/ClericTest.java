package HeroTests;

import Characters.Good.Cleric;
import Characters.Good.WhiteWitch;
import Defense.DireWolf;
import Defense.IDefend;
import Healing.Herbs;
import Healing.IHeal;
import Healing.Potion;
import Magic.Freeze;
import Magic.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    IHeal herbs;

    IHeal potion;
    Cleric cleric;
    WhiteWitch witch;
    ISpell freeze;

    IDefend wolf;

    @Before
    public void before(){
        herbs = new Herbs("Milk of Poppy", 50);
        cleric = new Cleric("Stewart", 100, herbs);
        freeze = new Freeze();
        wolf = new DireWolf("Shadow");
        witch = new WhiteWitch("Lily", 40, freeze, wolf);
        potion = new Potion("Elixir", 80);

    }

    @Test
    public void hasName() {
        assertEquals("Stewart", cleric.getName());
    }

    @Test
    public void hasHealingObject() {
        assertEquals(herbs, cleric.getHealingObject());
    }

    @Test
    public void canHealPlayer() {
        cleric.heal(witch);
        assertEquals(90, witch.getPlayerHealth());
    }

    @Test
    public void canSwitchHealingObject() {
        cleric.setHealingObject(potion);
        cleric.heal(witch);
        assertEquals(120, witch.getPlayerHealth());
    }
}
