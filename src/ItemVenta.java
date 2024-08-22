public class ItemVenta {
    private static int nextId = 0;
    private int id;
    private String descripcion;
    private int cantidad;
    private double precio;

    public ItemVenta(String descripcion, int cantidad, double precio) {
        this.id = nextId++;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    private ItemVenta(){
        this.id = 0;
        this.descripcion = "";
        this.cantidad = 0;
        this.precio = 0;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void getItemVenta(){
        System.out.println("ID: " + this.id);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio: " + this.precio);
    }

    public long valorTotal(){
        long total = (long) (this.cantidad * this.precio);
        return total;
    }

    @Override
    public String toString() {
        return "ItemVenta[id=" + id +
                ", descripcion=" + descripcion +
                ", cantidad=" + cantidad +
                ", pUnitario=" + precio +
                ", pTotal=" + valorTotal() + "]";
    }




}
