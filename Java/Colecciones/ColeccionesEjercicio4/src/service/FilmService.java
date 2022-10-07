package service;

import entities.Film;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilities.Comparators;

public class FilmService {

    Scanner leer;

    private Film createFilm() {
        leer = new Scanner(System.in).useDelimiter("\n");
        Film film = new Film();
        System.out.println("Ingrese los datos de un nueva pelicula");
        System.out.print("Titulo: ");
        film.setTitle(leer.next());
        System.out.print("Director: ");
        film.setDirector(leer.next());
        System.out.print("Duracion(en horas): ");
        film.setLength(leer.nextInt());
        return film;
    }

    public ArrayList addFilm() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Lista de Peliculas");
        ArrayList<Film> filmList = new ArrayList<>();
        int otra = 1;
        filmList.add(createFilm());
        while (otra != 2) {
            System.out.println("Quiere ingresar otra pelicula? Ingrese 1[SI] o 2[NO]");
            otra = leer.nextInt();
            if (otra == 1) {
                filmList.add(createFilm());
            } else if (otra != 1 && otra != 2) {
                System.out.println("la Opcion ingresada es incorrecta, ingresela nuevamente");
                otra = leer.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Se ha concluido la carga de peliculas");
        return filmList;
    }

    public void sortLengthMenorMayor(ArrayList<Film> filmList) {
        Collections.sort(filmList, Comparators.durationCompareMenorMayor);
    }

    public void sortLengthMayorMenor(ArrayList<Film> filmList) {
        Collections.sort(filmList, Comparators.durationCompareMenorMayor.reversed());
    }

    public void sortTitle(ArrayList<Film> filmList) {
        Collections.sort(filmList, Comparators.titleCompare);
    }

    public void sortDirector(ArrayList<Film> filmList) {
        Collections.sort(filmList, Comparators.directorCompare);
    }

    public void filmPrint(ArrayList<Film> filmList) {
        leer = new Scanner(System.in).useDelimiter("\n");
        int option = 0;
        do{
        System.out.println("");
        System.out.println("Elija el criterio de ordenacion"
                + "\n 1-Duracion de mayor a menor"
                + "\n 2-Duracion de menor a mayor"
                + "\n 3-Por titulo\n 4-Por Director");
        System.out.print("Opcion: ");
        option = leer.nextInt();
        switch(option){
            case 1: sortLengthMayorMenor(filmList);
                break;
            case 2: sortLengthMenorMayor(filmList);
                break;
            case 3: sortTitle(filmList);
                break;
           case 4: sortDirector(filmList);
                break;
           default: System.out.println("La lista de peliculas NO será ordenada");
        }
        System.out.println("");
        System.out.println("LISTA DE PELICULAS");
        System.out.println("------------------------------------------");
        for (Film film : filmList) {
            System.out.println("Titulo: " + film.getTitle().toUpperCase());
            System.out.println("Director: " + film.getDirector());
            System.out.println("Duracion: " + film.getLength());
            System.out.println("------------------------------------------");
        }
        }while(option >= 1 && option <= 4);
        
        
    }
}
