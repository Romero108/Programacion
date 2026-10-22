    package EjercicioU3;

    import java.util.Locale;
    import java.util.Scanner;

    class Ejercicio11 {

    static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        public static void main(String[] args) {

            System.out.println("Dame un numero");
            int numero = teclado.nextInt();
            int resultado = 1;



            for (int cont = 1; cont <= numero; cont++){
                resultado = resultado * cont;
            
            }
            
            System.out.println(resultado);






        }
    }