package profound.string;

public class MakeString {

	public static void main(String[] args) {
		
		
		char c[] = {'S','T','R','I','N','G'};
		String s1 = new String(c);
		String s2 = new String(s1);
		System.out.println(s1);
		System.out.println(s2);

	}
}
