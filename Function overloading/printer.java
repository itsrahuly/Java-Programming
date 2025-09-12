class printer{
	
	void print(char a){
		System.out.println("Result is"+(a));
		
	}
	void print(int a){
		System.out.println("Result is"+(a));
		
	}
	void print(String a){
		System.out.println("Result is"+(a));
		
	}
	
}//Class Calculator ends here
///////
class Test{
	public static void main(String[] args){
		printer p1=new printer();
		p1.print('a');
		p1.print(10);
		p1.print("Firstbit");
		
	}
}
