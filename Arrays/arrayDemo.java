import java.util.Scanner;
class Array{
    int[] arr;
    int counter = 0;
    Array(int size){
        arr = new int[size];
    }

    void insert(int data){
        if(counter >= arr.length){
            System.out.println("Index out of bound!");
            return;
        }
        arr[counter] = data;
        counter++;
    }

    void delete(int data) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[counter - 1] = 0;
            counter--;
            System.out.println("Value " + data + " deleted successfully.");
        } else {
            System.out.println("Value " + data + " not found in the array.");
        }
    }

    void display(){
        if(arr.length == 0){
            System.out.println("Array is empty display not possible!");
        }
        else{
            System.out.println("Array elements are: ");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
    void search(int data) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                System.out.println("Value found at index: " + i);
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("The value not found in array!");
        }
    }

    int length(){
        return arr.length;
    }
}

class arrayDemo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Array arr = new Array(size);

        boolean flag = true;

        while (flag) {
            System.out.print("Choose the options to perform oprations on array:- \n\nType the number to perform the specific opration:-\n\n1:- Insert the values in array\n2:- delte values from array\n3:- display the array elements\n4:- search the specific element in array\n0:- to stop the loop\n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements to enter in the array: ");                    
                    int range = scanner.nextInt();
                    if(range == arr.length()-1){
                        System.out.println("The range is out of array bounds");
                    }
                    while(range != 0){
                        System.out.print("Enter element: ");
                        int data = scanner.nextInt();
                        arr.insert(data);
                        range--;
                    }
                    break;

                case 2:
                    System.out.print("Enter element to delete from array: ");
                    int deleteData = scanner.nextInt();
                    // Passing 0 for data as your delete method mainly uses the index
                    arr.delete(deleteData); 
                    break;

                case 3:
                    arr.display();
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    int searchVal = scanner.nextInt();
                    arr.search(searchVal);
                    break;

                case 0:
                    flag = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        }

        
    }
}
