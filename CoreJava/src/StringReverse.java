

public class StringReverse {
static String a="dad";
//static int b=343;
public static void main(String Args[]) {
	
	StringBuilder sb=new StringBuilder(a);
	String rev=sb.toString();
	System.out.println(rev);
	if(rev.equalsIgnoreCase(a)) {
		System.out.println("dad is a palindrome");
	}
}
}
