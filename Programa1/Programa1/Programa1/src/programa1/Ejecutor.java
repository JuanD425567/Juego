package programa1;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Batallas b = new Batallas();
        Guerrero g = new Guerrero("Guerrero", 10, 0.5, 1.5, 1.5, 2);
        Mago m = new Mago("Mago", 10, 0.5, 3, 1.5, 1.5);
        Arquero a = new Arquero("Arquero", 10, 0.5, 1, 2, 2);
 
        
        System.out.println("========================");
        System.out.println("ELIGE EL COMBATE");
        System.out.println("Guerrero vs Mago     [1]");
        System.out.println("Guerrero vs Arquero  [2]");
        System.out.println("Mago vs Arquero      [3]");
        System.out.println("========================");
        int op = entrada.nextInt();

        if (op == 1) {
          b.Guerrero_VS_Mago();
        }
        if (op == 2) {
            b.Guerrero_VS_Arquero();
        }
        if (op == 3) {
            b.Mago_VS_Arquero();
        }
    }
}
