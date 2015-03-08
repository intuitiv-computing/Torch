package me.carbonstudios.main;

import static java.lang.System.out;

import java.util.Scanner;

public class Main {
    Player player = new Player();
    static NameSelect nameSelect = new NameSelect();
    public static void main(String[] args) {
        out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        out.println("           Cluiche           ");
        out.println("     A Carbon Studios Game   ");
        out.println("    Press ENTER to continue  ");
        out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        Scanner keyIn = new Scanner(System.in);
        keyIn.nextLine();
        keyIn.nextLine();
        selectName();

    }
    public static void selectName()
    {
        nameSelect.select();
    }

}
