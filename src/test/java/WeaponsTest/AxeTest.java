package WeaponsTest;

import Characters.Bad.Enemy;
import Characters.Bad.Troll;
import Healing.IHeal;
import Weapons.Axe;
import Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    Troll troll;

    @Before
    public void before(){
        axe = new Axe("Lucile");
        troll = new Troll(40);
    }

    @Test
    public void canAxeAttack(){
        axe.attack(troll);
        troll.getEnemyHealth();
        assertEquals(15, troll.getEnemyHealth());
    }
}
