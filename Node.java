package com.operr.test;

/**
 * Node
 * 
 * @author langthuan
 *
 */
public class Node {
	private int data;
	private Node link;

	// Constructor
	public Node() {
		link = null;
		data = 0;
	}

	// Constructor
	public Node(int value, Node node) {
		data = value;
		link = node;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the link
	 */
	public Node getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(Node link) {
		this.link = link;
	}

}
