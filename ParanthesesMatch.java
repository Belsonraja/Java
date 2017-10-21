public class ParanthesesMatch {

	static class Stack {
		int top = -1;
		char[] chstack = new char[100];

		void push(char x) {
			if (top == 99)
				System.out.println("Stack full");
			else
				chstack[++top] = x;
		}

		char pop() {
			if (top == -1) {
				System.out.println("Stack underflow error");
				return '\0';
			} else {
				char popstack = chstack[top];
				top--;
				return popstack;
			}
		}

		boolean isEmpty() {
			return (top == -1) ? true : false;
		}
	}

	static boolean isMatched(char ch1, char ch2) {
		if ((ch1 == '{' && ch2 == '}') || (ch1 == '(' && ch2 == ')') || (ch1 == '[' && ch2 == ']'))
			return true;
		else
			return false;
	}

	static boolean areBalanced(char[] ch) {
		Stack st = new Stack();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
				st.push(ch[i]);

			if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
				if (st.isEmpty() || !isMatched(st.pop(), ch[i]))
					return false;
			}
		}

		if (st.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String s = "{([])}";
		char[] ch = s.toCharArray();

		if (areBalanced(ch))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

}
