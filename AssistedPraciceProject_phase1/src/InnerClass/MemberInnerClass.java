package InnerClass;

public class MemberInnerClass {
	private String msg="Hi Sai Kumar";
	class Inner{
		void hello() {
			System.out.println(msg);
			
		}
	}

	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		
		MemberInnerClass.Inner innerobj = obj.new Inner();
		innerobj.hello();

	}

}
