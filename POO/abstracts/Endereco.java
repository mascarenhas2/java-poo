package abstracts;

public class Endereco {

    String Logradouro;
    int numero;
    String cidade;

    public Endereco(String logradouro, int numero, String cidade) {
        Logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }
    public String getLogradouro() {
        return Logradouro;
    }
    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return "\nLogradouro= " + Logradouro + 
               "\nnumero= " + numero + 
               "\ncidade= "  + cidade + "";
    }

    

}
