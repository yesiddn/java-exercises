import java.util.Scanner;

public class SumNaturalNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el valor de N: ");
    int n = scanner.nextInt();

    int suma = calculateSumNaturalNumbers(n);

    // Mostrar el resultado
    System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);

    scanner.close();
  }

  public static int calculateSumNaturalNumbers(int n) {
    return n * (n + 1) / 2;
  }
}
