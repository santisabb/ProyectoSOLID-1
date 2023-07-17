public class Coche {
    int cantidadPuertas;
    int precio;
    String marca;
    String modelo;
    boolean ruedaAuxilio;


    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public void setRuedaAuxilio(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }

}
