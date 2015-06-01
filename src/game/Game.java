package game;

import players.Devil;
import players.Human;

import java.util.Scanner;

public class Game {
    private boolean isNotQuited = true;
    private String enteredText = "";
    private int number;
    private boolean isNumber;
    private Scanner scanner = new Scanner(System.in);

    public void fight(Human human, Devil devil) {
        System.out.println("Human, you are in hell!\n" +
                "Enter a prime number to beat the devil." +
                "\nRemember: 666 is the devil number..." +
                "Good luck!\n");
        do {
            System.out.println("Fight! Enter a number: ");
            human.attack(enteredNumber(), devil);
            human.showCurrentHealth();
            devil.showCurrentHealth();
        } while (isNotQuited && devil.isDead() && human.isDead());
    }

    public int enteredNumber() {
        int enteredNumber = 0;
        userEntry();
        if (enteredText.equals("stop")) {
            System.out.print("\nYou have casted an armageddon! The whole world is destroyed...");
            isNotQuited = false;
        } else if (isNumber) {
            enteredNumber = number;
        } else {
            System.out.println(enteredText + " - is not a number. You must attack with numbers only!");
        }
        return enteredNumber;
    }

    private void userEntry() {
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            isNumber = true;
        } else {
            enteredText = scanner.next();
            isNumber = false;
        }
    }

}
