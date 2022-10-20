import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //This portion of the code is to create coordinate 1 and take the values in the string and convert them to ints//
        System.out.print("Enter coordinate 1: " );
        String coordinateOne = scan.nextLine();
        int space = coordinateOne.indexOf(" ");
        int comma = coordinateOne.indexOf(",");
        String x1 = coordinateOne.substring(1,comma);
        String y1 = coordinateOne.substring(space+1,coordinateOne.length()-1);
        int xOne =  Integer.parseInt(x1);
        int yOne = Integer.parseInt(y1);

        //This portion of the code is to create coordinate 2 and take the values in the string and convert them to ints//
        System.out.print("Enter coordinate 2: " );
        String coordinateTwo= scan.nextLine();
        int space2 = coordinateTwo.indexOf(" ");
        int comma2 = coordinateTwo.indexOf(",");
        String x2 = coordinateTwo.substring(1,comma2);
        String y2 = coordinateTwo.substring(space2+1,coordinateTwo.length()-1);
        int xTwo =  Integer.parseInt(x2);
        int yTwo = Integer.parseInt(y2);

        //This if-else statement checks if the x values are the same before creating an equation//
        if (xOne == xTwo){
            System.out.print("The points are on a vertical line: x = " + xTwo);
        }
        else{
            LinearEquation equation = new LinearEquation(xOne, yOne, xTwo, yTwo);
            System.out.println(equation.lineInfo());
            System.out.println("Enter a value for x: ");
            double x = scan.nextDouble();
            System.out.println(equation.coordinateForX(x));
        }
    }
}
//Goomba oaofaefijaeifaifja// 