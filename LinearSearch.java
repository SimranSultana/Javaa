import java.util.Scanner;
class LinearSearch{
public static void main(String[] args){
int a[] = {10,20,30,40,50};
Scanner sc = new Scanner(System.in);
System.out.println("Enter the element");
int ele = sc.nextInt();
Boolean flag = false;
for(int i=0;i<a.length;i++){
if(ele == a[i]){
System.out.println("element found at index position :"+i);
flag = true;
break;
}}
if(flag == false)
System.out.println("element not found");

}
}