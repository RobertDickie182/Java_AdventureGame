package DefenderTests;

import Characters.Bad.Enemy;
import Characters.Bad.Troll;
import Defense.IDefend;
import Defense.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    IDefend ogre;
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Troll(90);
        ogre = new Ogre("SamSmith");
    }

    @Test
    public void canDefend(){
        ogre.defend(enemy);
        assertEquals(40, enemy.getEnemyHealth());
    }
}
