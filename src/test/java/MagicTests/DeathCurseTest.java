package MagicTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Magic.DeathCurse;
import Magic.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeathCurseTest {

    ISpell deathCurse;
    Enemy enemy;

    @Before
    public void before(){
        deathCurse = new DeathCurse();
        enemy = new Orc(50);
    }

    @Test
    public void canCastSpell(){
        deathCurse.cast(enemy);
        assertEquals(0, enemy.getEnemyHealth());
    }
}
