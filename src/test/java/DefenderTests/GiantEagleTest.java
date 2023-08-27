package DefenderTests;

import Characters.Bad.Dragon;
import Characters.Bad.Enemy;
import Defense.GiantEagle;
import Defense.IDefend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantEagleTest {

    IDefend giantEagle;

    Enemy enemy;

    @Before
    public void before(){
        giantEagle = new GiantEagle("Kerky");
        enemy = new Dragon(90);
    }

    @Test
    public void canDefend(){
        giantEagle.defend(enemy);
        assertEquals(40, enemy.getEnemyHealth());
    }
}
