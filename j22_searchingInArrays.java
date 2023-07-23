/* 
    Searching in arrays
    - linear search
        definition
        - linear search is a method for finding an element within an array.
        - it sequentially checks each element of the array until a match is found or the whole array has been searched.
        steps
        - start from the leftmost element of arr[] and one by one compare x with each element of arr[]
        - if x matches with an element, return the index.
        - if x doesn’t match with any of elements, return -1.
        time complexity
        
        
    - binary search
        definition
        - binary search is a fast search algorithm with run-time complexity of Ο(log n).
        - this search algorithm works on the principle of divide and conquer.
        - for this algorithm to work properly, the data collection should be in the sorted form.
        - binary search looks for a particular item by comparing the middle most item of the collection.
        - if a match occurs, then the index of item is returned.
        - if the middle item is greater than the item, then the item is searched in the sub-array to the left of the middle item.
        - otherwise, the item is searched for in the sub-array to the right of the middle item.
        - this process continues on the sub-array as well until the size of the subarray reduces to zero.
        time complexity   
 */

// Linear Search
/* public class j22_searchingInArrays {
        public static void main(String[] args) {
                int[] arr = {1,2,3,4,5,6,7,8,9,10};
                int target = 5;
                int ans = linearSearch(arr,target);
                System.out.println(+ans+ "th");
            }
            static int linearSearch(int[] arr, int target){
                if(arr.length == 0){
                    return -1;
                }
                //run a for loop
                for(int index = 0; index < arr.length; index++){
                    //check for element at every index if it is = target
                    int element = arr[index];
                    if(element == target){
                        return index;
                    }
                }
                //this line will execute if none of the return statements above have executed
                //hence the target not found
                return -1;
            }
        
    
} */

//Binary search

public class j22_searchingInArrays {
        public static void main(String[] args) {
                int[] arr = {1,2,3,4,5,6,7,8,9,10};
                int target = 5;
                int ans = binarySearch(arr,target);
                System.out.println(+ans+"th");
            }
            static int binarySearch(int[] arr, int target){
                int start = 0;
                int end = arr.length - 1;
                
                while(start <= end){
                    //find the middle element
                    //int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of int in java
                    int mid = start + (end - start) / 2;
                    
                    //three cases
                    if(target < arr[mid]){
                        end = mid - 1;
                    }else if(target > arr[mid]){
                        start = mid + 1;
                    }else{
                        //ans found
                        return mid;
                    }
                }
                
                return -1;
            }
        }
    
