public class Square extends GeometricObject implements Colorable {

    private double side = 0;

    Square(){

    }

    Square(double s){
        this.side = s;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double s){
        this.side = s;
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4 * side;
    }


    public String toString(){
        return super.toString() + "\nside: " + side;
    }


}
