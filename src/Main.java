import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scannerRaio = new Scanner(System.in);

        double pi = 3.14459;
        double raio;

        System.out.println("DIGITE O VALOR DO RAIO");
        raio = scannerRaio.nextDouble();

        double area = pi * raio * 2;
        System.out.println("VALOR DA ÁREA : " + area);

        scannerRaio.close();
    }
}