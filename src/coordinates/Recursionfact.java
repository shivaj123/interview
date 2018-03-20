package coordinates;

public class Recursionfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1, num=5;
		fact=factorial(num);
		System.out.println(fact);
		

	}

	 static int factorial(int num) {
	if(num==0)
		
	return 1;
	else
		
	return (num*factorial(num-1));
	}

}
