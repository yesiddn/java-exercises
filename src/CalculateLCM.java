import java.util.Scanner;

public class CalculateLCM {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el primer número: ");
    int numero1 = scanner.nextInt();

    System.out.print("Ingresa el segundo número: ");
    int numero2 = scanner.nextInt();

    int mcm = calculateLCM(numero1, numero2);

    System.out.println("El mínimo común múltiplo (MCM) de " + numero1 + " y " + numero2 + " es: " + mcm);

    scanner.close();
  }

  public static int calculateLCM(int a, int b) {
    return (a * b) / CalculateMCD.calcularMCD(a, b);
  }
}
