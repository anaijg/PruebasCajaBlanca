import java.util.Scanner;

public class EjemploConScanner {
    public static void main(String[] args) {
        EjemploConScanner e = new EjemploConScanner();
        int resultado = e.segundaForma();
    }
    public int segundaForma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        int suma = 0;
        int mayor, menor;
        if (a < b) {
            menor = a;
            mayor = b;
        } else {
            menor = b;
            mayor = a;
        }
        for (int i = menor; i <= mayor; i++) {
            suma = suma + i;
        }
        return suma;
    }
}
