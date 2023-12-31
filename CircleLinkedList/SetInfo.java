package CircleLinkedList;

import java.util.Scanner;

public class SetInfo extends Info {

	private Scanner sc;
	private String str;
	private String inputName;
	private int btn;
	int n;
	
	

	class SetInformation extends SetInfo {
	    private boolean deleted; // 데이터가 삭제되었는지를 나타내는 플래그

	    public SetInformation(String name, int kor, int eng, int mat, int total, float avg) {
	        setName(name);
	        setKor(kor);
	        setEng(eng);
	        setMat(mat);
	        setTotal(total);
	        setAvg(avg);
	        deleted = false; // 삭제되지 않았음을 나타내는 플래그 초기화
	    }

	    public boolean isDeleted() {
	        return deleted;
	    }

	    public void setDeleted(boolean deleted) {
	        this.deleted = deleted;
	    }

		public String newName() {
			System.out.println("수정할 이름 입력: ");

			inputName = sc.next();
			
			return inputName;
		}
		
		@Override
	    public String toString() {
	    	
	    	return "이름: " + getName() + "\t" + "국어: " + getKor() + "\t" + "영어: " + getEng() + "\t" + "수학: " + getMat() + "\t" +
	                getTotal() + "\t" + getAvg();
	    }
	}

	public SetInfo() {//생성자
		sc = new Scanner(System.in);
	}

	public void firstMent() {
		System.out.println("1. 학생 등록 \n2. 학생 정보 수정 \n3. 학생 삭제 \n4. 검색 \n5. 전체 출력 \n6. 전체 삭제 \n7. 종료");
	}

	public void inputName() {
		System.out.println("이름 입력: ");

		setName(sc.next());//입력한이름을 등록
	}
	
	public int delNum() {
		System.out.print("인덱스 번호를 입력하세요: ");
        n = sc.nextInt();
		return n;
	}
	
	
	public String simpleInputName() {
		System.out.println("이름 입력: ");

		inputName = sc.next();
		
		return inputName;
	}
	
	public String newName() {
		System.out.println("수정할 이름 입력: ");

		inputName = sc.next();
		
		return inputName;
	}
	
	public String getSimpleInputName(String inputName) {
		return inputName;
	}

	public void inputScore() {
		System.out.println("국 영 수 차례로 입력: ");

		setKor(sc.nextInt());
		setEng(sc.nextInt());
		setMat(sc.nextInt());
	}


	public int updataMenu() {
		System.out.println("1.개명 2.국 3.영 4.수");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu() {
		System.out.println("1. 이름 2. 성적순");
		
		return n;
	}
	
	public int selectMenu2() {
		System.out.println("1. 국어 2. 영어 3. 수학 4. 총점 5. 평균");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu3() {
		System.out.println("1. 점수 기준 이상 검색 2. 이하 검색");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu4() {
		System.out.println("몇점 이상으로 검색하시겠습니까? :");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMen5() {
		System.out.println("몇점 이하로 검색하시겠습니까?");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu6() {
		System.out.println("점수를 입력해 주세요.");
		n = sc.nextInt();
		
		return n;
	}
	public int selectMenu7() {
		System.out.println("1. 오름차순으로 정렬 2. 내림차순 정렬");
		n = sc.nextInt();
		
		return n;
	}
	
	

	public String updataName() {
		System.out.println("바뀐 이름을 입력:");
		str = sc.next();
		return str;
	}

	public int updataKor() {
		System.out.println("국어 성적 : ");
		n = sc.nextInt();
		return n;
	}

	public int updataEng() {
		System.out.println("영어 성적 : ");
		n= sc.nextInt();
		return n;
	}

	public int updataMat() {
		System.out.println("수학 성적 : ");
		n = sc.nextInt();
		return n;
	}

	public int getN() {
		return n;
	}

	public void misMatch() {
		System.out.println("잘못 입력");
	}

	public int inOutBtn() {
		btn = sc.nextInt();
		return btn;
	}
	
	

}