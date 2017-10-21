public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "I AM THE BEST";/*Reverse individual words in the string*/
		for(String s1:s.split("\\s+")){
			for(int i=s1.length()-1;i>=0;i--){
				System.out.print(s1.charAt(i));
			}
			System.out.print(" ");;
		}
	}
}
