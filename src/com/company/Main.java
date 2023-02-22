package com.company;
public class Main
{
    public static void main(String[] args)
    {
        double centimeters= calcFeetAndInchesToCentimeter(5,11);
        calcFeetAndInchesToCentimeter(157);
        if(centimeters==-1)
            System.out.println("INVALID");

    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches)
    {

        if(feet<0 || inches<0 || inches>12)
        {
            return -1;
        }
            double total_ln=inches/12;
            double length=feet+total_ln;
            double centimeters=feet*12*2.54;
            centimeters+=inches*2.54;
            System.out.println(feet+" foot and "+inches+" inches is = "+centimeters+"cm");
            return 0;
    }

    public static double calcFeetAndInchesToCentimeter (double inches)
    {

        if(inches<0)
        {
            return -1;
        }
        double feet=(int)inches/12;
        double remaininginches=(int) inches%12;
        System.out.println("inches boi="+feet+" and "+remaininginches);
        return calcFeetAndInchesToCentimeter(feet,remaininginches);
    }
}
