package RegularExpression1;
import java.util.regex.*;
public class RegularExpressionEx {

	public static void main(String[] args) {
		//first way
		Pattern p = Pattern.compile("..m");
		Matcher m = p.matcher("alm");
		boolean b = m.matches();
		System.out.println(b);
		//second way
		boolean b2 = Pattern.compile(".s").matcher("sai").matches();
		System.out.println(b2);
		//third way
		boolean b3 = Pattern.matches(".m","am");
		System.out.println(b3);
		
	}

}
