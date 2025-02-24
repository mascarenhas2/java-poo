package pessoasengracadas;

public class Main {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente("23232", "224242", "23241", "Caio");
    Funcionario funcionario1 = new Funcionario("142", "Caio", "21412354", "estudante", 456);
    
    System.out.println(cliente1.toString());
    System.out.println(funcionario1.toString());
}
}
