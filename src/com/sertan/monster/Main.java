package com.sertan.monster;

import java.util.Scanner;

import static com.sertan.monster.Colors.GREEN;
import static com.sertan.monster.Colors.RESET;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        // Instantiate Objects
        Player player = new Player(
                5,
                5,
                5,
                50,
                1,
                5
        );

        // Testing task #2
        System.out.println(player.getStrength());
        System.out.println(player.getIntelligence());
        System.out.println(player.getAgility());

        // Setters?
        player.setStrength(10);
        player.setIntelligence(10);
        player.setAgility(10);

        System.out.println(player.getStrength());
        System.out.println(player.getIntelligence());
        System.out.println(player.getAgility());

        // Health
        player.setHealth(player.getHealth() - 5 );
        // result = health - 5

        // Welcome our Player
        System.out.println(GREEN + "Welcome Adventurer" + RESET);
        System.out.println("What is your name?");
        player.setName( sc.nextLine() );
        System.out.println("Ah.. your name is: " + player.getName());

        // Menu
        do {
            System.out.println("""
                    1. Fight
                    2. Status
                    3. Exit Game
                    0. Debug Experience
                    """);
            switch (sc.nextLine()) {
                case "1" -> fightMenu(player);
                case "2" -> player.getStatus();
                case "3" -> System.exit(0);


                default -> System.out.println("Try again!");
            }
        } while (true);
    }

    public static void fightMenu(Player player) {

        Monster monster = new Monster(5,20,5);

        // Fight Menu
        do {

            System.out.println("-- -- Monster approaching -- --");
            System.out.println("Monster: " + monster.getHealth());

            System.out.println("""
                    1. Battle
                    2. Status
                    3. Flee
                    """);

            switch (sc.nextLine()) {
                case "1" -> battle(player, monster);
                case "2" -> player.getStatus();

                default -> System.out.println("Try again");
            }
        } while (true);

    }

    public static void battle(Player player, Monster monster) {
        System.out.println("Inside Battle");

        player.takeDamage(5);
        monster.takeDamage(5);

    }




}
