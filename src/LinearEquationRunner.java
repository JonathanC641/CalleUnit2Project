import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinate 1: " );
        String coordinateOne = scan.nextLine();
        int space = coordinateOne.indexOf(" ");
        int comma = coordinateOne.indexOf(",");
        String x1 = coordinateOne.substring(1,comma);
        String y1 = coordinateOne.substring(space+1,coordinateOne.length()-1);
        int xOne =  Integer.parseInt(x1);
        int yOne = Integer.parseInt(y1);
        System.out.print("Enter coordinate 2: " );
        String coordinateTwo= scan.nextLine();
        int space2 = coordinateTwo.indexOf(" ");
        int comma2 = coordinateTwo.indexOf(",");
        String x2 = coordinateTwo.substring(1,comma2);
        String y2 = coordinateTwo.substring(space2+1,coordinateTwo.length()-1);
        int xTwo =  Integer.parseInt(x2);
        int yTwo = Integer.parseInt(y2);
        LinearEquation equation = new LinearEquation(xOne,yOne,xTwo,yTwo);
        System.out.print(equation.lineInfo());




    }
}
