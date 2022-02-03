package UnderstandingObject;

public class ConstructionOfMovie {
    public static void main(String[] args) {

        Movie newMovie = new Movie("Casino Royale", "Eon Productions", "PG-13");


        System.out.println(newMovie);
        System.out.println(newMovie.title + " " + newMovie.studio + " " + newMovie.rating);

    }
    //

}