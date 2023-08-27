package HeroTests;

import Characters.Bad.Enemy;
import Characters.Bad.Troll;
import Characters.Good.Barbarian;
import Weapons.Axe;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    IWeapon axe;
    IWeapon sword;
    Enemy enemy;

    @Before public void before(){
        axe = new Axe("Destiny");
        enemy = new Troll(50);
        sword = new Sword("Moonlight");
        barbarian = new Barbarian("Conan", 100, axe);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, barbarian.getPlayerHealth());
    }

    @Test
    public void canAttack(){
        barbarian.attack(enemy);
        assertEquals(25, enemy.getEnemyHealth());
    }

    @Test
    public void canSwapWeapon(){
        barbarian.setWeapon(sword);
        barbarian.attack(enemy);
        assertEquals(35, enemy.getEnemyHealth());
    }

    @Test
    public void canTakeDamage(){
        barbarian.takeDamage(20);
        assertEquals(80, barbarian.getPlayerHealth());
    }
}
