package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		
		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.newInstance(); //메서드를 통해서 인스턴스를 만드는 모습. 객체화를 이용한 방법만 있는 것이 아니다.
		a.setX(x); //a가 b와 결합하는 모습.
		
		a.print();
	}
}
