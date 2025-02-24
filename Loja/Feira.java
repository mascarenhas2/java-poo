public class Feira {
    String estabelecimento;

    public Feira(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feira{");
        sb.append("estabelecimento=").append(estabelecimento);
        sb.append('}');
        return sb.toString();
    }
    
    

}
