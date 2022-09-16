package statements;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n=17,count=0;

	for(i=1;i<=n;i++)
    {
     if(n%i==0)
  	 {
     count++;
     }
    }
    if(count==2)
    {
	 System.out.println(n+ " is prime number");
    }
	 else
	 { 
		 System.out.println(n+ " is not prime number");
	 }
	}

	}

 


 