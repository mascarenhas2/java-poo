package Itau;

public class Main {
public static void main(String[] args) {
    
ContaBancaria contaBanco1 = new ContaBancaria("Itau", "199-7", 12334, "Poupanca", 500, 760);

Funcionario funcionario1 = new Funcionario("13868", "Mascarenhas", "Rua Souto Dalva 78", 40028922, "caiovin56@gmail.com", contaBanco1);

System.out.println(funcionario1.toString());
}
}
