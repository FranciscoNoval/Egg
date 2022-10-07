
package utilities;

import entities.Country;
import java.util.Comparator;

public class Comparators {
    
    public static Comparator<Country> alphaCountry  = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c1.getName().compareTo(c2.getName());
         }
    };
    
}
