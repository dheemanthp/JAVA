import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        //https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
        HashMap<Integer,Integer> H = new HashMap<>();
        H.put(1,2);
        H.put(2,3);
        H.put(3,4);
        int value = H.get(1);

        System.out.println(" the value is " +  value);
        if(H.containsKey(1)) {
            System.out.println("present");
        }
        //print all the keys
        for(int key : H.keySet()) {
            System.out.println(" the key present is " + key);
        }
        
        //print all the keys,values pairs
            System.out.println(" the (key,value) pairs present is " + H.entrySet());

        H.clear();
        System.out.println(" the size is " +  H.size());
        if(H.isEmpty()){
            System.out.println(" HashMap is empty");
        }
        

    }
}
