// Commit
import java.util.ArrayList;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    // Declaração e objetos
    class Produto {
      String name;
      double price;
      int quantity;
    
      public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
      }
    
      public double getTotal() {
        return price * quantity;
      }
    
      @Override
      public String toString() {
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " unidades, Total: $" + String.format("%.2f", getTotal());
      }
    }
    
    // Declaração de variáveis
    char response;
    double total = 0;
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    // Entrada de dados
    System.out.print("Você deseja adicionar um produto?");
    response = input.next().charAt(0);
    while (response == 's') {
      System.out.print("Digite o nome do produto: ");
      String name = input.next();
      System.out.print("Digite o preço do produto: ");
      double price = input.nextDouble();
      System.out.print("Digite a quantidade do produto: ");
      int quantity = input.nextInt();
      Produto produto = new Produto(name, price, quantity);
      produtos.add(produto);
      System.out.print("Você deseja adicionar um produto?");
      response = input.next().charAt(0);
    }
    
    // Produtos adicionados
    System.out.println("Produtos adicionados:");
    for (Produto produto : produtos) {
      System.out.println(produto);
      total += produto.getTotal();
    }
    System.out.println("Total: $" + String.format("%.2f", total));

    // mostre u mensagem final
    System.out.println("Fim do programa");
    input.close();
  }
}
