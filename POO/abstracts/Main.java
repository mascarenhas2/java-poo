package abstracts;

public class Main {
    public static void main(String[] args) {
        
     Endereco endereco1 = new Endereco("Rua Souto Dalva", 78, "Salvador");
    
      Cliente cliente = new Cliente("Caio ", 20, endereco1); 
      
      System.out.println(cliente.toString());
      
        
     
            
    
    
}   
}