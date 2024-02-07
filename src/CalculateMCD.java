import java.util.Scanner;

public class CalculateMCD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el primer número entero: ");
    int numero1 = scanner.nextInt();

    System.out.print("Ingresa el segundo número entero: ");
    int numero2 = scanner.nextInt();

    // Calcular el MCD utilizando el algoritmo de Euclides
    int mcd = calcularMCD(numero1, numero2);

    System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);

    scanner.close();
  }

  public static int calcularMCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
