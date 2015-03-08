package com.stackdemo;

public class LinkNode {
	private String node;
	private LinkNode next;
	
	public LinkNode(String node){
		this.node = node;
		this.next = null;
	}
	
	public LinkNode(String node, LinkNode next){
		this.node = node;
		this.next = next;
	}
	
	public String getNode(){
		return this.node;
	}
	
	public void setNode(String node){
		this.node = node;
	}
	
	public LinkNode getNext(){
		return this.next;
	}
	
	public void setNext(LinkNode next){
		this.next = next;
	}
	
}
