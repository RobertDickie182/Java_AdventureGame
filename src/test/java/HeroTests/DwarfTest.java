package HeroTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Characters.Good.Dwarf;
import Weapons.Axe;
import Weapons.Dagger;
import Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemy enemy;
    IWeapon axe;
    IWeapon dagger;

    @Before
    public void before() {
        enemy = new Orc(40);
        axe = new Axe("Cutty");
        dagger = new Dagger("Needle");
        dwarf = new Dwarf("Gimli", 100, axe);

    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, dwarf.getPlayerHealth());
    }

    @Test
    public void canAttack(){
        dwarf.attack(enemy);
        assertEquals(15, enemy.getEnemyHealth());
    }

    @Test
    public void canSwapWeapon(){
        dwarf.setWeapon(dagger);
        dwarf.attack(enemy);
        assertEquals(35, enemy.getEnemyHealth());
    }

    @Test
    public void canTakeDamage(){
        dwarf.takeDamage(20);
        assertEquals(80, dwarf.getPlayerHealth());
    }

}
