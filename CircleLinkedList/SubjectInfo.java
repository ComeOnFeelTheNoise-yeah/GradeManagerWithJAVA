package CircleLinkedList;

public class SubjectInfo extends Name{
	private Subject kor;
	private Subject eng;
	private Subject mat;
	
	public SubjectInfo() {
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
	}

	@Override
	public String toString() {
        return this.getName() + this.kor + this.eng + this.mat;
    }
	
	public int getEng() {
		return eng.getScore();
	}

	public void setEng(int eng) {
		this.eng.setScore(eng);
	}

	public int getKor() {
		return kor.getScore();
	}

	public void setKor(int kor) {
		this.kor.setScore(kor);
	}

	public int getMat() {
		return mat.getScore();
	}

	public void setMat(int mat) {
		this.mat.setScore(mat);
	}
	
	 
}
