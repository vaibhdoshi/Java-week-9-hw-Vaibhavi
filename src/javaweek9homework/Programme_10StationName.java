package javaweek9homework;

/**
 * Write the programme that tell you which line pass through particular stations.
 * Just use Zone 1 stations name
 */


public class Programme_10StationName {
    public static void main(String[] args) {
        String stationName[] = {"Waterloo", "Embankment", "London bridge", "Canada water"};
        String lineName[] = {"Northenline", "Jubileeline", "Bakerloo line"};
        String tubeName[][] = new String[3][3];
        tubeName[0][0] = "Northern Line";//line name
        tubeName[0][1] = "Waterloo";
        tubeName[0][2] = "London Bridge";

        tubeName[1][0] = "Jubilee line";
        tubeName[1][1] = "London Bridge";
        tubeName[1][2] = "Canada water";

        tubeName[2][0] = "Bakerloo Line";
        tubeName[2][1] = "Waterloo";
        tubeName[2][2] = "Embankment";

        for (int i = 0; i < tubeName.length; i++) {

            for (int j = 1; j < tubeName[i].length; j++) {

                if (tubeName[i][j] == stationName[2]) {
                    System.out.println(stationName[2]    +"has pass line is");
                    System.out.println(tubeName[0][0]);
                    System.out.println(tubeName[1][0]);
                }
                if (tubeName[i][j] == stationName[i]) {
                    System.out.println(stationName[i]    + "has pass line is");
                    System.out.println(tubeName[0][0]);
                    System.out.println(tubeName[2][0]);
                    break;

                }
                if (tubeName[i][j] == stationName[3]) {
                    System.out.println(stationName[3]    + "has pass line is");
                    System.out.println(tubeName[1][0]);
                    break;


                }
                if (tubeName[i][j] == stationName[1]) {
                    System.out.println(stationName[1]     + "has pass line is");
                    System.out.println(tubeName[2][0]);
                    break;


                }
            }
        }
    }
}