package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio23 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
       
        int fichas = 100;
        String otra;

        do{
            System.out.println("Tienes" + fichas);
            System.out.println("Dime el numero que quieres apostar");
            int numeroSeleccionado = teclado.nextInt();
            System.out.println("Cuantas fichas quieres apostar");
            int fichasApostadas = teclado.nextInt();
            if (fichas < fichasApostadas) {
                System.out.println("No es valida la apuesta");

            }

            int numero0a36 = (int) (Math.random() * 37);
            System.out.println("Ha salido el " + numero0a36);    
            
                if (numeroSeleccionado == numero0a36) {
                    fichas += fichasApostadas * 35;
                }
            
            if (numeroSeleccionado != numero0a36) {
                
                fichas = fichas - fichasApostadas;
                System.out.println("No has acertado tienes " + fichas);
            }
            System.out.println("Quieres jugar otra ronda? (S | N)");
            otra = teclado.nextLine();

        } while(otra.equalsIgnoreCase("s") && fichas > 0 );
        if (otra == n) {
            
        }
    }
}
