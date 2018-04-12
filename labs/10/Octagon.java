public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side = 0;

    Octagon() {
    }

    Octagon(double s){
        this.side = s;
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double s){
        this.side = s;
    }

    public double getArea(){
        double area = (2 + 4 / (Math.sqrt(2)))* side * side;
        return area;
    }

    public double getPerimeter(){
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o){
        if (this.side < o.getSide()){
            return -1;
        }
        else if (this.side > o.getSide()){
            return 1;
        }
        else
            return 0;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }
       catch (CloneNotSupportedException ex) {
            return null;
       }
    }


}
