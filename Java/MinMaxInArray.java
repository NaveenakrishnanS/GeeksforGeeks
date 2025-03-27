public class MinMaxInArray {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int min=0;
        int max=0;
        for(int i=0; i<arr.length;i++){
            int val = arr[i];
            
            if(val < min || min == 0){
                min = val;
            }
            
            if(val > max){
                max = val;
            }
        }
        return new Pair<Integer, Integer>(min,max);
    }
}

// User function Template for Java
// User function Template for Java


class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
/*
Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/
