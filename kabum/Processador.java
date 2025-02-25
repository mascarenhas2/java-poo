package kabum;

public class Processador extends Produto {

    private String frequencia;

    public Processador(String marca,String modelo,String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador\nmarca= " + marca + 
               "\nfrequencia= " + frequencia + 
               "\nmodelo= " + modelo + "";
    }

   

    

}
