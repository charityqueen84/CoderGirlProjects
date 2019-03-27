package com.company;

public class Temperatures {

    public static void main(String[] args) {
        System.out.println("Temperature Calculator");
        System.out.println("The data provided are: ");
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        for (int row = 0; row < 4; row++) {
            String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
            System.out.print(times[row] + " ");
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Based on that data, the following are the average temperatures for the week.");

        int sum = 0;
        for (int column = 0; column < temps.length; column++) {
            for (int row = 0; row < temps.length; row++) {
                for (column = 0; column < temps.length; column++) {
                    sum += (temps[row][column]);
                    


                }
                int average = sum / temps.length;
                System.out.println(average);

            }
            for (column = 0; column < temps.length; column++) {
                String[] days = {"Sun ", "Mon ", "Tue ", "Wed ", "Thu ", "Fri ", "Sat "};
                System.out.print(days[column]);
                sum = 0;

                for (int row = 0; column < temps.length; column++) {
                    sum += (temps[column][row]);

                }
                int average = sum / temps.length;
                System.out.println(average);

            }

            for (int row = 0; row < temps.length; row++) {
                String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
                System.out.print(times[row]);
                sum = 0;


                for (column = 0; column < temps.length; column++) {
                    sum += (temps[row][column]);
                }
                int average = sum / temps.length;
                System.out.println(average);


            }
        }
    }
}







