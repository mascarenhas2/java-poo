package kabum;

public class Memoria extends Produto {

        private String capArmazenamento;
        private String freq;

    public Memoria(String capArmazenamento, String freq, String marca, String modelo) {
        super(marca, modelo);
        this.capArmazenamento = capArmazenamento;
        this.freq = freq;
    }

    public String getCapArmazenamento() {
        return capArmazenamento;
    }

    public void setCapArmazenamento(String capArmazenamento) {
        this.capArmazenamento = capArmazenamento;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Memoria\n marca= " + marca + 
               "\ncapArmazenamento= " + capArmazenamento + 
               "\nmodelo= " + modelo + 
               "\nfreq= " + freq + "";
    }
        


}
