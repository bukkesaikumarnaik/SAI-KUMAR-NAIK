package InnerClass;

public class StaticInnerClass {
		static class A {
			public void hello() {
				System.out.println("Hello Sai Kumar!!!");
			}
		}
		public static void main(String[] args) {
			StaticInnerClass.A innerobj = new StaticInnerClass.A();
			innerobj.hello();

	}

}
