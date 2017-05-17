public class StringTest {
	public static void main(String[] args) {
			String s1 = "Welcome to Java";
			String s2 = s1;
			String s3 = new String("Welcome to Java");
			String s4 = "Welcome to Java";
			String s5 = new String();

			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s2));
			System.out.println(s1.replace("Java", "HTML"));
			System.out.println(s1.replace("o", "abc"));
			System.out.println(s1.replace('o', 'T'));
			System.out.println(s1.replaceAll("o", "T"));
			System.out.println(s1.replaceFirst("o", "T"));
			System.out.println(s5.length());


			char[] jiang = s1.toCharArray();
			for(char a : jiang){
				System.out.print(a);
			}


		}	
}