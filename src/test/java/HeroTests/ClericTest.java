package HeroTests;

import Characters.Good.Cleric;
import Characters.Good.Knight;
import Characters.Good.WhiteWitch;
import Defense.DireWolf;
import Defense.IDefend;
import Healing.Herbs;
import Healing.IHeal;
import Magic.Freeze;
import Magic.ISpell;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;

public class ClericTest {

    IHeal herbs;
    Cleric cleric;
    WhiteWitch witch;
    ISpell freeze;

    IDefend wolf;

    @Before
    public void before(){
        herbs = new Herbs("Milk of Poppy", 50);
        cleric = new Cleric("Stewart", 100, herbs);
        freeze = new Freeze();
        wolf = new DireWolf("Shadow");
        witch = new WhiteWitch("Lily", 40, freeze, wolf);

    }

}
