package statements;

public class primealter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=15;
		boolean a=true;
		 for(i=2;i<=n/2;i++) // 23 -  2 - half of the number  2-11   37 (2 - 18) 68 - (2- 34)

		 {
		     if(n%i==0) //if true ...it is composite number
		  	 {
		     System.out.println(n+ " is composite number");
		     a=false;
		     break;
		     }
		     
		 }
		 if(a)
		 {
			 System.out.println(n+ " is prime number");
		 }
			 
	}

}
