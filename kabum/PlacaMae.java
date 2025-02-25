package kabum;

public class PlacaMae extends Produto {
    private String soquete;

    public PlacaMae(String soquete, String marca, String modelo) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae\n marca= " + marca + 
               "\nsoquete= " + soquete + 
               "\nmodelo= " + modelo + "";
    }

    

}
