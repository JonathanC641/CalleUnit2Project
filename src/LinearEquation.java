public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double slope(){
        double y = y2 - y1;
        double x = x2 - x1;
        double slope =  y / x;
        return Math.round(slope * 100.0) / 100.0;
    }

    public double yIntercept(){
        double b = y1 - (slope() * x1);
        return Math.round(b * 100.0) / 100.0;
    }


    public String equation() {
        int y = (y2 - y1);
        int x = Math.abs((x2 - x1));
        String slopeFrac = y + "/" + x + "x";
        String m;
        String b;
        if (slope() == 1){
            m = "x";
        }
        else{
            if(slope() == -1)
              m =   "-x";
            else{
                if (y % x != 0 & slope() < 0){
                    m = "-" + slopeFrac;
                }
                else{
                    if(y % x != 0 & slope() > 0){
                        m = "" + slopeFrac;
                    }
                    else{
                        if (y % x == 0 & slope() < 0){
                            m = "" + slope() + "x";
                        }
                        else{
                            m = "" + slope() + "x";
                        }
                    }
                }
            }
        }
        if(yIntercept() < 0){
            b = "- " + Math.abs(yIntercept());
        }
        else{
            if(yIntercept() > 0){
                b = " + " + yIntercept();
            }
            else{
                b ="";
            }
        }

        return "y = " + m + " " + b;
    }


    public double distance(){
        double x = Math.pow(Math.abs(x2-x1),2);
        double y = Math.pow(Math.abs(y2-y1),2);
        double distance = Math.sqrt(y+x);
        return Math.round(distance * 100.0) / 100.0;
    }



    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y-intercept of the line is: " + yIntercept() + "\n" + "The distance between the two points is: " + distance();
    }

    public String calculate(double x){
        double result = (slope() * x) + yIntercept();
        return "The point on the line is: " + "(" + x + ", " + result + ")";
    }
}
