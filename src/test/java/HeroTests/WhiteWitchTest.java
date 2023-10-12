package HeroTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Characters.Good.Mage;
import Characters.Good.WhiteWitch;
import Defense.DireWolf;
import Defense.IDefend;
import Magic.FlameBurst;
import Magic.Freeze;
import Magic.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhiteWitchTest {

    Mage whiteWitch;
    Enemy enemy;

    ISpell freeze;
    ISpell flameBurst;

    IDefend direWolf;

    @Before public void before(){
        freeze = new Freeze();
        flameBurst = new FlameBurst();
        direWolf = new DireWolf("Shadow");
        enemy = new Orc(50);
        whiteWitch = new WhiteWitch("Helen", 100, freeze, direWolf);

    }

    @Test
    public void hasName(){
        assertEquals("Helen", whiteWitch.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, whiteWitch.getPlayerHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(freeze, whiteWitch.getSpell());
    }

    @Test
    public void canCastSpell(){
        whiteWitch.cast(enemy);
        assertEquals(30, enemy.getEnemyHealth());
    }

    @Test
    public void canSwitchSpell() {
        whiteWitch.setSpell(flameBurst);
        whiteWitch.cast(enemy);
        assertEquals(20, enemy.getEnemyHealth());
    }

    @Test
    public void hasDefender(){
        assertEquals(direWolf, whiteWitch.getDefender());
    }

    @Test
    public void canUseDefender() {
        whiteWitch.defend(enemy);
        assertEquals(30, enemy.getEnemyHealth());
    }
}

