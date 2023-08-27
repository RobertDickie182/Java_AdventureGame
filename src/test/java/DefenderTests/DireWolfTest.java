package DefenderTests;

import Characters.Bad.Enemy;
import Characters.Bad.Troll;
import Defense.DireWolf;
import Defense.IDefend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DireWolfTest {

    IDefend direWolf;
    Enemy enemy;

    @Before
    public void before(){
        direWolf = new DireWolf("Ghost");
        enemy = new Troll(50);
    }

    @Test
    public void canDefend(){
        direWolf.defend(enemy);
        assertEquals(30, enemy.getEnemyHealth());
    }
}
