public class SumOfDigits {
	public static void main(String[] args) {
		int a = 123456,b=0; /*Sum of integer into single digit*/
		while(a>9){
			b=0;
			while(a>0){
				b += a%10;
				a /=10;
			}
			a=b;
		}
		System.out.println("Output : "+a);
	}
}
