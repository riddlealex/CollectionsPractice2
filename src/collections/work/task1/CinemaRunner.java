package collections.work.task1;

public class CinemaRunner {

    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie(1, 2020, 1, "Action", 8.5));
        cinema.addMovie(new Movie(2, 2020, 3, "Comedy", 7.8));
        cinema.addMovie(new Movie(3, 2021, 2, "Drama", 9.2));
        cinema.addMovie(new Movie(4, 2021, 5, "Sci-Fi", 8.9));
        cinema.addMovie(new Movie(5, 2022, 4, "Action", 7.5));
        cinema.addMovie(new Movie(6, 2022, 1, "Thriller", 9.0));
        cinema.addMovie(new Movie(7, 2020, 12, "Comedy", 8.2));
        cinema.addMovie(new Movie(8, 2023, 10, "Horror", 7.0));
        cinema.addMovie(new Movie(9, 2021, 11, "Drama", 9.5));
        cinema.addMovie(new Movie(10, 2020, 1, "Action", 6.5));

        System.out.println("Movies from 2020: " + cinema.getMoviesByYear(2020));

        System.out.println("Movies from 2021, month 5: " + cinema.getMoviesByYearAndMonth(2021, 5));

        System.out.println("Movies from genre 'Action': " + cinema.getMoviesByGenre("Action"));

        System.out.println("Top 10 movies by rating: " + cinema.getTop10MoviesByRating());
    }
}
