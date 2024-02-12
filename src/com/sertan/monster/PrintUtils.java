package com.sertan.monster;

public class PrintUtils extends Colors {

    private static void clear() {
        System.out.println();
        System.out.println();
    }

    public static void printBattleResult(Player player, Monster monster) {
        clear();
        System.out.println(BLUE + "-- -- Battle result -- -- " + RESET);
        System.out.printf(GREEN + "Player health: %d %n" + RESET, player.getHealth());
        System.out.printf(RED + "Monster health: %d %n" + RESET, monster.getHealth());
    }

    public static void printNewMonster(Monster monster, int level) {
        clear();
        System.out.println("-- -- (Level: " + level + ") Monster approaching -- --");
        monster.getStatus();
    }

    public static void printStatus(int health, int damage) {
        System.out.printf("Health: %d %n", health);
        System.out.printf("Damage: %d %n", damage);
        clear();
    }

    public static void printMainMenu() {
        clear();
        System.out.println("-- -- Main menu -- -- ");
        System.out.println("1. Fight new monster");
        System.out.println("2. Check my status");
        System.out.println("3. Exit Game");
    }

    public static void printFightMenu() {
        System.out.println("-- -- Fight menu -- -- ");
        System.out.println("1. Battle the monster");
        System.out.println("2. Check my status");
        System.out.println("3. Flee (bring me a new monster)");
    }

    public static void printGameOver() {
        clear();
        clear();
        clear();
        clear();
        clear();
        System.out.println(RED + "===================== " + RESET);
        System.out.println(RED + "===== GAME OVER ===== " + RESET);
        System.out.println(RED + "===================== " + RESET);
    }

}
