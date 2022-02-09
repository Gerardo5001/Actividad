
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseDatos {
    
    List<Usuario> usuarios = new ArrayList<Usuario>();
    public void llenarDB(){
        usuarios.add(new Usuario("Jose", "Lopez", "Perez",new Date(1999,0,10)));
        usuarios.add(new Usuario("Mario", "Lopez", "Perez",new Date(1999,0,13)));
        usuarios.add(new Usuario("Alfredo", "Lopez", "Perez",new Date(1999,2,15)));
        usuarios.add(new Usuario("Mauricio", "Lopez", "Perez",new Date(1999,4,17)));
        usuarios.add(new Usuario("Pedro", "Lopez", "Perez",new Date(1999,1,19)));
    }
    
    public void nuevoRegistro(String nombre,String apellidoPaterno,String apellidoMatrerno,Date fechaNacimiento ){
        usuarios.add(new Usuario(nombre, apellidoPaterno, apellidoMatrerno,fechaNacimiento));
    }
    
    public void buscar(String nombre){
        System.out.println("Paso por aqui");
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).getNombre();
            if (usuarios.get(i).getNombre() == nombre) {
                usuarios.get(i).mostrar();
                Cache cache = new Cache();
                cache.nuevoRegistro(usuarios.get(i));
            }
        }
    
    }
    
}
