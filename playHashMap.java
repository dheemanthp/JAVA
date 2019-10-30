import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        //https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
        //https://www.geeksforgeeks.org/iterate-map-java/
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

        //print all the keys,values pairs
        // using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<Integer,Integer> entry : H.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 

        H.clear();
        System.out.println(" the size is " +  H.size());
        if(H.isEmpty()){
            System.out.println(" HashMap is empty");
        }
        

    }
}
