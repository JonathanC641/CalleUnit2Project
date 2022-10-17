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
        return slope;
    }

    public double yIntercept(){
        return y1 - (slope() * x1);
    }

    public String equation(){
        int y = y2 - y1;
        int x = x2 - x1;
        String slopeFrac = y + "/" + x;
        if ((x < 0 || y < 0) & (yIntercept() < 0)){
            return "y = -" + slopeFrac + " - " + Math.abs(yIntercept());
        }
        else{
            if ((x > 0 & y > 0) & (yIntercept() > 0)){
                return "y = " + slopeFrac + " + " + yIntercept();
            }
            else{
                if ((x < 0 || y < 0) & (yIntercept() > 0)){
                    return "y = -" + slopeFrac + " + " + yIntercept();
                }
                else{
                    return "y = " + slopeFrac + " - " + Math.abs(yIntercept());
                }
            }
        }
    }

    public double distance(){
        double x = Math.pow(Math.abs(x2-x1),2);
        double y = Math.pow(Math.abs(y2-y1),2);
        double distance = Math.sqrt(y+x);
        return Math.round(distance * 100.0) / 100.0;
    }



    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y2 + ") and " + "(" + x2 + ", " + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y-intercept of the line is: " + yIntercept() + "\n" + "The distance between the two points is: " + distance();
    }
}
