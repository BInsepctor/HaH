import java.util.Scanner;

public class Game {
    public static void game() {
        Player player = null;
        Monster monster = null;
        int choice;
        int winnerP = 0;
        int winnerM = 0;
        int i = 1;
        int countHeal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter either 1 or 2:\n1.Play as a ready-made character\n2.Create your own character");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Enter either 1 or 2");
                scanner = new Scanner(System.in);
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player = new Player(95, 15, 30, 5, 20);
                    System.out.println("Health: " + player.getHealth());
                    break;
                case 2:
                    player = Creator.createPlayer();
                    break;
                default:
                    System.out.println("Enter either 1 or 2");

            }
        } while (choice != 1 & choice != 2);
        System.out.println("Enter either 1 or 2:\n1.Play as a ready-made monster\n2.Create your own monster");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Enter either 1 or 2");
                scanner = new Scanner(System.in);
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    monster = new Monster(95, 15, 30, 5, 20);
                    System.out.println("Health: " + monster.getHealth());
                    break;
                case 2:
                    monster = Creator.createMonster();
                    break;
                default:
                    System.out.println("Enter either 1 or 2");

            }
        } while (choice != 1 & choice != 2);
        System.out.println("Start game: ");
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            System.out.println(i + " attack:");
            Actions.attack(player, monster);
            Actions.attack(monster, player);
            if (player.getHealth() <= 0) winnerM = 1;
            if (monster.getHealth() <= 0) winnerP = 1;
            System.out.println("Player " + (player.getHealth() <= 0 ? " 0 " : player.getHealth()));
            System.out.println("Monster " + (monster.getHealth() <= 0 ? " 0 " : monster.getHealth()));
            if (countHeal < 4 && winnerM == 0 && winnerP == 0) {
                do {
                    System.out.println("Use a first aid kit:\n 1. Yes\n 2.No");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Enter either 1 or 2");
                        scanner = new Scanner(System.in);
                    }
                    choice = scanner.nextInt();
                    if (choice == 1){
                        player.heal();
                        countHeal ++;
                    }
                } while (choice != 1 & choice != 2);
            }
            i++;
        }
    }
}
