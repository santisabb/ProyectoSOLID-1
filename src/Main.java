public class Main {
    public static void main(String[] args) {
        //Aplicar el principio S de S.O.L.I.D.
        //Se trata del principio de responsibalidad unica.
        //Cada clase realizara una unica tarea.
        CocheElectrico coche1 = new CocheElectrico();
        CocheNafta coche2 = new CocheNafta();
        CocheHibrido coche3 = new CocheHibrido();
        coche1.setPrecio(50000);
        coche1.setMarca("Renault");
        coche1.setModelo("Zoe");
        coche1.setCantidadPuertas(3);
        coche1.setRuedaAuxilio(false);
        coche1.setAutonomia("580 kilometros");
        coche1.setCapacidadBateria(39.22);
        if(coche1.isRuedaAuxilio()) {
            System.out.println("Tiene 2 ruedas de repuesto");
        } else {
            System.out.println("No tiene ruedas de auxilio, se recomienda que tenga al menos una");
        }
    }
}