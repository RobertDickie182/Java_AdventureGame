package WeaponsTest;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;
    Enemy enemy;

    @Before public void before(){
        sword = new Sword("Excalibur");
        enemy = new Orc(30);
    }

    @Test
    public void swordCanAttack(){
        sword.attack(enemy);
        assertEquals(15, enemy.getEnemyHealth());
    }
}
