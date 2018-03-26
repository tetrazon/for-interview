package net.itspartner.test.n1;

public class Main {

	/**
	 * Description: Application contains custom linked list implementation and loops
	 * through the list to print each element Task: Implement 'reverse' method for
	 * this linked list that modify the list in following way: original: 1->2->3
	 * expected: 3->2->1
	 * <p>
	 * Do not change 'Node' class
	 */
	public static void main(String[] args) {

		Node<Integer> linkedListHead = new Node<>(1);
		linkedListHead.setNextNode(new Node<>(2)).setNextNode(new Node<>(3)).setNextNode(new Node<>(4));

		print(reverse(linkedListHead));
	}

	private static void print(Node<Integer> head) {

		Node<Integer> curNode = head;
		while (curNode != null) {

			System.out.print(curNode.value);

			curNode = curNode.getNextNode();
			if (curNode != null)
				System.out.print("->");
		}
	}

	private static Node<Integer> reverse(Node<Integer> head) {
		Node<Integer> tail = null;
		if (head.getNextNode().getNextNode() != null) {
			tail = reverse(head.getNextNode());
		} else {
			tail = head.getNextNode();
		}
		head.getNextNode().setNextNode(head);
		head.setNextNode(null);
		return tail;
	}
}
