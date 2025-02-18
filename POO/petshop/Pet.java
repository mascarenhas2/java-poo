package petshop;

public class Pet {
    String nomePet;
    int idade;
    String raca;
    

    public Pet(String nomePet, int idade, String raca) {
        this.nomePet = nomePet;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "\nnomePet = " + nomePet + 
               "\nidade= " + idade + 
               "\nraca= " + raca + "";
    }

    
}
