public class Main {
    public static void main(String[] args) {
        Coche electrico = new CocheElectrico();
        CocheNafta cocheNafta = new CocheNafta();
        Coche cocheHibrido = new CocheHibrido();

        electrico.autonomia = "Buena autonomia";
        electrico.marca = "Renault";
        electrico.aumentoVelocidad();

        cocheNafta.ruedaAuxilio = true;
        cocheNafta.precio = 50000;
        cocheNafta.aumentoVelocidad();

        cocheHibrido.modoConsumo = "Electrico";
        cocheHibrido.cantidadPuertas = 5;
        cocheHibrido.aumentoVelocidad();
    }
}