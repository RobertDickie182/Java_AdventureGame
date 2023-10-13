package HeroTests;

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
    Orc orc;

    ISpell freeze;
    ISpell flameBurst;

    IDefend direWolf;

    @Before public void before(){
        freeze = new Freeze();
        flameBurst = new FlameBurst();
        direWolf = new DireWolf("Shadow");
        orc = new Orc(50);
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
    public void canTakeDamage() {
        orc.enemyAttack(whiteWitch);
        assertEquals(80, whiteWitch.getPlayerHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(freeze, whiteWitch.getSpell());
    }

    @Test
    public void canCastSpell(){
        whiteWitch.cast(orc);
        assertEquals(30, orc.getEnemyHealth());
    }

    @Test
    public void canSwitchSpell() {
        whiteWitch.setSpell(flameBurst);
        whiteWitch.cast(orc);
        assertEquals(20, orc.getEnemyHealth());
    }

    @Test
    public void hasDefender(){
        assertEquals(direWolf, whiteWitch.getDefender());
    }

    @Test
    public void canUseDefender() {
        whiteWitch.defend(orc);
        assertEquals(30, orc.getEnemyHealth());
    }
}

