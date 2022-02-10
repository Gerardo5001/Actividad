
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cache {
    List<Empleado> empleados = new ArrayList<Empleado>();
    public void iniciarCache(){
        empleados.add(new Empleado("María", "González", "Reyes",new Date(1999,1,19),"El Jardín",15,"Derecha","Villahermosa","Tabasco","mariagr@hotmail.com"));
    }
    public void nuevoRegistro(Empleado usuario){
        empleados.add(usuario);
    }
    public boolean buscar(String nombre){
        for (int i = 0; i < empleados.size(); i++) {
            empleados.get(i).getNombre();
            if (empleados.get(i).getNombre() == nombre) {
            	System.out.println("Consultado desde el caché");
                empleados.get(i).mostrar();
                return true;
            }
        }
        return false;
    }

}
