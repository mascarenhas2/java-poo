public class Compras {
    String melancia;
    String banana;
    String morango;
    String umbu;

    public Compras(String banana, String melancia, String morango, String umbu) {
        this.banana = banana;
        this.melancia = melancia;
        this.morango = morango;
        this.umbu = umbu;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{----Compras----");
        sb.append("melancia= ").append(melancia);
        sb.append("banana= ").append(banana);
        sb.append("morango= ").append(morango);
        sb.append("umbu= ").append(umbu);
        sb.append('}');
        return sb.toString();
    }

    

}
