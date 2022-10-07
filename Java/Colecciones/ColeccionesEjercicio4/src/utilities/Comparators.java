
package utilities;

import entities.Film;
import java.util.Comparator;

public class Comparators {

    public static Comparator<Film> durationCompareMenorMayor = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.getLength().compareTo(f2.getLength());
         }
    };
    
    public static Comparator<Film> titleCompare = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.getTitle().compareTo(f2.getTitle());
        }
        };

    public static Comparator<Film> directorCompare = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.getDirector().compareTo(f2.getDirector());
        }
        };
}
