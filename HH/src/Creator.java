import java.util.Scanner;

public class Creator {
    public static Player createPlayer() {
        int attack = 0;
        int armor = 0;
        int health = 0;
        int damageMin = 0;
        int damageMax = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a health indicator: ");
            if (scanner.hasNextInt()) {
                health = scanner.nextInt();
                if (health < 1) System.out.println("Health cannot be less than 1");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (health < 1);

        do {
            System.out.println("Enter the attack rate: ");
            if (scanner.hasNextInt()) {
                attack = scanner.nextInt();
                if (attack < 1 || attack > 30) System.out.println("You need to enter a number in the range 1 - 30");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (attack < 1 || attack > 30);

        do {
            System.out.println("Enter the protection indicator: ");
            if (scanner.hasNextInt()) {
                armor = scanner.nextInt();
                if (armor < 1 || armor > 30) System.out.println("You need to enter a number in the range 1 - 30");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (armor < 1 || armor > 30);

        do {
            System.out.println("Enter the lower damage value: ");
            if (scanner.hasNextInt()) {
                damageMin = scanner.nextInt();
                if (damageMin <= 0) System.out.println("Enter a number greater than 0");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (damageMin <= 0);

        do {
            System.out.println("Enter the upper damage value: ");
            if (scanner.hasNextInt()) {
                damageMax = scanner.nextInt();
                if (damageMax < damageMin) System.out.println("The upper damage value should not be less than the lower limit");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (damageMax < damageMin);

        return new Player(health, attack, armor, damageMin, damageMax);
    }
    public  static Monster createMonster() {
        int attack = 0;
        int armor = 0;
        int health = 0;
        int damageMin = 0;
        int damageMax = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a health indicator: ");
            if (scanner.hasNextInt()) {
                health = scanner.nextInt();
                if (health < 1) System.out.println("Health cannot be less than 1");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (health < 1);

        do {
            System.out.println("Enter the attack rate: ");
            if (scanner.hasNextInt()) {
                attack = scanner.nextInt();
                if (attack < 1 || attack > 30) System.out.println("You need to enter a number in the range 1 - 30");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (attack < 1 || attack > 30);

        do {
            System.out.println("Enter the protection indicator: ");
            if (scanner.hasNextInt()) {
                armor = scanner.nextInt();
                if (armor < 1 || armor > 30) System.out.println("You need to enter a number in the range 1 - 30");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (armor < 1 || armor > 30);

        do {
            System.out.println("Enter the lower damage value: ");
            if (scanner.hasNextInt()) {
                damageMin = scanner.nextInt();
                if (damageMin <= 0) System.out.println("Enter a number greater than 0");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (damageMin <= 0);

        do {
            System.out.println("Enter the upper damage value: ");
            if (scanner.hasNextInt()) {
                damageMax = scanner.nextInt();
                if (damageMax <= damageMin) System.out.println("The upper damage value should not be less than the lower limit");
            } else {
                System.out.println("Enter a number!");
                scanner = new Scanner(System.in);
            }
        } while (damageMax <= damageMin);

        return new  Monster(health, attack, armor, damageMin, damageMax);
    }
}
