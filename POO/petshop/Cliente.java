package petshop;

public class Cliente {
    private String nome;
    private int idade;
    private Pet pet;
    
    public Cliente() {
    }

    public Cliente(String nome, int idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "\nnome= " + nome + 
               "\nidade= " + idade + 
               "\n ----pet----- " + pet + "";
    }

    
}
