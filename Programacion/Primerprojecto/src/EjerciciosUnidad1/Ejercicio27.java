package EjerciciosUnidad1;
import java.util.*;

public class Ejercicio27 {

    static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        System.out.println("Dame una frase: ");
        String frase = teclado.nextLine();
        System.out.println("Vocal de la frase: ");
        String vocal = teclado.nextLine();

        
        
        String resusltadoA = frase.replace("a", vocal);
        String resultadoE = resusltadoA.replace("e", vocal);
        String resusltadoI = resultadoE.replace("i", vocal);
        String resultadoO = resusltadoI.replace("o", vocal);
        String resusltadoU = resultadoO.replace("u", vocal);
        
        System.out.println("Tu frase es " + resusltadoU);   



    }
}

