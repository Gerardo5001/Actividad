public class ProgramaPrincipal {
    public static void main(String[] args) {
        BaseDatos b = new BaseDatos();
        Cache c = new Cache();
        c.iniciarCache();
        b.llenarDB();
        c.buscar("Pedro");
    }
}
