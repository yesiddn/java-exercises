import java.util.Scanner;

public class IsEvenOrOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un número entero: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0) {
      System.out.println(numero + " es un número par.");
    } else {
      System.out.println(numero + " es un número impar.");
    }

    scanner.close();
  }
}
