
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cache {
    List<Usuario> usuarios = new ArrayList<Usuario>();
    public void iniciarCache(){
        usuarios.add(new Usuario("Pedro", "Lopez", "Perez",new Date(1999,1,19)));
    }
    public void nuevoRegistro(Usuario usuario){
        usuarios.add(usuario);
    }
    public void buscar(String nombre){
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).getNombre();
            if (usuarios.get(i).getNombre() == nombre) {
                usuarios.get(i).mostrar();
                return;
            }
        }
        BaseDatos b = new BaseDatos();
        b.buscar(nombre);
    }

}
