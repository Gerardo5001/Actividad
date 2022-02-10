import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoService {
    
    List<Empleado> empleados = new ArrayList<Empleado>();
    Cache cache = new Cache();
    
    public void llenarDB(){
        empleados.add(new Empleado("Jose", "Lopez", "Perez",new Date(1999,0,10)));
        empleados.add(new Empleado("Mario", "Lopez", "Perez",new Date(1999,0,13)));
        empleados.add(new Empleado("Alfredo", "Lopez", "Perez",new Date(1999,2,15)));
        empleados.add(new Empleado("Mauricio", "Lopez", "Perez",new Date(1999,4,17)));
        empleados.add(new Empleado("Pedro", "Lopez", "Perez",new Date(1999,1,19)));
        empleados.add(new Empleado("Álvaro", "Martínez", "Silva",new Date(1999,4,17),"El Bosque",14,"Centro","Guasave","Sinaloa","varoms@gmail.com"));
        empleados.add(new Empleado("María", "González", "Reyes",new Date(1999,1,19),"El Jardín",15,"Derecha","Villahermosa","Tabasco","mariagr@hotmail.com"));
        cache.iniciarCache();
    }
    
    public void nuevoRegistro(String nombre,String apellidoPaterno,String apellidoMatrerno,Date fechaNacimiento ){
        empleados.add(new Empleado(nombre, apellidoPaterno, apellidoMatrerno,fechaNacimiento));
    }
    
    public void buscar(String nombre){
    	if(cache.buscar(nombre)==false) {
    		buscarDB(nombre);
    	}
    
    }
    
    public void buscarDB(String nombre) {
    	for (int i = 0; i < empleados.size(); i++) {
            empleados.get(i).getNombre();
            if (empleados.get(i).getNombre() == nombre) {
                System.out.println("Consultado desde la Base de Datos");
            	empleados.get(i).mostrar();
                cache.nuevoRegistro(empleados.get(i));
            }
        }
    }
    
    
    public void imprimir() {
    	for(Empleado i:empleados) {
    		i.mostrar();
    	}
    }
    
}
