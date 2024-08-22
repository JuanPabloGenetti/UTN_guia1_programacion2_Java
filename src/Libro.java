public class Libro {
    private static int nextId = 0; // Static variable to keep track of the next ID
    private int id;
    private String titulo;
    private String autor;
    private float precio;
    private int copias;

    public Libro(String titulo, String autor, float precio, int copias) {
        this.id = nextId++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;
    }

    private Libro(){
        this.id = 0;
        this.titulo = "";
        this.autor = "";
        this.precio = 0;
        this.copias = 0;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void setCopias(int copias){
        this.copias = copias;
    }

    public void getLibro(){
        System.out.println("ID: " + this.id);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: " + this.precio);
        System.out.println("Copias: " + this.copias);
    }

    public void vender(int cant){
        if(cant>=this.copias){
            this.copias -= cant;
        }else{
            System.out.println("No alcanzan las copias para realizar la venta");
    }
    }

    private void inventario(int newCopias){
        this.copias =+ newCopias;
    }



}
