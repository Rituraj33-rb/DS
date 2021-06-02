package linklist;



public class Runner {

	public static void main(String[] args) {
		LihnkedList list=new LihnkedList();
		list.insert(5);
		list.insert(12);
		list.insert(20);
     	list.insertAtstart(80);
		list.insert(2, 10);
		list.deleteAt(2);
		list.show();

	}

}
