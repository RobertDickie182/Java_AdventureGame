package HeroTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Characters.Good.Mage;
import Characters.Good.Wizard;
import Defense.DireWolf;
import Defense.IDefend;
import Magic.Freeze;
import Magic.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Mage wizard;

    Enemy enemy;

    ISpell freeze;

    IDefend direWolf;

    @Before
    public void before(){
        freeze = new Freeze();
        direWolf = new DireWolf("Shadow");
        enemy = new Orc(50);
        wizard = new Wizard("Robert", 100, freeze, direWolf);

    }

    @Test
    public void hasName(){
        assertEquals("Robert", wizard.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, wizard.getPlayerHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(freeze, wizard.getSpell());
    }

    @Test
    public void canCastSpell(){
        wizard.cast(enemy);
        assertEquals(30, enemy.getEnemyHealth());
    }

    @Test
    public void hasDefender() {
        assertEquals(direWolf, wizard.getDefender());
    }

    @Test
    public void canUseDefender() {
        wizard.defend(enemy);
        assertEquals(30, enemy.getEnemyHealth());
    }
}
