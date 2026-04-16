public class removeDuplicates {
    public static void main(String args[]){
        int[] arr = {1,1,2,2,3,4,4,4,5};

        System.out.println("\n\nBefore removing duplicates from array: \n");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int i = 0;
        int j = i+1;
        
        while(j < arr.length){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        // int[] removedDuplicates = new int[arr.length];
        // removedDuplicates[0] = arr[0];
        // int k = 1;

        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i] != arr[i-1]){
        //         removedDuplicates[k] = arr[i];
        //         k++;
        //     }
        // }

        System.out.println("\n\nAfter Removing duplicates froma array: \n");
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}