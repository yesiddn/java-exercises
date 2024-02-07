import java.util.Scanner;

public class MultiplesOfANumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa la cantidad de multiplos: ");
    int n = scanner.nextInt();

    System.out.print("Ingresa el número del cual deseas encontrar múltiplos: ");
    int numero = scanner.nextInt();

    System.out.println("Múltiplos de " + numero + ":");
    for (int i = 1; i <= n; i++) {
      if (i % numero == 0) {
        System.out.print(i + ", ");
      }
    }

    scanner.close();
  }
}
