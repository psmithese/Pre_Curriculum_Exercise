package UnderstandingObject;

import java.security.PublicKey;

public class Holiday {
    // properties
    String name;
    int day;
    String month;

    // Constructor
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;

    }
    //behaviour
    public void spendHoliday(){
        System.out.println("Where i spend my Holiday");
    }
 }




