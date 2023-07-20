public class CocheElectrico extends Coche{

    public CocheElectrico(){
        this.precio = precio;
        this.marca = marca;
        this.cantidadPuertas = cantidadPuertas;
        this.autonomia = autonomia;
        this.maxVelocidad = maxVelocidad;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public int getMaxVelocidad() {
        return maxVelocidad;
    }
}
