
public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String s="abc";  
			int i=Integer.parseInt(s);
				
				System.out.println(i);			
			
	}
		catch(NumberFormatException e){
			System.out.println( " abc is String and it will not store in Integer Variable i");
			System.out.println("Above Line is printed due to NumberFormatException");
			
			
		}
	}

}
