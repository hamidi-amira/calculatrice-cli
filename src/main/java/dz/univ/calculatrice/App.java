package dz.univ.calculatrice;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULATRICE ===");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("0. Quitter");
        System.out.print("Votre choix : ");
        
        int choix = scanner.nextInt();
        
        if (choix == 2) {
            System.out.print("Premier nombre : ");
            double a = scanner.nextDouble();
            
            System.out.print("Deuxième nombre : ");
            double b = scanner.nextDouble();
            
            SubtractOperation op = new SubtractOperation();
            double resultat = op.calculate(a, b);
            
            System.out.println("Résultat : " + resultat);
        } else if (choix == 0) {
            System.out.println("Au revoir !");
        } else {
            System.out.println("Choix invalide.");
        }
        
        scanner.close();
    }
}