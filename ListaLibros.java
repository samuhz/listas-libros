
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
        valor.siguiente = primero;
        primero = valor;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
        if (estaVacia()) return null;
        // Puede estar al principio
        if(primero.siguiente != null){
            if (primero.id == id) {
                if (primero.id == id ){
                Libro aux = primero;
                primero=primero.siguiente;
                return aux;    
                }
            }
        }else{
            if (primero.id == id) {
                Libro aux = primero;
                primero = null;
                return aux;    
                }
            }
        // Puede estar al final
        Libro p2 = primero;
        Libro p1 = primero.siguiente;
        while ( p1 != null) {
            // Si lo encuentro lo devuelvo y lo elimino
            if ((p1.id == id)&&(p1.siguiente == null)){
                 p2.siguiente = null;
                 return p1;
                }
            p2 = p1;
            p1 = p1.siguiente;
        }
        // Puede estar por el medio
        p2 = primero;
        p1 = primero.siguiente;
        while ( p1 != null) {
            // Si lo encuentro lo devuelvo y lo elimino
            if ( p1.id == id ){
                 p2.siguiente = p1.siguiente;
                 return p1;
                }
            p2 = p1;
            p1 = p1.siguiente;
        }
        return null;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
    Libro p1 = primero;
        while ( p1 != null) {
            // Si lo encuentro devuelvo el id
            if (p1.titulo.equals(titulo)){
                return p1.id;
            }
            p1 = p1.siguiente;
        }
    return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
        Libro p1 = primero;
        while ( p1 != null) {
            // Recorro la lista y la voy mostrando
            System.out.println(p1.toString());
            p1 = p1.siguiente;
        }
    }
}
