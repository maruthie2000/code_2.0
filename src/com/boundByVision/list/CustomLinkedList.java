package com.boundByVision.list;

public class CustomLinkedList {
	CustomNode head;
	int index = 0;

	class CustomNode {
		Object data;
		CustomNode next;
		int customNodeIndex;

		CustomNode(Object data, int in) {
			this.data = data;
			this.customNodeIndex = in;
		}
	}

	public void add(Object obj) {
		CustomNode cl = new CustomNode(obj, index);
		if (head == null)
			head = cl;
		else {
			CustomNode temp = head;
			while (temp.next != null) {
				// System.out.println(temp.data);
				temp = temp.next;
			}
			temp.next = cl;
		}
		index++;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		if (head == null) {
			return sb.toString().concat("]");
		} else {
			CustomNode temp = head;
			while (temp.next != null) {
				sb.append(temp.data + ",");
				temp = temp.next;
			}
			sb.append(temp.data);
		}
		return sb.toString().concat("]");
	}

	public Object get(int indexPassed) throws Exception {
		if (indexPassed < 0 || indexPassed >= index) {
			throw new Exception("Index not Found...");
		} else {
			CustomNode temp = head;
			while (temp.next != null) {
				if (temp.customNodeIndex == indexPassed)
					return temp.data;
				else
					temp = temp.next;
			}
			if (temp.customNodeIndex == indexPassed)
				return temp.data;
		}
		return null;
	}
	
	public void insertBeforeHead(Object obj) {
		CustomNode cl = new CustomNode(obj, index);
		if(head == null) {
			head = cl;
		}else {
			cl.next = head;
			head = cl;
		}
		index ++;
	}
	
	public void insertAtSpecifiedPosition(Object data,Object afterNode) {
	    CustomNode cl = new CustomNode(data, index);
	    boolean flag = false;
	}
}
