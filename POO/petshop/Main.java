package petshop;

public class Main {
    public static void main(String[] args) {
        
        Pet pet1 = new Pet("Neymar", 2, "poodle");
        Cliente cliente1 = new Cliente("Mascarenhas", 21, pet1);

        System.out.println(cliente1.toString());

    }
}
