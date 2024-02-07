import java.util.Scanner;

public class PowerOfANumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa la base: ");
    double base = scanner.nextDouble();

    System.out.print("Ingresa el exponente: ");
    int exponente = scanner.nextInt();

    double resultado = Math.pow(base, exponente);

    System.out.println(base + " elevado a la " + exponente + " potencia es: " + resultado);

    scanner.close();
  }
}
