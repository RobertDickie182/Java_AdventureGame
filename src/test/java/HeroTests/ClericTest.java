package HeroTests;

import Characters.Good.Cleric;
import Characters.Good.Knight;
import Healing.Herbs;
import Healing.IHeal;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;

public class ClericTest {

    IHeal herbs;

    Cleric cleric;

    IWeapon sword;

    Knight knight;


    @Before
    public void before(){
        herbs = new Herbs("Green", 40);
        cleric = new Cleric("Marlene", 100, herbs);
        sword = new Sword("Excalibur")
        knight = new Knight("Calum", 50, sword );
    }

}
