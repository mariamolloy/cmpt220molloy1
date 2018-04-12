import java.util.ArrayList;
import java.math.*;

public class SortArrayList13_3 {
    public static void main(String[] args){
        ArrayList<Number> myList = new ArrayList<>();

        myList.add(45); // Add an integer
        myList.add(3445.53); // Add a double
        myList.add(new BigInteger("3432323234344343101")); // Add a BigInteger
        myList.add(new BigDecimal("2.0909090989091343433344343")); // Add a BigDecimal

        sort(myList);

        System.out.println(myList.toString());

    }

    public static void sort(ArrayList<Number> list){
        Number temp = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}
