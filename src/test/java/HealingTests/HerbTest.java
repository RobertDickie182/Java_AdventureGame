package HealingTests;


import Characters.Good.Knight;
import Healing.HealingObject;
import Healing.Herbs;
import Healing.IHeal;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbTest {


  Herbs herb;

  Knight knight;

  IWeapon sword;

  @Before
    public void before(){
      herb = new Herbs("Green herb", 50);
      sword = new Sword("Fate");
      knight = new Knight("Calum", 40, sword);
  }

    @Test
    public void hasName() {
      assertEquals("Green herb", herb.getName());
    }

    @Test
    public void canHeal() {
      herb.heal(knight);
      assertEquals(90, knight.getPlayerHealth());
    }
}
