package kabum;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "I5", "14mhz");

        PlacaMae placaMae = new PlacaMae("LGA1511", "Asus", "h310-m");

        Memoria memoria = new Memoria("16 gb", "4200mhz", "hyper x", "15yte");

        Dispositivo dispositivo = new Dispositivo("16gb", "usb", "FORTIGATE", "rexr");

        System.out.println(processador.toString());
        System.out.println(placaMae.toString());
        System.out.println(memoria.toString());
        System.out.println(dispositivo.toString());
    }

}
