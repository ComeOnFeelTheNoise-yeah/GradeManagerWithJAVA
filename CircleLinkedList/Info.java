package CircleLinkedList;

public class Info extends SubjectInfo implements CustomGradCal {
	private int total;
	private float avg;
	
	@Override
	public int getTotal() {
		return getKor()+ getEng()+ getMat();
	}

	@Override
	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public float getAvg() {
		return getTotal()/3.f;
	}

	@Override
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
}
