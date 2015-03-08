package me.animaldevelopment.main;

import me.animaldevelopment.main.Player;

import java.util.Scanner;

public class NameSelect {
    static Player player = new Player();
    public static void select()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a name: ");
        player.setName(scanner.next());
        System.out.println("Welcome, " + player.getName() + "!");

    }
}
