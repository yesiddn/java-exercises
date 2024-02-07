import java.util.Scanner;

public class PrimeNumbersInRange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el límite inferior del rango: ");
    int limiteInferior = scanner.nextInt();

    System.out.print("Ingresa el límite superior del rango: ");
    int limiteSuperior = scanner.nextInt();

    System.out.println("Números primos en el rango [" + limiteInferior + ", " + limiteSuperior + "]: ");
    for (int numero = limiteInferior; numero <= limiteSuperior; numero++) {
      if (isPrime(numero)) {
        System.out.print(numero + ", ");
      }
    }

    scanner.close();
  }

  public static boolean isPrime(int numero) {
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
