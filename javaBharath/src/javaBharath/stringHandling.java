package javaBharath;

public class stringHandling {

	public static void main(String[] args) {

		String a1=new String("qwerty");
		String s2="qwerty";
		String s5=s2;
		char[] c={'q','w','e','r','t','y'};
		String s3=new String(c);
		byte[] b={65,66,67,48,49};
		String s4=new String(b);
		
		System.out.println(a1);
		System.out.println(s2);

		System.out.println(s3);

		System.out.println(s4);
		System.out.println(s5==s2);
		System.out.println(s5.equals(s2));
		System.out.println(s5==(s3));
		System.out.println(s5==(a1));
		
		System.out.println("Length of s4 "+s4.length());
		System.out.println("Index of s4 "+s3.indexOf('q'));
		System.out.println("Index of s4 "+s4.charAt(4));
		System.out.println("Index of s4 "+s3.substring(3));
		System.out.println("Index of s4 "+s4.substring(0,3));

		
		System.out.println("replace of s4 "+s4.replace('q', 'd'));
		
		System.out.println("lower case of s4 "+s4.toLowerCase());
		System.out.println("upper case of s4 "+s4.toUpperCase());
		
		StringBuffer sb1=new StringBuffer("Deepak ");
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		System.out.println(sb1.append("hello"));
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.insert(2, "hello "));

	}

}
