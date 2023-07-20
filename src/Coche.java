abstract class Coche {
    int cantidadPuertas;
    double precio;
    String marca;
    int capacidadTanque;
    boolean ruedaAuxilio;
    String autonomia;
    int maxVelocidad;
    double duracionBateria;
    String modoConsumo;

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public double getPrecio(){
        return precio;
    }

    public String getMarca() {
        return marca;
    }
}
