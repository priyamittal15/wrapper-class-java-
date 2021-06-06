public class Convert {
	public static void main(String[] args) {
		int n=440;
		Integer i=Integer.valueOf(n);    // Convert int to Integer
		System.out.println(i);
		
		String st= i.toString();   //Convert Integer to String
		System.out.println("The String is:"+i+" Length:"+st.length());
		
		int in=Integer.parseInt(st);   //Convert String into int
		System.out.println(in);
		
		String S= String.valueOf(in);  // Convert int to String
		System.out.println(S);
		
		Integer x=Integer.valueOf(S);   //convert String to Integer
		System.out.println(x);
		

		int k=x.intValue();  //convert integer to int.
		System.out.println(k);
		
		}
