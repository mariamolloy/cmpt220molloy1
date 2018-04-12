public class Test13_9 {
    public static void main(String[] args){

        Circle[] list = {new Circle(1), new Circle(0.5), new Circle(2), new Circle(1)};

        System.out.println(list[0].getArea());

        for (int i = 1; i < 4; i++){
            System.out.println(list[i].getArea());
            System.out.println(list[0].compareTo(list[i]));
        }


    }
}
