abstract class Coche implements Acelerar{
    int cantidadPuertas;
    double precio;
    String marca;
    int capacidadTanque;
    boolean ruedaAuxilio;
    String autonomia;
    int maxVelocidad;
    double duracionBateria;
    String modoConsumo;
    int velocidad = 0;

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
