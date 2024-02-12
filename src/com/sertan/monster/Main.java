package com.sertan.monster;

import java.util.Scanner;
import static com.sertan.monster.Colors.*;
import static com.sertan.monster.PrintUtils.*;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        // Instantiate Objects
        Player player = new Player(100, 20);

        // Welcome our Player
        System.out.println(GREEN + "Welcome to the Jungle" + RESET);
        System.out.println("What is your name?");
        player.setName( sc.nextLine() );
        System.out.println("Ah.. your name is: " + player.getName());

        // Menu
        do {
            printMainMenu();
            switch (sc.nextLine()) {
                case "1" -> fightMenu(player);
                case "2" -> player.getStatus();
                case "3" -> System.exit(0);
                default -> System.out.println("Try again!");
            }
        } while (!player.isDead());

        if (player.isDead()) {
            printGameOver();
            System.exit(0);
        }

    }

    public static void fightMenu(Player player) {
        Monster monster = new Monster(player.getLevel());
        // Fight Menu
        do {
            printNewMonster(monster, player.getLevel());
            printFightMenu();

            switch (sc.nextLine()) {
                case "1" -> battle(player, monster);
                case "2" -> player.getStatus();
                case "3" -> monster = new Monster();
                default -> System.out.println("Try again");
            }
        } while (!(monster.isDead() || player.isDead()));

    }

    public static void battle(Player player, Monster monster) {
        player.takeDamage(monster.getDamage());
        monster.takeDamage(player.getDamage());

        printBattleResult(player, monster);

        if(player.isDead() && monster.isDead()) {
            System.out.println("båda är döda");
        }
        else if(monster.isDead()) {
            System.out.println("monster är död");
            player.setLevel(player.getLevel() + 1);
        }
        else if(player.isDead()) {
            System.out.println("Du är död");
        }
    }




}
