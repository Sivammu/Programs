package statements;

public class switchcase {

	public static void main(String[] args) {
    int a=5;
    String result=switch(a) 
        {
        case 1,4,5-> {yield "tamilnadu";}
        case 2-> {yield "banglore";}
        case 3-> {yield "Chennai";}
        default->{ yield "karnataka";} 
            };
        System.out.println(result);

    }


		}
		

	
