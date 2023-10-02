public class Player extends Unit{
    private int limitHealth;
    private int countHealth = 0;
    Player(){}
    Player(int health,int attack, int armor, int damageMin, int damageMax){
        setHealth(health);
        limitHealth = health;
        setAttack(attack);
        setArmor(armor);
        setDamageMin(damageMin);
        setDamageMax(damageMax);
    }
    public void heal() {
        if (getHealth() > 0 && getHealth() < limitHealth && countHealth < 4) {
            int heal = (int) (0.3 * getHealth());
            if (heal + getHealth() >= limitHealth){
                setHealth(limitHealth);
            }
            else{
                setHealth(heal + getHealth());
            }
            countHealth++;
        }
    }
    public String toString(){
        return "Monster indicators:\n" + "-health: " + getHealth() + "\n-attack: " + getAttack() +
                "\n-armor: " + getArmor() + "\n-minimal damage: " + getDamageMin() + "\n-maximum damage: " + getDamageMax();
    }

}
