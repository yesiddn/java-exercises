import java.util.Scanner;

public class EvenListNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el valor de N: ");
    int n = scanner.nextInt();

    System.out.println("Números pares del 1 al " + n + ": ");
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

    scanner.close();
  }
}
