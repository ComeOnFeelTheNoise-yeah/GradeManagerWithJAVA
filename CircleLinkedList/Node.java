package CircleLinkedList;

class Node <E>{
    public E student;
    public Node next;
    
    public Node(E newStudent) {
    	student = newStudent;
    	next = null;
    }
    
    public Node(E newStudent, Node<E> nextNode) {
    	student = newStudent;
    	next = nextNode;
    }
    
}