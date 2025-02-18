public class MainCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        
        cliente1.setNome("Maria");
        cliente1.setEmail("karol@gmail.com");
        cliente1.setSenha(123);
    
        
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Senha: " + cliente1.getSenha());
    
        Cliente cliente2 = new Cliente("Mascarenhas", "caiovin56@gmail.com", 123);
        System.out.println(cliente2.toString());
    
      }
}
