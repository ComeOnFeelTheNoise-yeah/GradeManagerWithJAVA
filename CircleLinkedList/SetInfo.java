package CircleLinkedList;

import java.util.Scanner;

public class SetInfo extends Info {

	private Scanner sc;
	private String str;
	private String inputName;
	private int btn;
	int n;
	
	

	class SetInformation extends SetInfo {
	    private boolean deleted; // �����Ͱ� �����Ǿ������� ��Ÿ���� �÷���

	    public SetInformation(String name, int kor, int eng, int mat, int total, float avg) {
	        setName(name);
	        setKor(kor);
	        setEng(eng);
	        setMat(mat);
	        setTotal(total);
	        setAvg(avg);
	        deleted = false; // �������� �ʾ����� ��Ÿ���� �÷��� �ʱ�ȭ
	    }

	    public boolean isDeleted() {
	        return deleted;
	    }

	    public void setDeleted(boolean deleted) {
	        this.deleted = deleted;
	    }

		public String newName() {
			System.out.println("������ �̸� �Է�: ");

			inputName = sc.next();
			
			return inputName;
		}
		
		@Override
	    public String toString() {
	    	
	    	return "�̸�: " + getName() + "\t" + "����: " + getKor() + "\t" + "����: " + getEng() + "\t" + "����: " + getMat() + "\t" +
	                getTotal() + "\t" + getAvg();
	    }
	}

	public SetInfo() {//������
		sc = new Scanner(System.in);
	}

	public void firstMent() {
		System.out.println("1. �л� ��� \n2. �л� ���� ���� \n3. �л� ���� \n4. �˻� \n5. ��ü ��� \n6. ��ü ���� \n7. ����");
	}

	public void inputName() {
		System.out.println("�̸� �Է�: ");

		setName(sc.next());//�Է����̸��� ���
	}
	
	public int delNum() {
		System.out.print("�ε��� ��ȣ�� �Է��ϼ���: ");
        n = sc.nextInt();
		return n;
	}
	
	
	public String simpleInputName() {
		System.out.println("�̸� �Է�: ");

		inputName = sc.next();
		
		return inputName;
	}
	
	public String newName() {
		System.out.println("������ �̸� �Է�: ");

		inputName = sc.next();
		
		return inputName;
	}
	
	public String getSimpleInputName(String inputName) {
		return inputName;
	}

	public void inputScore() {
		System.out.println("�� �� �� ���ʷ� �Է�: ");

		setKor(sc.nextInt());
		setEng(sc.nextInt());
		setMat(sc.nextInt());
	}


	public int updataMenu() {
		System.out.println("1.���� 2.�� 3.�� 4.��");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu() {
		System.out.println("1. �̸� 2. ������");
		
		return n;
	}
	
	public int selectMenu2() {
		System.out.println("1. ���� 2. ���� 3. ���� 4. ���� 5. ���");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu3() {
		System.out.println("1. ���� ���� �̻� �˻� 2. ���� �˻�");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu4() {
		System.out.println("���� �̻����� �˻��Ͻðڽ��ϱ�? :");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMen5() {
		System.out.println("���� ���Ϸ� �˻��Ͻðڽ��ϱ�?");
		n = sc.nextInt();
		
		return n;
	}
	
	public int selectMenu6() {
		System.out.println("������ �Է��� �ּ���.");
		n = sc.nextInt();
		
		return n;
	}
	public int selectMenu7() {
		System.out.println("1. ������������ ���� 2. �������� ����");
		n = sc.nextInt();
		
		return n;
	}
	
	

	public String updataName() {
		System.out.println("�ٲ� �̸��� �Է�:");
		str = sc.next();
		return str;
	}

	public int updataKor() {
		System.out.println("���� ���� : ");
		n = sc.nextInt();
		return n;
	}

	public int updataEng() {
		System.out.println("���� ���� : ");
		n= sc.nextInt();
		return n;
	}

	public int updataMat() {
		System.out.println("���� ���� : ");
		n = sc.nextInt();
		return n;
	}

	public int getN() {
		return n;
	}

	public void misMatch() {
		System.out.println("�߸� �Է�");
	}

	public int inOutBtn() {
		btn = sc.nextInt();
		return btn;
	}
	
	

}