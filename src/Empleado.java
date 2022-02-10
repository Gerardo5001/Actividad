import java.util.Date;

public class Empleado {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private EmpleadoDireccion direccion = new EmpleadoDireccion();
    private EmpleadoContacto contacto = new EmpleadoContacto();

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String calle, int numero, String colonia, 
    		String ciudad, String estado, String correo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        direccion.setColonia(colonia);
        direccion.setCiudad(ciudad);
        direccion.setEstado(estado);
        contacto.registrarCorreo(correo);
    }
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrar(){
        System.out.println(
            "Nombre: "+ nombre +"\n"+
            "Apellido paterno: "+apellidoPaterno+"\n"+
            "Apellido materno: "+apellidoMaterno+"\n"+
            "Fecha de nacimiento: "+fechaNacimiento+"\n"+
            "Calle: " + direccion.getCalle() + "\n" +
            "Número: " + direccion.getNumero() + "\n" +
            "Colonia: " + direccion.getColonia() + "\n" +
            "Ciudad: " + direccion.getCiudad() + "\n" +
            "Estado: " + direccion.getEstado() + "\n" +
            "Correo(s): "
        );
        for(String i: contacto.getCorreo()) {
        	System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
