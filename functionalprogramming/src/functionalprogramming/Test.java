package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Test {
	public  void print(String s) {
		System.out.println("you are inside print:"+s);
	}

	public static void main(String[] args) {
		List<String> students=Arrays.asList("wajahat","Ali","zohab");
		Test test=new Test();
		students.forEach(test::print);
	}
}
