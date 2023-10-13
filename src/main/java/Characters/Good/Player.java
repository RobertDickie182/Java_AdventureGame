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

    public String takeDamage(int damagePoints){
        this.playerHealth -= damagePoints;
        if (this.playerHealth <= 0) {
            return "Your hero is dead!";
        }
        return "Your hero has taken damage";
    }

    public void playerHeal(int healingValue){
        this.playerHealth += healingValue;
    }

}
