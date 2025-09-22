class Stringdemo
{
	public static void main(String [] a)
	{
		String str1="Hello";//string pull get new address in heap

		String str2=new String ("Hello");//get new address in heap

		String str3="Hello";//string pull get previous address in heap like hashcode
		String str4=new String ("Hello");

		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		System.out.println(str1.equals(str2));
		

	}
}
//string inmuttable in java

//string muttable used string builder and string buffer and syntax how to convert into string

 
string builder and string buffer difference and syntax 
stringbuilder sb1=new stringbuilder(s1);