package statements;

public class primerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i,n=1,count=0;
		  
		  for(int j=1;j<=100;j++)  //5
		  { 
			 
		  if(j!=1)
		  {
			for(i=1;i<=j;i++)     //23  (2 - 11)  7  (2-3)  (2 - sqroot(n)) 
			{
				if(j%i==0)         
				{
				 count=count+1;      
			    }
			}
			
			if(count==2)
			{
				System.out.println(j+" ");
			}
			 count=0;
		  }

			
		  }
		}
		}

