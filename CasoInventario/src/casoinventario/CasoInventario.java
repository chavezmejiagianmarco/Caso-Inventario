/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoinventario;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CasoInventario {
    public static void main(String[] args) {
        // Hacemos entrada de datos
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nombre del producto: ");
        String nombre_producto = scanner.nextLine();
        
        System.out.print("Cantidad en inventario: ");
        int inventario = scanner.nextInt();
        
        System.out.print("Precio del producto: ");
        double precio_producto = scanner.nextDouble();
        
        System.out.println("Tipo de producto: ");
        System.out.println("1: Productos electrónicos");
        System.out.println("2: Alimentos");
        System.out.println("3: Ropa");
        int categoria_del_producto = scanner.nextInt();


        // Calculamos el inicial del monto total
        double monto_total = inventario * precio_producto;

        // Salida de datos inicial
        System.out.println("\nResumen del inventario");
        System.out.println("Producto: " + nombre_producto);
        System.out.println("Cantidad: " + inventario);
        System.out.println("Precio unitario del producto: " + precio_producto);
        System.out.println("Monto total antes de los descuentos: " + monto_total);

        // Hacemos la aplicación de descuentos
        if (inventario > 100) {
            monto_total *= 0.8; // Descuento del 20%
            System.out.println("Se aplicó un descuento del 20%");
        } else if (inventario > 50) {
            monto_total *= 0.9; // Descuento del 10%
            System.out.println("Se aplicó un descuento del 10%");
        } else {
            System.out.println("No cumple con los requisitos para el descuento");
        }
        
        // Clasificamos los productos
        switch (categoria_del_producto) {
            case 1:
                System.out.println("Producto electrónico. Revisar garantía.");
                break;
            case 2:
                System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
                break;
            case 3:
                System.out.println("Producto de ropa. Revisar tallas disponibles.");
                break;
            default:
                System.out.println("Categoría no válida.");
                break;
        }

        // Salida de datos final
        System.out.println("Precio final: " + monto_total);
        if (monto_total > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
        
        scanner.close(); // Cierre correcto del scanner
    }
}

    
