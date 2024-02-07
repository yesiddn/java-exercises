import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa la cantidad de elementos en la lista: ");
    int n = scanner.nextInt();

    int[] numeros = new int[n];

    System.out.println("Ingresa los números uno por uno: ");
    for (int i = 0; i < n; i++) {
      numeros[i] = scanner.nextInt();
    }

    ordenarBurbuja(numeros);

    System.out.println("Lista ordenada:");
    for (int num : numeros) {
      System.out.print(num + " ");
    }

    scanner.close();
  }

  public static void ordenarBurbuja(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}
