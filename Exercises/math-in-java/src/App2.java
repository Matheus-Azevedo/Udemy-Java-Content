import java.util.Scanner;

public class App2 {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    
    // Declaração de variáveis
    int a, b, c, d;

    // Entrada de dados
    System.out.print("Digite o valor de a: ");
    a = input.nextInt();
    System.out.print("Digite o valor de b: ");
    b = input.nextInt();
    System.out.print("Digite o valor de c: ");
    c = input.nextInt();
    System.out.print("Digite o valor de d: ");
    d = input.nextInt();

    // DIFERENÇA = (A * B - C * D)
    int result = a * b - c * d;

    System.out.println("DIFERENÇA = " + result);


    // mostre u mensagem final
    System.out.println("Fim do programa");
    input.close();
  }
}
