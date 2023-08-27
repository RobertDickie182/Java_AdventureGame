package MagicTests;

import Characters.Bad.Dragon;
import Characters.Bad.Enemy;
import Healing.IHeal;
import Magic.Freeze;
import Magic.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreezeTest {

    ISpell freeze;
    Enemy enemy;

    @Before
    public void before(){
        freeze = new Freeze();
        enemy = new Dragon(90);
    }

    @Test
    public void canCastSpell(){
        freeze.cast(enemy);
        assertEquals(70, enemy.getEnemyHealth());
    }
}
