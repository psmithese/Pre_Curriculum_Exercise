package UnderstandingObject;

public class Movie {
    // properties
    String title;
    String studio;
    String rating;

    //constructor

public Movie (String title, String studio, String rating){
    this.title = title;
    this.studio = studio;
    this.rating = rating;

}
/*
 Write a second constructor for the class Movie,
 which takes a String representing the title of the movie and a String representing the studio as its arguments,
  and sets the respective class variables to these values, while the class variable rating is set to "PG".

 */
    // another constructor

public Movie(String title, String studio){
    title = title;
    studio = studio;
    rating = "PG";

}

}
