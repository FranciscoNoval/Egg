
package entities;

import java.util.Comparator;

public class Film {
    private String title;
    private String director;
    private Integer length;

    public Film() {
    }

    public Film(String title, String director, Integer length) {
        this.title = title;
        this.director = director;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Film{" + "title=" + title + ", director=" + director + ", length=" + length + '}';
    }
    
}
