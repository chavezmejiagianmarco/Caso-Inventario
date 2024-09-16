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

        