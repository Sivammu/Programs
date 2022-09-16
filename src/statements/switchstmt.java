package statements;

public class switchstmt {

	public static void main(String[] args) {
		int a=8;
		switch(a)
		{
		case 1,5,8:System.out.println("Welcome to java");//multiple values per case
		      break;
		case 2:System.out.println("Welcome to python");
		      break;
		case 3:System.out.println("Welcome to c");
		      break;
		case 4:System.out.println("Welcome to c++");
	          break;
	          
		default:System.out.println("Welcome to javascript");
	          break;
		}

	}

}
