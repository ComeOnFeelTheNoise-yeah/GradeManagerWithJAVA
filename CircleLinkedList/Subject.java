package CircleLinkedList;


public class Subject extends Name {
	public int score;

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
        return ""+score;
    }
	
	public void setScore(int score) {
		this.score = score;
	}
	
}

