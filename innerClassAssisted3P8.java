package innerClasses;
//anonymous inner class
abstract class AnonymousInnerClass {
	    abstract void display();
	}


	public class innerClassAssisted3P8 {

	public static void main(String[] args) {
	innerClassAssisted3P8 i = new innerClassAssisted3P8() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }

	private void display() {
		System.out.println("Anonymous Inner Class");
				}
	}

