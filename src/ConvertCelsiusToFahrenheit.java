import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa la temperatura en grados Celsius: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = (celsius * 9/5) + 32;

    System.out.println(celsius + " grados Celsius equivale a " + fahrenheit + " grados Fahrenheit.");

    scanner.close();
  }
}
