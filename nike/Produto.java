package nike;

import java.util.Scanner;

class Produto {
    protected String marca;
    protected String cor;
    protected String tamanho;
    protected double preco;

 public void solicitarDados(String tipo) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("\nInforme os dados para o(a)" + tipo + ":");

     System.out.print("Marca: ");
        this.marca = scanner.nextLine();
     System.out.print("Cor: ");
        this.cor = scanner.nextLine();
     System.out.print("Tamanho: ");
        this.tamanho = scanner.nextLine();
     System.out.print("Preço: ");
        this.preco = scanner.nextDouble();


    scanner.nextLine();
 } 
  public void exibirInformacoes(String tipo) {
    System.out.println("\n" + tipo);
    System.out.println("Marca: " + marca);
    System.out.println("Cor: " + cor);
    System.out.println("Tamanho: " + tamanho);
    System.out.println("Preço: R$ " + preco);
 }

}
