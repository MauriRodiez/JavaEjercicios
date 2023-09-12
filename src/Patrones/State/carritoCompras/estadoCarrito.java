package Patrones.State.carritoCompras;

public interface estadoCarrito {

    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void volverAlPuntoAnterior();
    void siguienteEstado();

}
