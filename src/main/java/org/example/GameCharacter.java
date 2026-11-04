package org.example;

public class GameCharacter {

    private String name;
    private String characterClass;
    private int level;
    private int health;
    private int attackPower;
    private int gold;

    public GameCharacter(String name, String characterClass,
                         int level, int health,
                         int attackPower, int gold) {

        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return name + " | " + characterClass
                + " | Level " + level
                + " | Health: " + health
                + " | Attack: " + attackPower
                + " | Gold: " + gold;
    }
}
