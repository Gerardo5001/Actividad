public class ProgramaPrincipal {
    public static void main(String[] args) {
        EmpleadoService b = new EmpleadoService();
        
        b.llenarDB();
        b.buscar("Mar�a");
        b.buscar("Mauricio");
        b.buscar("Mauricio");
    }
}
