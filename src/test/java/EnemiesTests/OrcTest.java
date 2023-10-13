package EnemiesTests;

import Characters.Bad.Orc;
import Characters.Good.Dwarf;
import Weapons.Axe;
import Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Dwarf dwarf;
    IWeapon axe;

    @Before
    public void before(){
        orc = new Orc(80);
        axe = new Axe("Chopper");
        dwarf = new Dwarf("Coops", 100, axe);
    }

    @Test
    public void hasHealth() {
        assertEquals(80, orc.getEnemyHealth());
    }

    @Test
    public void canTakeDamage() {
        dwarf.attack(orc);
        assertEquals(55, orc.getEnemyHealth());
    }

    @Test
    public void canAttack() {
        orc.enemyAttack(dwarf);
        assertEquals(80, dwarf.getPlayerHealth());
    }
}
