
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class NetflixQueue {

	public static void main(String[] args) {
		
		NetflixQueue nq = new NetflixQueue();
		String mov2 = "Jurassic World";
		String mov3 = "SlenderMan";

		String mov4 = "Robin Hood";
		String mov5 = "The Lego Movie";
		Movie m = new Movie("Boss Baby", 2);
		Movie m1 = new Movie(mov2, 4);
		Movie m2 = new Movie(mov3, 5);
		Movie m3 = new Movie(mov4, 1);
		Movie m4 = new Movie(mov5, 3);
nq.addMovie(m);
nq.addMovie(m1);
nq.addMovie(m2);
nq.addMovie(m3);
nq.addMovie(m4);
m1.getTicketPrice();
 Movie best = nq.getBestMovie();
 JOptionPane.showMessageDialog(null, "The best movie is "+ best );
 JOptionPane.showMessageDialog(null, "The best movie is "+ best );


nq.sortMoviesByRating();
	}

	ArrayList<Movie> movies = new ArrayList<Movie>();

	public Movie getBestMovie() {
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public Movie getMovie(int movieNumber) {
		if (movieNumber < movies.size())
			return movies.get(movieNumber);
		else
			System.err.println(
					"That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}

	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}

}
