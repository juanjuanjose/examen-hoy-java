import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear producto");
            System.out.println("2. Buscar producto por código");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Listar productos");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese descripción: ");
                    String descripcion = scanner.nextLine();

                    Producto nuevoProducto = new Producto(cantidad, codigo, nombre, descripcion);
                    inventario.crearProducto(nuevoProducto);
                    break;

                case 2:
                    System.out.print("Ingrese código del producto a buscar: ");
                    codigo = scanner.nextLine();
                    Producto productoBuscado = inventario.buscarProductoPorCodigo(codigo);
                    if (productoBuscado != null) {
                        System.out.println("Producto encontrado: " + productoBuscado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese código del producto a actualizar: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingrese nueva cantidad: ");
                    cantidad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nuevo nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva descripción: ");
                    descripcion = scanner.nextLine();

                    Producto productoActualizado = new Producto(cantidad, codigo, nombre, descripcion);
                    boolean actualizado = inventario.actualizarProducto(codigo, productoActualizado);
                    if (actualizado) {
                        System.out.println("Producto actualizado exitosamente.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese código del producto a eliminar: ");
                    codigo = scanner.nextLine();
                    boolean eliminado = inventario.eliminarProducto(codigo);
                    if (eliminado) {
                        System.out.println("Producto eliminado exitosamente.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    inventario.listarProductos();
                    break;

                case 6:
                    System.out.println("Hasta la proximaaa{ ");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
