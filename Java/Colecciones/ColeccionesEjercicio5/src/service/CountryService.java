package service;

import entities.Country;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import utilities.Comparators;

public class CountryService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Country createCountry() {
        Country country = new Country();
        System.out.print("Ingrese el nombre de un país: ");
        country.setName(leer.next());
        return country;
    }

    private HashSet addCountry() {
        System.out.println("Crearemos Paises!");
        HashSet<Country> countryList = new HashSet();
        int otra = 1;
        Country countryAux;
        countryList.add(createCountry());
        while (otra != 2) {
            System.out.println("Quiere ingresar otro país? Ingrese 1[SI] o 2[NO]");
            otra = leer.nextInt();
            if (otra == 1) {
                countryList.add(createCountry());
            } else if (otra != 1 && otra != 2) {
                System.out.println("la Opcion ingresada es incorrecta, ingresela nuevamente");
                otra = leer.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Se ha concluido la carga de paises");
        System.out.println("");
        System.out.println("Esta es la lista de los paises ingresados");
        System.out.println("-----------------------------------------");
        for (Country country : countryList) {
            System.out.println(country.getName().toUpperCase());
        }
        System.out.println("-----------------------------------------");
        return countryList;
    }

    private void sortCountry(HashSet countryList) {
        ArrayList<Country> sortList = new ArrayList(countryList);
        sortList.sort(Comparators.alphaCountry);
        System.out.println("Esta es la lista de los paises ordenados alfabeticamente");
        System.out.println("-----------------------------------------");
        for (Country country : sortList) {
            System.out.println(country.getName().toUpperCase());
        }
        System.out.println("-----------------------------------------");
    }

    private void deleteCountry(HashSet countryList) {
        Iterator<Country> iteratorCountry = countryList.iterator();
        System.out.print("Ingrese el país: ");
        String nameCountry = leer.next();
        int cont = 0;
        while (iteratorCountry.hasNext()) {

            if (iteratorCountry.next().getName().equals(nameCountry)) {
                iteratorCountry.remove();
                System.out.println(nameCountry + " ha sido borrado!");
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El país no esta en la lista");
        }
        System.out.println("");
    }

    public void menuCountry() {
        int option = 0;
        HashSet country = addCountry();
        do {
            System.out.println("");
            System.out.println("Elija una opcion \n 1-Borrar Paises\n "
                    + "2-Ordenar Paises\n 3-Salir");
            System.out.print("Opcion: ");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    deleteCountry(country);
                    break;
                case 2:
                    sortCountry(country);
                    break;
                case 3:
                    System.out.println("Usted ha salido del programa");
                    break;
                default:
                    System.out.println("La opcion es invalida");
            }
        } while (option != 3);
        System.out.println("");

    }
}
