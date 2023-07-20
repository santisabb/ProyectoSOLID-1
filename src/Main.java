public class Main {
    public static void main(String[] args) {
        Coche naftero = new CocheElectrico();
        CocheNafta cocheNafta = new CocheNafta();
        Coche cocheHibrido = new CocheHibrido();

        naftero.autonomia = "Buena autonomia";
        naftero.marca = "Renault";

        cocheNafta.ruedaAuxilio = true;
        cocheNafta.precio = 50000;

        cocheHibrido.modoConsumo = "Electrico";
        cocheHibrido.cantidadPuertas = 5;
    }
}