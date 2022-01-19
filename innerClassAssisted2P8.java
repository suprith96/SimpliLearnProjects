package innerClasses;

public class innerClassAssisted2P8 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClassAssisted2P8  ob=new innerClassAssisted2P8 ();  
	ob.display();  
	}
}

