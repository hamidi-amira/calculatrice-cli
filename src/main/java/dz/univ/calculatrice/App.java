package dz.univ.calculatrice;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean continuer = true;

    System.out.println("=== CALCULATRICE ===");

    while (continuer) {
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("0. Quitter");
        System.out.print("Votre choix : ");
        
        int choix = scanner.nextInt();

        if (choix == 0) {
            continuer = false;
            System.out.println("Au revoir !");
        } 
        else if (choix == 1 || choix == 2) {
            System.out.print("Premier nombre : ");
            double a = scanner.nextDouble();
            System.out.print("Deuxième nombre : ");
            double b = scanner.nextDouble();
            
            Operation op = null;
            
            if (choix == 1) {
                op = new AddOperation();
            } else if (choix == 2) {
                op = new SubtractOperation(); 
            }
            
            if (op != null) {
                double resultat = op.calculer(a, b);
                System.out.println("Résultat : " + resultat);
            }
        } 
        else {
            System.out.println("Choix invalide. Veuillez réessayer.");
        }
        System.out.println(); // Saut de ligne pour la lisibilité
    }
    
    scanner.close();
}
}
