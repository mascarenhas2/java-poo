package veicli;

public class Main {
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo("JSQ-244", "Vermelho", 4, 100, 210, 5);

        
        Cliente cliente = new Cliente("Mascarenhas", 20,40028922, "Rua souto dalva 78", 991315143);

     
        System.out.println(veiculo.toString());
        System.out.println(cliente.toString());

    }
}
