public class Nodo {
    
    public long codigo;
    public String nombre;
    public Nodo link;
    
    public Nodo(long c, String n){
        codigo = c;
        nombre = n;
        link = null;
    }
}