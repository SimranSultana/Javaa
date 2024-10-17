
import java.util.Arrays;
class Array{
public static void main (String [] args){

int[] arr = (7,5,9,3,2,8,1,6};
int n =5;
int res = 0;
 Arrays.sort(arr);

System.out.println("Array: " + Arrays.toString(arr));
System.out.println(n + "largest element: " + arr[arr.length - n]);
System.out.println(n + "smallest element: " + arr[n - 1]);

}
}
