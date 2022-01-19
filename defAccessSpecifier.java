
//1. Class is having Default access modifier 
public class defAccessSpecifier
{ 
void display() 
   { 
       System.out.println("You are using defalut access specifier"); 
   } 
} 

class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
       obj.display(); 

	}
}
