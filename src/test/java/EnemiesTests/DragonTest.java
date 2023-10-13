package EnemiesTests;

import Characters.Bad.Dragon;
import Characters.Good.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Knight knight;
    Sword sword;

    @Before
    public void before(){
        dragon = new Dragon(100);
        sword  = new Sword("Omega");
        knight = new Knight("Danny", 100, sword);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, dragon.getEnemyHealth());
    }

    @Test
    public void canTakeDamage() {
        knight.attack(dragon);
        assertEquals(85, dragon.getEnemyHealth());
    }

    @Test
    public void canAttack() {
        dragon.enemyAttack(knight);
        assertEquals(50, knight.getPlayerHealth());
    }
}
