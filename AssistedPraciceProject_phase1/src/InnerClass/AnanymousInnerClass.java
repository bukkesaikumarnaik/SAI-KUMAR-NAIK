package InnerClass;
abstract class A{
	abstract void test();
}

public class AnanymousInnerClass {

	public static void main(String[] args) {
		A a = new A() {
			void test() {
				System.out.println("Hello Sai Kumar!!!");
			}
		};
		a.test();
		
	}

}
