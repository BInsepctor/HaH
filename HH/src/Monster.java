public class Monster extends Unit{
    public Monster(){}
    public Monster(int health,int attack, int armor, int damageMin, int damageMax) {
        setHealth(health);
        setAttack(attack);
        setArmor(armor);
        setDamageMin(damageMin);
        setDamageMax(damageMax);
    }
    public String toString(){
        return "Monster indicators:\n" + "-health: " + getHealth() + "\n-attack: " + getAttack() +
                "\n-armor: " + getArmor() + "\n-minimal damage: " + getDamageMin() + "\n-maximum damage: " + getDamageMax();
    }
}
