package com.operr.test;

/**
 * 
 * @author langthuan
 *
 */
public class LinkedList {
	private Node start;
	private Node end;

	// Constructor
	public LinkedList() {
		start = null;
		end = null;
	}

	/**
	 * Append element to the end of link list
	 * 
	 * @param val
	 */
	public void appendElement(int value) {
		Node node = new Node(value, null);
		if (start == null) {
			start = node;
			end = start;
		} else {
			end.setLink(node);
			end = node;
		}
	}

	/**
	 * Remove the tail element from a linkedlist
	 */
	public void removeLast() {
		// Check end value
		if (end == null) {
			return;
		} else {
			if (start == end) { // have only one element in the link list
				start = null;
				end = null;
			} else { // Have more than one element.

				Node previousToTail = start;
				while (previousToTail.getLink() != end) {
					previousToTail = previousToTail.getLink();
				}

				end = previousToTail;
				end.setLink(null);
			}
		}
	}

	/**
	 * Remove all element in the linkedlist that is greater than a target value
	 * 
	 * @param value
	 */
	public void removeAll(int value) {
		if (start == null)
			return;
		// in here, we can sure that head is not null and value don't match.
		Node prev = start;
		Node cur = start.getLink();
		while (cur != null) {
			if (cur.getData() > value) {
				prev.setLink(cur.getLink()); // delete item
				cur = prev.getLink(); // prepare next loop, prev is the same and try to match next item of deleted  item in next loop.
			} else {
				prev = prev.getLink();
				cur = prev.getLink();
			}
		}
	}
	
	/**
	 * Display linklist value
	 * 
	 * @return
	 */
	public String display() {
	    String list = "";
	    list += "[" + start.getData() + "]";
	    Node curr = start.getLink();
	    while (curr != null){
	        list += "[" + curr.getData() + "]";
	        curr = curr.getLink();
	    }
	    
	    return list;
	}
	
	
	public static void main(String[] args) {
		LinkedList  linkedList = new LinkedList();
		
		// Append test
		linkedList.appendElement(1);
		linkedList.appendElement(2);
		linkedList.appendElement(3);
		linkedList.appendElement(4);
		System.out.println("Append element result: " + linkedList.display());
		
		// Remove last element test
		linkedList.removeLast();
		System.out.println("Remove last element result: " + linkedList.display());
		
		// Remove all value greater than target
		linkedList.removeAll(2);
		System.out.println("Remove last element result: " + linkedList.display());
		
	}
}
