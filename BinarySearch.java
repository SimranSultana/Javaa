
class BinarySearch{
public static void main(String[] args){
   int[] arr = {2, 4, 10, 10, 10, 18, 20};
   int target = 10;
int firstOccurrence = FirstOccurance(arr, target);
        int lastOccurrence1 = lastOccurance(arr, target);

        System.out.println("First Occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("Last Occurrence of " + target + " is at index: " + lastOccurrence1);

}
public static int FirstOccurance(int[] arr, int target){
int left = 0;
int right = arr.length-1;
int result = -1;
while(left<=right){
int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
      }
         return result;
}
}
 public static int lastOccurance(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
}
}