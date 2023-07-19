public class Main {
    public static void main(String[] args) {
        CocheElectrico cocheElectrico = new CocheElectrico();
        CocheNafta cocheNafta = new CocheNafta();
        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheElectrico.maxVelocidad = 500;
        cocheElectrico.marca = "Renault";

        cocheNafta.ruedaAuxilio = true;
        cocheNafta.precio = 50000;

        cocheHibrido.modoConsumo = "Electrico";
        cocheHibrido.cantidadPuertas = 5;
    }
}