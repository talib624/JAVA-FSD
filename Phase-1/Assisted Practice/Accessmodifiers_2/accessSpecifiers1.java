package accessmodifiers;

 
class defaultAccessSpecifier
{ 
void display() 
   { 
       System.out.println("Defalut access specifier"); 
   } 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
	
		defaultAccessSpecifier obj = new defaultAccessSpecifier(); 		  
      obj.display(); 

	}
}

