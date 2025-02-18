package veicli;

public class Veiculo {
    private String placa;
    private String cor;
    private int numPass;
    private int capTank;
    private int velMax;
    private int conMed;
    
    public Veiculo() {
    }

    public Veiculo(String placa, String cor, int numPass, int capTank, int velMax, int conMed) {
        this.placa = placa;
        this.cor = cor;
        this.numPass = numPass;
        this.capTank = capTank;
        this.velMax = velMax;
        this.conMed = conMed;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPass() {
        return numPass;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public int getCapTank() {
        return capTank;
    }

    public void setCapTank(int capTank) {
        this.capTank = capTank;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getConMed() {
        return conMed;
    }

    public void setConMed(int conMed) {
        this.conMed = conMed;
    }

    @Override
    public String toString() {
        return "Veiculo \nplaca= " + placa + "\ncor= " + cor + "\nnumPass= " + numPass + "\ncapTank= " + capTank
                + " \nvelMax= " + velMax + " \nconMed= " + conMed + "";
    }

    
}
