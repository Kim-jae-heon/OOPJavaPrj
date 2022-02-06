
public class Program {

	//배포된 제품 재사용하기의 첫번째
	//1. 컴파일 -> Exam.class
	//2. 압축 -> Exam.zip
	//3. jar -> Exam.jar
	//이 단계를 밟아서 Exam을 재사용할 수 있다.
	
	public static void main(String[] args) {
		NewlecExam exam = new NewlecExam(1,1,1,1);
		/*exam.setEng(10);
		exam.setKor(10);
		exam.setCom(10);
		exam.setMath(10);*/
		
		System.out.println(exam.total());
		System.out.println(exam.avg());
	}
}
