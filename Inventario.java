import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void crearProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public boolean actualizarProducto(String codigo, Producto nuevoProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equals(codigo)) {
                productos.set(i, nuevoProducto);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
