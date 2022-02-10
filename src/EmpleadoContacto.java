import java.util.List;
import java.util.ArrayList;

public class EmpleadoContacto {

    private List<String> correo = new ArrayList<String>();

    public EmpleadoContacto() {}

    public void registrarCorreo(String correo) {
        this.correo.add(correo);
    }

	public List<String> getCorreo() {
		return correo;
	}

	public void setCorreo(List<String> correo) {
		this.correo = correo;
	}
}
