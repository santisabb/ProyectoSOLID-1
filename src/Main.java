public class Main {
    public static void main(String[] args) {
        Coche electrico = new CocheElectrico();
        CocheNafta cocheNafta = new CocheNafta();
        Coche cocheHibrido = new CocheHibrido();

        electrico.autonomia = "Buena autonomia";
        electrico.marca = "Renault";
        electrico.aumentoVelocidad();
        electrico.consumoNafta();
        System.out.println("ERROR: Un auto electrico no puede consumir nafta");

        cocheNafta.ruedaAuxilio = true;
        cocheNafta.precio = 50000;
        System.out.println(cocheNafta.porcentajeBateria());

        cocheHibrido.modoConsumo = "Electrico";
        cocheHibrido.cantidadPuertas = 5;
    }
}