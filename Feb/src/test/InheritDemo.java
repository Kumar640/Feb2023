package test;

public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritA parent=new InheritA();
		InheritB child=new InheritB();
		
		parent.i=30;
		parent.j=40;
		parent.showij();
		
		
		child.i=40;
		child.j=50;
		child.k=70;
		child.showk();
		

	}

}
