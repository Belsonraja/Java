public class FindStringCount {
	public static void main(String[] args) {
		String s = "ABBABABAAABBABAA",s1="ABA";/*No of occurance of string*/
		int c=0;
		for(int i =0;i<s.length();i++){
			if(i==(s.length()-(s1.length()-1))){
				break;
			}else if(s.substring(i, i+s1.length()).equals(s1)){
				c++;
			}
		}
		System.out.println("Output : "+c);
	}
}
