public class removeDuplicates {
    public static void main(String args[]){
        int[] arr = {1,1,2,2,3,4,4,4,5};
        
        int[] removedDuplicates = new int[arr.length];
        removedDuplicates[0] = arr[0];
        int k = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                removedDuplicates[k] = arr[i];
                k++;
            }
        }

        for (int j = 0; j < k; j++) {
            System.out.println(removedDuplicates[j]);
        }

    }
}