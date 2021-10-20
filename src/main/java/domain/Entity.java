package domain;

public abstract class Entity {
    private String name;
    private int maxHP;
    private int currentHP;
    private int attackDamage;

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
