import java.util.Scanner;

public class FactorialOfANumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un número entero: ");
    int numero = scanner.nextInt();

    if (numero < 0) {
      System.out.println("El factorial no está definido para números negativos.");
      return;
    } else if (numero == 0) {
      System.out.println("El factorial no está definido para el número 0.");
      return;
    }

    long factorial = CalculateFactorial(numero);

    System.out.println("El factorial de " + numero + " es: " + factorial);

    scanner.close();
  }

  // Método para calcular el factorial de un número
  public static long CalculateFactorial(int numero) {
    long factorial = 1;
    for (int i = 1; i <= numero; i++) {
      System.out.println(factorial);
      factorial *= i;
    }
    return factorial;
  }
}
