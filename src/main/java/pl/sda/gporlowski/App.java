package pl.sda.gporlowski;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jaki jest Twój znak zodiaku? (baran/byk/bliznieta/rak/lew/panna/waga/skorpion/strzelec/koziorozec/wodnik/ryby): ");
        String zodiackSign = scan.nextLine();
        System.out.println(Connector.getPage(zodiackSign));
    }
}
