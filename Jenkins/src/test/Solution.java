package test;

public class Solution {

	String assign, s=null;
	
	
	public Solution() {
		
		assign=Method1();
		
	}

	String Method1() {
		for (int i = 0; i < 10; i++) {

		  System.out.println(s = "this is sampe program for my jenkins job" + i);

		}
		
		return s;
	}

	public static void main(String[] args) {
		Solution s = new Solution();

	}
}
