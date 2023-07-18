import java.util.ArrayList;

public class CochesBD {
    ArrayList<Coche> listaCoches = new ArrayList();

    public void agregarCoche(Coche coche){
        listaCoches.add(coche);
    }

    public void mostrarLista(){
        for (int i = 0; i < listaCoches.size() ; i++){
            System.out.println("Datos del coches numero " + i + ": " + listaCoches.get(i).marca);
        }
    }
}
