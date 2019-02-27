public class SumOfDigits {
	public static void main(String[] args) {
		int a = 123456,b=0; /*Sum of integer into single digit*/
		while(a>0){
			b += a%10;
			a /= 10;
			if(a == 0 && b > 9){
				a = b;
				b = 0;
			}
		}
		System.out.println("Output : "+b);
	}
}
