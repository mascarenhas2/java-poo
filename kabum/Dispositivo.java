package kabum;

public class Dispositivo extends Produto{

    private String capArmazenamento;
    private String tipoConexao;

    public Dispositivo(String capArmazenamento, String tipoConexao, String marca, String modelo) {
        super(marca, modelo);
        this.capArmazenamento = capArmazenamento;
        this.tipoConexao = tipoConexao;
    }

    public String getCapArmazenamento() {
        return capArmazenamento;
    }

    public void setCapArmazenamento(String capArmazenamento) {
        this.capArmazenamento = capArmazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "Dispositivo \nmarca= " + marca + 
               "\n capArmazenamento= " + capArmazenamento + 
               "\n modelo= " + modelo + 
               "\ntipoConexao=" + tipoConexao + "";
    }


    
}
