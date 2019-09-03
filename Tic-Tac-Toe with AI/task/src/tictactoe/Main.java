package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] chars = fillArray();
        printGame(chars);

    }
    private static char[] fillArray() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = new char[9];
        for (int i = 0; i < input.length(); i++) {
            if (i >= 1 && i < 10) {
                chars[i - 1] = input.charAt(i);
            }
        }
        return chars;
    }
    private static void printGame(char[] chars) {
        System.out.println("---------");

        System.out.println("| " + chars[0] + " " + chars[1] + " " + chars[2] + " |");

        System.out.println("| " + chars[3] + " " + chars[4] + " " + chars[5] + " |");

        System.out.println("| " + chars[6] + " " + chars[7] + " " + chars[8] + " |");

        System.out.println("---------");
    }
}

