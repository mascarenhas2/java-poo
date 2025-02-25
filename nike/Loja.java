package nike;

public class Loja {
    public static void main(String[] args) {
        Camisa camisa = new Camisa();
        Calca calca = new Calca();
        Sapato sapato = new Sapato();

        System.out.println("\nInformações dos produtos cadastrados:");
        camisa.exibirInformacoes("Camisa");
        calca.exibirInformacoes("Calça");
        sapato.exibirInformacoes("Sapato");
    }
}