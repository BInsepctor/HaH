import java.util.Random;


public class Actions extends Unit {
    public static void attack(Unit attacking, Unit target) {
        int attackModificator = attacking.getAttack() - target.getArmor() + 1;
        attackModificator = Math.max(attackModificator, 1);

        Random random = new Random();
        int successfulHit = 0;
        for (int i = 0; i < attackModificator; i++) {
            int roll = random.nextInt(6) + 1;
            if (roll >= 5) {
                successfulHit++;
            }
        }
        if (successfulHit > 0) {
            int damage = random.nextInt(attacking.getDamageMax() - attacking.getDamageMin() + 1) + attacking.getDamageMin();
            target.setHealth(target.getHealth() - damage);
        }
    }
}
