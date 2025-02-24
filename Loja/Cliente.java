public class Cliente {
    private String nome;
    private String cpf;
    private String valor;
    private Compras compras;
    private Feira feira;

    public Cliente() {
    }

    public Cliente(Compras compras, String cpf, Feira feira, String nome, String valor) {
        this.compras = compras;
        this.cpf = cpf;
        this.feira = feira;
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Feira getFeira() {
        return feira;
    }

    public void setFeira(Feira feira) {
        this.feira = feira;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nome=").append(nome);
        sb.append("cpf=").append(cpf);
        sb.append("valor=").append(valor);
        sb.append("compras=").append(compras);
        sb.append("feira=").append(feira);
        sb.append('}');
        return sb.toString();
    }

    
    
    }


    


    


