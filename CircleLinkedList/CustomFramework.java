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
		if(Index!=linkedList.size()) {//뒤에 삽입할 경우
			linkedList.append(sif);;
		}else {//0일떄와 중간에 삽입할 경우
			linkedList.add(Index,(Object)sif);
		}
		
		
	}
	
	public void linkedListRemover(Object name) {
		linkedList.removeStudent(name);
	}
	
	// CustomFramewort의 삭제 메소드
	public boolean linkedListRemover(int delIndex) {
	    if (delIndex >= 0 && delIndex < getLinkedList().size()) {
	        linkedList.remove(delIndex);
	        // 삭제 후, 인덱스가 수정된 경우 true 반환
	        return true;
	    }
	    return false;
	}

	
}