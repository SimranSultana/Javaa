public class Peterson_Number{

	public static void main(String[] args){
		int num = 145;
		int sum =0;
		while(num>0){
			
			int rem = num%10;
			int fact = 1;
			for(int i=rem; i>0; i--){
				fact = fact * i;
			}
			sum += fact;
			num = num/10;
		}
		System.out.println(sum);
		
		
	}

}