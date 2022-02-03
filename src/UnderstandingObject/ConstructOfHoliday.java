package UnderstandingObject;

public class ConstructOfHoliday {
    public static void main(String[] args) {
        Holiday firstHoliday = new Holiday("Canada", 12, "February");
        Holiday secondHoliday = new Holiday("Australia", 34, "March");
        Holiday freeDomDay = new Holiday("Independence", 4, "July");


        // I am calling the function or method(isSameMonth)

        boolean result = isSameMonth(firstHoliday, secondHoliday);
        System.out.println(result);

        // I am calling the method (avgGate)

        int [] holiday = {12,34};
        double outcome = avgGate(holiday);
        System.out.println(outcome);

        System.out.println(freeDomDay);
        System.out.println(freeDomDay.name + " " + freeDomDay.day + " " + freeDomDay.month);
    }
    /*
        Write a method inSameMonth, which compares two instances of the class Holiday,
        and returns the Boolean value true if they have the same month, and false if they do not.

     */
    public static boolean isSameMonth(Holiday firstObject, Holiday secondObject) {
        if (firstObject.month == secondObject.month) {
            return true;
        } else {
            return false;
        }

    }

    public static double avgGate(int[] holiday) {
        /*
             Write a method avgDate which takes an array of base type Holiday as its argument,
              and returns a double that is the average of the day variables
               in the Holiday instances in the array.
               You may assume that the array is full (i.e. does not have any null entries).

         */
        int divisor = holiday.length;
        int startDay = 0;
        for (int i : holiday) {
            startDay += i;
//            System.out.println(startDay);
        }
        return startDay / divisor;
    }

}

