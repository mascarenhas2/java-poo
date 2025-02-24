package pessoasengracadas;

public class Cliente extends Pessoa {
    private String dataDaCompra;
    private String formadDePagamento;

    public Cliente(String dataDaCompra, String formadDePagamento) {
        this.dataDaCompra = dataDaCompra;
        this.formadDePagamento = formadDePagamento;
    }

    public Cliente(String dataDaCompra, String formadDePagamento, String idade, String nome) {
        super(idade, nome);
        this.dataDaCompra = dataDaCompra;
        this.formadDePagamento = formadDePagamento;
    }
    
    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public String getFormadDePagamento() {
        return formadDePagamento;
    }

    public void setFormadDePagamento(String formadDePagamento) {
        this.formadDePagamento = formadDePagamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCliente{");
        sb.append("\ndataDaCompra= ").append(dataDaCompra);
        sb.append("\nformadDePagamento= ").append(formadDePagamento);
        sb.append('}');
        return sb.toString();
    }

    
}   
