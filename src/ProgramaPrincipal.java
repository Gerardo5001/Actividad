public class ProgramaPrincipal {
    public static void main(String[] args) {
        Cache c = new Cache();
        c.llenarDB();
        c.buscar("Mauricio");
    }
    
}
