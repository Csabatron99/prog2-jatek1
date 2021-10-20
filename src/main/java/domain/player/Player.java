package domain.player;

public abstract class Player {

    private int xpToLevelUp;
    private int curentXp;
    private int hpRegen;

    public int getXpToLevelUp() {
        return xpToLevelUp;
    }

    public int getCurentXp() {
        return curentXp;
    }

    public int getHpRegen() {
        return hpRegen;
    }

    public void setXpToLevelUp(int xpToLevelUp) {
        this.xpToLevelUp = xpToLevelUp;
    }

    public void setCurentXp(int curentXp) {
        this.curentXp = curentXp;
    }

    public void setHpRegen(int hpRegen) {
        this.hpRegen = hpRegen;
    }
}
