package WeaponsTest;

import Characters.Bad.Dragon;
import Weapons.Dagger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaggerTest {

    Dagger dagger;
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(80);
        dagger = new Dagger("Pointy");
    }

    @Test
    public void daggerCanAttack(){
        dagger.attack(dragon);
        dragon.getEnemyHealth();
        assertEquals(75, dragon.getEnemyHealth());
    }
}
