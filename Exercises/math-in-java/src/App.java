import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double x, y;

        // Entrada de dados
        System.out.print("Digite o valor de x: ");
        x = input.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = input.nextDouble();

        // Soma
        double result = x + y;
        System.out.println("Soma: " + result);

        // Calcular área de um circulo
        double pi = 3.14159;
        double area_one = pi * Math.pow(x, 2);
        double area_two = pi * Math.pow(y, 2);
        System.out.printf("Área do circulo de raio %.2f: %.2f%n", x, area_one);
        System.out.printf("Área do circulo de raio %.2f: %.2f%n", y, area_two);

        // mostre u mensagem final
        System.out.println("Fim do programa");
        input.close();
    }
}
