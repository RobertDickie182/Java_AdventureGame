package Characters.Good;

import Characters.Bad.Enemy;
import Weapons.IWeapon;

public abstract class Player {

    private String name;

    private int playerHealth;

    public Player(String name, int playerHealth) {
        this.name = name;
        this.playerHealth = playerHealth;
    }

    public String getName() {
        return name;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damagePoints){
        this.playerHealth -= damagePoints;
    }

}
