public class Palindrome1{
	static boolean Palindrome(String str) 
	{
        int a= 0;
        int b = str.length() - 1;
        while (a < b) 
         {
            if (str.charAt(a) != str.charAt(b)) 
            {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
	
	public static void main(String[] args){
		String str = "malayalam";
		String substring="";
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=i+1;j<str.length();j++)
			 {
				 substring=str.substring(i, j);
				 if(Palindrome(substring) && substring.length()>1)
					 System.out.println(substring);

			 }
		 }
		System.out.println(str);
	}
}