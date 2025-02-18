package Itau;

public class ContaBancaria {
    String banco;
    String agencia;
    int numConta;
    String tipoCon;
    int saldoAtual;
    int limDisp;
    
    
    public ContaBancaria() {
    }
    public ContaBancaria(String banco, String agencia, int numConta, String tipoCon, int saldoAtual, int limDisp) {
        this.banco = banco;
        this.agencia = agencia;
        this.numConta = numConta;
        this.tipoCon = tipoCon;
        this.saldoAtual = saldoAtual;
        this.limDisp = limDisp;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoCon() {
        return tipoCon;
    }
    public void setTipoCon(String tipoCon) {
        this.tipoCon = tipoCon;
    }
    public int getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public int getLimDisp() {
        return limDisp;
    }
    public void setLimDisp(int limDisp) {
        this.limDisp = limDisp;
    }
    @Override
    public String toString() {
        return "\nbanco=" + banco + 
               "\nagencia=" + agencia + 
               "\nnumConta=" + numConta +
               "\ntipoCon=" + tipoCon + 
               "\nsaldoAtual=" + saldoAtual +
               "\nlimDisp=" + limDisp + "";
    }

    
}
