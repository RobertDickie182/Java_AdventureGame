package HeroTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Characters.Good.Knight;
import Weapons.Dagger;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;
    IWeapon sword;
    IWeapon dagger;

    @Before
    public void before(){

        sword = new Sword("Excalibur");
        dagger = new Dagger("Pointy");
        enemy = new Orc(30);
        knight = new Knight("Christopher", 100, sword);

    }

    @Test
    public void hasName(){
        assertEquals("Christopher", knight.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, knight.getPlayerHealth());
    }

    @Test
    public void canAttack(){
        knight.setWeapon(sword);
        knight.attack(enemy);
        assertEquals(15, enemy.getEnemyHealth());
    }

}
