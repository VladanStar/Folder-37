
package konverzijaprimertipova;

import java.util.Scanner;

public class KonverzijaPrimerTipova {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int broj;
        double broj2;
        int rezultat;
        System.out.println("Unesite ceo broj: " );
        broj = input.nextInt();
        double rezultat2;
        System.out.println("Konverzija int " +broj+ "u double:");
        rezultat2 = (double)(broj);
        System.out.println(rezultat2);
        System.out.println("Unesite decimalni broj: ");
        broj2 = input.nextDouble();
        System.out.println("Konverzija double "+ broj2+ " u int");
        rezultat = (int) broj2;
        System.out.println(rezultat);
    }
    
}
