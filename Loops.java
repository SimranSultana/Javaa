import java.util.Scanner;
class Loops{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
for(int i=0;i<=10;i++){
   int a = sc.nextInt();
   int b = sc.nextInt();
   int n = sc.nextInt();

   for(int j= 0;j<=n;j++){
    a = a+b;
System.out.println(a+"");
    b = b*2;
}

System.out.println("");


}
sc.close();



}




}
