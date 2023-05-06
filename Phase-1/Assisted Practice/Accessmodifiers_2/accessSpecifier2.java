package accessmodifiers;

class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("Private access specifier"); 
    } 
   void show() {
	   display();
   }
} 

public class accessSpecifier2 {

	public static void main(String[] args) {
		
		priaccessspecifier  obj = new priaccessspecifier(); 
		obj.show();

		
	}
}

