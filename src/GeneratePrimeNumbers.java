import java.util.ArrayList;
import java.util.Scanner;

public class GeneratePrimeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el valor mínimo del rango: ");
    int minimo = scanner.nextInt();

    System.out.print("Ingresa el valor máximo del rango: ");
    int maximo = scanner.nextInt();

    ArrayList<Integer> primos = new ArrayList<>();

    for (int numero = minimo; numero <= maximo; numero++) {
      if (esPrimo(numero)) {
        primos.add(numero);
      }
    }

    System.out.println("Números primos en el rango [" + minimo + ", " + maximo + "]: ");
    for (int primo : primos) {
      System.out.print(primo + " ");
    }

    scanner.close();
  }

  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }
}
