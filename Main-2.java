public class Main {

    public  static int[] twoSum(int[] nums, int target){
       int arr[] ={0,0};
       int size=nums.length;
       for(int i=0;i<size-1;i++){
           for(int j=i+1;j<size-1;j++){
               if(nums[i]+nums[j]==target) {
                   arr[0] = i;
                   arr[1] = j;
               }
           }
       }

       return arr;
    }
    public static  void  main(String[] args) {
        /*System.out.println("Hello world!");
        SelectionSort sortObject=new SelectionSort();
        int arr[] = {64,25,12,22,11};
        long time=System.nanoTime();
        //sort with selection sort
        sortObject.sort(arr);
        System.out.println("Consumed nanoseconds by selection sort: "+String.valueOf(System.nanoTime()-time));
        sortObject.printArray(arr);
        int arr2[] = {64,25,12,22,11};
        BubbleSort bubbleSort = new BubbleSort();
        time=System.nanoTime();
        //sort with bubble sort
        bubbleSort.sort(arr2);
        System.out.println("Consumed nanoseconds by bubble sort: "+String.valueOf(System.nanoTime()-time));
        bubbleSort.printArray(arr2);

        //sort recursive bubble sort
        int arr3[] = {64,25,12,22,11};
        RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
        time=System.nanoTime();
        recursiveBubbleSort.sort(arr2,arr3.length);
        System.out.println("Consumed nanoseconds by recursive bubble sort: "+String.valueOf(System.nanoTime()-time));
        recursiveBubbleSort.printArray(arr2);*/
        int nums[] = {2,11,7,15};
        int target =9;
        int arr2[] = twoSum(nums,target);
        System.out.println(arr2[0]+" "+arr2[1]);
    }
}
//src: geeksforgeeks selection sort
class SelectionSort{

    void sort(int arr[]){
        //get the length of the array
        int size=arr.length;
        //run algorithm 0 to size-2
        for(int i=0;i<size-1;i++){
            //assume that index i is the minimum index of the rest of the array.
            int minIndex=i;
            //check i+1 to size-1 index that is lower than index i
            for(int j=i+1;j<size;j++){
                //check the lower or higher
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            //find the lowest index end of the array to replace the item with using temp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]= temp;
        }
    }
    void printArray(int arr[]){
        //print all element writing along with the other items
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        //print new line
        System.out.println();
    }
}

class BubbleSort{
    void sort(int arr[]){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void printArray(int arr[]){
        //print all element writing along with the other items
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        //print new line
        System.out.println();
    }
}

class RecursiveBubbleSort{
    void sort(int arr[],int n){
        if(n==1)
            return;
        else{
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        sort(arr,n-1);
    }

    void printArray(int arr[]){
        //print all element writing along with the other items
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        //print new line
        System.out.println();
    }
}