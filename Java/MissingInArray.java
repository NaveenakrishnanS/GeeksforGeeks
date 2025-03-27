public class MissingInArray {
    int missingNumber(int arr[]) {
        // code here
        int iCounter = 0;
        int aCounter = 0;
        int n = arr.length;
        for(int i=0; i< n+1; i++){
            int j = i+1;
            if(i < n){
                aCounter += arr[i];
            }
            iCounter += j;
        }
        return iCounter - aCounter;
    }
}
