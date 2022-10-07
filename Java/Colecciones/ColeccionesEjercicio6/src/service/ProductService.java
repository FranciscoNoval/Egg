/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package service;

import entities.Product;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Product productCreate() {
        Product newProduct = new Product();
        System.out.println("Ingrese con cuantos productos quiere cargar el sistema");
        System.out.print("Cantidad: ");
        int cantProduct = leer.nextInt();
        for (int i = 1; i <= cantProduct; i++) {
            System.out.println("");
            System.out.println("Producto " + i);
            System.out.print("Nombre: ");
            String name = leer.next().toUpperCase();
            System.out.print("Precio: $");
            Double price = leer.nextDouble();
            newProduct.getProductList().put(name, price);
        }
        System.out.println("");
        System.out.println("Usted ha cargado " + cantProduct + " productos");
        System.out.println("");
        System.out.println("Lista de productos ingresados");
        System.out.println("------------------------------------------");
        HashMap<String, Double> auxProduct = new HashMap(newProduct.getProductList());
        int cont = 0;
        for (Map.Entry<String, Double> entry : auxProduct.entrySet()) {
            cont++;
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(cont + ")" + key + " $" + value);
        }
        System.out.println("------------------------------------------");
        System.out.println("");
        return newProduct;
    }

    private void addProduct(Product product) {
        System.out.println("----AGREGAR PRODUCTO----");
        System.out.println("Ingrese el producto que quiere agregar");
        System.out.print("Nombre: ");
        String name = leer.next().toUpperCase();
        System.out.print("Precio: $");
        Double price = leer.nextDouble();
        if (product.getProductList().containsKey(name)) {
            System.out.println("El producto ya se encuentra en la lista");
        } else {
            product.getProductList().put(name, price);
            System.out.println("El precio del producto: " + name + ", fue agregado a la lista.");
        }
        System.out.println("");
    }

    private void changeProduct(Product product) {
        System.out.println("----MODIFICAR PRECIO DE PRODUCTO----");
        System.out.println("Ingrese el producto que quiere modificar");
        System.out.print("Nombre: ");
        String name = leer.next().toUpperCase();
        System.out.print("Nuevo precio: $");
        Double newPrice = leer.nextDouble();
        if (product.getProductList().containsKey(name)) {
            product.getProductList().replace(name, newPrice);
            System.out.println("El precio del producto: " + name + ", fue actualizado.");
        } else {
            System.out.println("El producto no fue encontrado en la lista");
        }
        System.out.println("");
    }

    private void removeProduct(Product product) {
        System.out.println("----BORRAR PRODUCTO----");
        System.out.println("Ingrese el producto que quiere borrar");
        System.out.print("Nombre: ");
        String name = leer.next().toUpperCase();
        if (product.getProductList().containsKey(name)) {
            product.getProductList().remove(name);
            System.out.println("El producto: " + name + ", fue borrado.");
        } else {
            System.out.println("El producto no fue encontrado en la lista");
        }
        System.out.println("");
    }

    private void printProduct(Product product) {
        System.out.println("----IMPRIMIR LISTA DE PRODUCTOS----");
        System.out.println("-----------------------------------");
        HashMap<String, Double> auxProduct = new HashMap(product.getProductList());
        int cont = 0;
        for (Map.Entry<String, Double> entry : auxProduct.entrySet()) {
            cont++;
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(cont + ")" + key + " $" + value);
        }
        System.out.println("-----------------------------------");
        System.out.println(product.getProductList().size() + " Productos en la lista");
        System.out.println("");
    }

    public void menu() {
        System.out.println("Bienvenido, iniciaremos el sistema de la tienda!");
        System.out.println("Cargue la lista inicial de productos");
        Product product = productCreate();
        int option;
        do {
            System.out.println("");
            System.out.println("---- MENÚ TIENDA ----");
            System.out.println("Ingrese la opción deseada "
                    + "\n 1)Agregar producto"
                    + "\n 2)Modificar precio de un producto"
                    + "\n 3)Borrar producto"
                    + "\n 4)Imprimir lista de productos"
                    + "\n 5)Salir.");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    addProduct(product);
                    break;
                case 2:
                    changeProduct(product);
                    break;
                case 3:
                    removeProduct(product);
                    break;
                case 4:
                    printProduct(product);
                    break;
                case 5:
                    System.out.println("Usted ha salido del sistema!");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                                }
        } while (option != 5);
    }
}
