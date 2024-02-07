import java.util.Scanner;

public class FibonacciFor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el valor de N para encontrar los números de Fibonacci: ");
    int n = scanner.nextInt();

    System.out.println("Números de Fibonacci hasta el término " + n + ":");
    for (int i = 0; i < n; i++) {
      System.out.print(calculateFibonacci(i) + " ");
    }

    scanner.close();
  }

  public static int calculateFibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    int fib1 = 0, fib2 = 1, fibonacci = 0;
    for (int i = 2; i <= n; i++) {
      fibonacci = fib1 + fib2;
      fib1 = fib2;
      fib2 = fibonacci;
    }
    return fibonacci;
  }
}
