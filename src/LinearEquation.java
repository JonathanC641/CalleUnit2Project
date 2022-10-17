public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 =x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double slope(){
        double y = y2 - y1;
        double x = x2 - y1;
        double slope =  y / x;
        return slope;
    }

    public double yIntercept(){
        double yIntercept = y1 - (slope() * x1);
        return yIntercept;
    }

    public String equation(){

    }

    public double distance(){
        double x = Math.pow(Math.abs(x2-x1),2);
        double y = Math.pow(Math.abs(y2-y1),2);
        double distance = Math.sqrt(y+x);
        return Math.round(distance);
    }








    public String lineInfo(){
        String equation =
    }
}
