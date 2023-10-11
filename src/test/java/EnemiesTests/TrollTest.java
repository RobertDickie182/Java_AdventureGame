package EnemiesTests;

import Characters.Bad.Enemy;
import Characters.Bad.Troll;
import Characters.Good.Barbarian;
import Characters.Good.Fighter;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Fighter barbarian;
    IWeapon sword;

    @Before public void before(){
        troll = new Troll(50);
        sword = new Sword("Moonlight");
        barbarian = new Barbarian("Conan", 100, sword);
    }

    @Test
    public void hasHealth() {
        assertEquals(50, troll.getEnemyHealth());
    }

    @Test
    public void canAttack() {
        troll.attack(barbarian);
        assertEquals(75, barbarian.getPlayerHealth());
    }

    @Test
    public void canTakeDamage() {
        barbarian.attack(troll);
        assertEquals(35, troll.getEnemyHealth());
    }
}
