package CircleLinkedList;

import CircleLinkedList.SetInfo.SetInformation;

public class CustomFramework extends CustomCircleLinkedList<Object>{
	
	private CustomCircleLinkedList linkedList;

	public CustomFramework(){
		
		linkedList = new CustomCircleLinkedList<>();
	}
	
	public CustomCircleLinkedList<Object> getLinkedList() {
		return linkedList;
	}

	public void addLinkedList(SetInformation sif,CustomCircleLinkedList<Object> linkedList,int Index) {
		if(Index!=linkedList.size()) {//�ڿ� ������ ���
			linkedList.append(sif);;
		}else {//0�ϋ��� �߰��� ������ ���
			linkedList.add(Index,(Object)sif);
		}
		
		
	}
	
	public void linkedListRemover(Object name) {
		linkedList.removeStudent(name);
	}
	
	// CustomFramewort�� ���� �޼ҵ�
	public boolean linkedListRemover(int delIndex) {
	    if (delIndex >= 0 && delIndex < getLinkedList().size()) {
	        linkedList.remove(delIndex);
	        // ���� ��, �ε����� ������ ��� true ��ȯ
	        return true;
	    }
	    return false;
	}

	
}