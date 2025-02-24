package pessoasengracadas;

public abstract class Pessoa {
    protected String nome;
    protected String idade;

    public Pessoa(String idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa \nnome= " + nome + 
               "\nidade= " + idade + "";
    }


    
}
