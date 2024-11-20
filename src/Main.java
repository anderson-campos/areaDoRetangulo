import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a ALTURA da area a ser calculada: ");
        int altura = scanner.nextInt();

        System.out.println("Digite a LARGURA da area a ser calculada: ");
        int largura = scanner.nextInt();

        areaRetangulo calcularAre = new areaRetangulo(altura, largura);

        System.out.println("O valor da area é de: " + calcularAre.calculo() + "m²");
    }
}