package dz.univ.calculatrice;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("=== CALCULATRICE ===");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            
            int choix = scanner.nextInt();

            if (choix == 0) {
                continuer = false;
                System.out.println("Au revoir !");
            } else if (choix == 1 || choix == 2) {
                System.out.print("Premier nombre : ");
                double a = scanner.nextDouble();
                System.out.print("Deuxième nombre : ");
                double b = scanner.nextDouble();

                if (choix == 1) {
                    AddOperation op = new AddOperation();
                    System.out.println("Résultat : " + op.calculer(a, b));
                } else {
                    SubtractOperation op = new SubtractOperation();
                    System.out.println("Résultat : " + op.calculer(a, b));
                }
            } else {
                System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }
}