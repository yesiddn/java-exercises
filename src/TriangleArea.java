import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {

    Scanner Leer = new Scanner(System.in);
    System.out.println("Ingrese la base del triangulo:");
    double base = Leer.nextDouble();

    System.out.println("Ingrese la altura del triangulo:");
    double altura = Leer.nextDouble();

    double area = (base * altura) / 2;
    System.out.println("El area del triangulo con base: " + base + " y altura: " + altura + " es: " + area);
  }
}
