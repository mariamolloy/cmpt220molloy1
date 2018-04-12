public class Test13_7 {
    public static void main(String[] args){
       GeometricObject[] arr = new GeometricObject[5];
       for (int i = 0; i < 5; i++){
           arr[i] = new Square(Math.random() * 10);
       }

       for (int i = 0; i < 5; i++){
           System.out.println(arr[i].getArea());
           ((Square)arr[i]).howToColor();
       }

    }
}
