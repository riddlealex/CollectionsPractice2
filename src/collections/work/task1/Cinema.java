package collections.work.task1;

import java.util.*;

public class Cinema {

    private Map<Integer, List<Movie>> moviesByYear = new LinkedHashMap<>();

    public boolean addMovie(Movie movie) {
        if (isMoviePresent(movie)) {
            return false;
        }
        List<Movie> movies = moviesByYear.get(movie.getYear());
        if (movies == null) {
            movies = new ArrayList<>();
            moviesByYear.put(movie.getYear(), movies);
        }
        movies.add(movie);
        return true;
    }

    public boolean isMoviePresent(Movie movie) {
        for (List<Movie> movies : moviesByYear.values()) {
            for (Movie m : movies) {
                if (m.equals(movie)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Movie> getMoviesByYear(int year) {
        return moviesByYear.getOrDefault(year, Collections.emptyList());
    }

    public List<Movie> getMoviesByYearAndMonth(int year, int month) {
        List<Movie> result = new ArrayList<>();
        List<Movie> movies = moviesByYear.getOrDefault(year, Collections.emptyList());
        for (Movie movie : movies) {
            if (movie.getMonth() == month) {
                result.add(movie);
            }
        }
        return result;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        List<Movie> result = new ArrayList<>();
        for (List<Movie> movies : moviesByYear.values()) {
            for (Movie movie : movies) {
                if (movie.getGenre().equalsIgnoreCase(genre)) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public List<Movie> getTop10MoviesByRating() {
        List<Movie> allMovies = new ArrayList<>();
        for (List<Movie> movies : moviesByYear.values()) {
            allMovies.addAll(movies);
        }
        allMovies.sort(Comparator.comparing(Movie::getRating).reversed());

        List<Movie> top10Movies = new ArrayList<>();
        for(int i = 0; i< Math.min(10, allMovies.size()); i++){
            top10Movies.add(allMovies.get(i));
        }

        return top10Movies;

    }

}
