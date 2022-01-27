package Exercise1;

import java.util.Scanner;
/*
Write the algorithm on how to get to the Decagon facility from where you are.
 */
public class DirectionToDecagon {
    public static void main(String[] args){
        System.out.println("How i get to Decagon from Delta State");
        Scanner scanner = new Scanner(System.in);
        String firstBus = "From Ugbomoro Junction in Uvwie Local Government Area, " +
                "Delta State take a cab to Effurun round about.";

        String secondBus = " Enter a bus at Dofet park going to Benin, Stop at Ring Road.";

        String thirdBus = "Take a cab to Airport Junction, then take a Keke to Okhoromi Community " +
                "Stop at Ohen Junction then";

        String lastMovement = "take a bike at Ohen Junction to DECAGON INSTITUTE (EDO CAMPUS)";

        scanner.close();

        System.out.println(firstBus + secondBus + thirdBus + lastMovement);
    }
}
