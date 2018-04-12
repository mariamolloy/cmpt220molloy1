public class Test13_11 {
    public static void main(String[] args){
        Octagon oct1 = new Octagon(5);

        System.out.println(oct1.getArea());
        System.out.println(oct1.getPerimeter());

        Octagon oct2 = (Octagon)oct1.clone();
        System.out.println(oct1.compareTo(oct2));
    }
}
