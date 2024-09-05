package sorting;

public class BubbleSort {
    public static void sort(int arr[]){
        for(int turn=0; turn< arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]> arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void InsertionSort(int arr[]){
      for (int i=1; i< arr.length; i++){
          int curr = arr[i];
          int prev = i-1;
          //finding the correct position to insert
          while(prev>=0 && arr[prev] > curr){
              arr[prev+1] = arr[prev];
              prev--;
          }
          //insertion
          arr[prev+1] = curr;
      }
    }

    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //frequency - count of a number
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] >0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }


    public static void printArray(int pArr[]){
        for(int x: pArr){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,4,1,3,1,5};
//       sort(arr);
//        selectionSort(arr);
//        InsertionSort(arr);
        countSort(arr);
       printArray(arr);
    }
}
