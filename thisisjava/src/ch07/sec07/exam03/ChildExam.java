package ch07.sec07.exam03;

public class ChildExam {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent;
		
		child.fidld2 = "data2";
		child.method3();
			
	}

}
