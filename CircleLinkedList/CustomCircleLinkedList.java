package CircleLinkedList;
import java.util.Scanner;

class CustomCircleLinkedList<E> implements ListInterface<E>{
	private Node<E> head;
	private Node<E> tail;
	private int numStudents;
	
	Scanner scanner;

	public CustomCircleLinkedList() {		//생성자
		scanner = new Scanner(System.in);
		tail = new Node(-1);
		tail.next = tail;
	}

	@Override
	public void add(int index, E x) {		//첫 번째 원소는 0번 원소
		if(index >= 0 && index <= numStudents) {
			Node<E> prevNode = getNode(index -1);
			Node<E> newNode = new Node(x, prevNode.next);
			prevNode.next = newNode;
			if(index == numStudents)
				tail = newNode;
			numStudents++;
		}
		
	}

	@Override
	public void append(E x) {				//맨 뒤에 추가해주는 메소드
		
		Node<E> prevNode = tail;			//더미 노드
		Node<E> newNode = new Node(x, tail.next);
		prevNode.next = newNode;
		tail = newNode;
		//tail.next = head; 					//원형으로 이어줌
		numStudents ++;
		
	}

	@Override
	public E remove(int index) {
	    // 인덱스가 범위를 벗어난 경우 예외 처리
	    if (index < 0 || index >= numStudents) {
	        throw new IndexOutOfBoundsException("인덱스: " + index + ", 크기: " + numStudents);
	    }

	    // 인덱스가 0일 때 (첫 번째 노드 삭제)
	    if (index == 0) {
	        Node<E> removedNode = tail.next; // 삭제할 노드를 저장
	        tail.next = removedNode.next; // tail의 다음 노드를 삭제할 노드의 다음 노드와 연결
	        numStudents--; // 리스트의 크기 감소
	        return removedNode.student; // 삭제된 노드의 데이터 반환
	    }

	    Node<E> current = tail.next; // 현재 노드를 리스트의 첫 번째 노드로 설정
	    Node<E> previous = null; // 이전 노드를 null로 초기화

	    // 해당 인덱스로 이동하기 위해 반복문 실행
	    for (int i = 0; i < index; i++) {
	        previous = current; // 현재 노드를 이전 노드로 설정
	        current = current.next; // 다음 노드로 이동
	    }

	    // 삭제할 노드가 마지막 노드인 경우, tail을 이전 노드로 업데이트
	    if (current == tail) {
	        tail = previous;
	    }

	    // 이전 노드가 null이 아닌 경우, 삭제할 노드를 건너뛰고 이전 노드를 다음 노드와 연결
	    if (previous != null) {
	        previous.next = current.next;
	    }

	    numStudents--; // 리스트의 크기 감소

	    return current.student; // 삭제된 노드의 데이터 반환
	}


	@Override
	public boolean removeStudent(E x) {
		System.out.println("Test1");
		Node<E> currNode = tail.next;		//더미 헤드
		Node<E> prevNode;					//이전 노드
		for(int i = 0; i < numStudents; i ++) {
			System.out.println("Test2");
			prevNode = currNode; 			// 현제 노드
			currNode = currNode.next; 		// 그 다음 노드
			//현제 노드의 객체와 지울 노드의 객체가 일치할 때
			if(((Comparable)(currNode.student)).compareTo(x) == 0) {
				System.out.println("Test3");
				//현제 노드의 다음 노드는 현제노드의 다음 노드가 된다.
				prevNode.next = currNode.next;
				numStudents--;
				return true;
			}
		}
		return false; // not found
	}

	@Override
	public E get(int index) {
		
		if(index >= 0 && index <= numStudents-1) {
			return getNode(index).student;
		}else return null; //에러
	}

	@Override
	public void set(int index, E x) {
		
		if(index >= 0 && index <= numStudents-1) {
			getNode(index).student = x;
		}else {/* 에러 처리 */}
		
	}
	
	// 주어진 인덱스에 해당하는 노드를 반환하는 메서드
	// 인덱스가 유효한 범위 내에 있어야 함
	// 유효한 인덱스 범위: -1부터 numStudents까지 (numStudents 포함)
	// -1은 더미 헤드(dummy head)를 의미함
	private Node<E> getNode(int index) {
	    // 인덱스가 유효한 범위 내에 있는지 확인
	    if (index >= -1 && index <= numStudents) {
	        Node<E> currNode = tail.next; // 더미 헤드
	        for (int i = 0; i <= index; i++) {
	            currNode = currNode.next;
	        }
	        return currNode;
	    } else {
	        // 유효하지 않은 인덱스인 경우 null을 반환
	        return null;
	    }
	}

	
	public final int NOT_FOUND = -12345;

	@Override
	public int indexOf(int index, E x) {
		
		Node<E> currNode = tail.next;
		for(int i = 0; i<= numStudents; i++) {
			currNode = currNode.next;
			if(((Comparable)(currNode.student)).compareTo(x) == 0)
				return i;
		}
		return NOT_FOUND;
	}
	
	// 객체의 인덱스 반환
    public int indexOf(E data) {
        if (head == null)
            return -1;

        if (head.student.equals(data))
            return 0;

        int index = 0;
        Node<E> current = head.next;
        while (current != head) {
            if (current.student.equals(data))
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }

	@Override
	public int size() {
		
		return numStudents;
	}

	@Override
	public boolean isEmpty() {
		
		return numStudents == 0; // numStudnents 가 0 과 같을 경우 true값 반환
	}

	@Override
	public void clear() {
		
		numStudents = 0;
		
		Node<E> currNode  = head;
		head = null;
//		tail = new Node(-1);
//		tail.next = tail;
		
	}

		
}
