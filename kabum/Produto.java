package kabum;

public abstract class Produto {
    protected String marca;
    protected String modelo;

    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("\nmarca= ").append(marca);
        sb.append("\nmodelo= ").append(modelo);
        sb.append('}');
        return sb.toString();
    }


}
