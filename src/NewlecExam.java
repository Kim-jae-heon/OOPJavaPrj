import part3.ex4.UI코드분리하기.Exam;

public class NewlecExam extends Exam {
	
	private int com;
	
	public NewlecExam() {
		this(0, 0, 0, 0);//여기서 사용한 this는 오염되지 않아야한다. 갓 생성된 것이어야 한다는 뜻.
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		
//		this.setKor(kor);
		super(kor, eng, math);
		
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		
		return super.total()+com;
	}
	
	@Override
	public float avg() {

		return total()/4.0f;
	}
}
