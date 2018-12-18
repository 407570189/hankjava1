package com.tom;

public class Equal {

	public static void main(String[] args) {
		int n =100;
		System.out.println(n != 99);
		String s1 = new String("hello world");
		//                      01234567890
		String s2 = new String("hello world");
		System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.substring(8));
        System.out.println(s1.substring(2,7));
        for (int i=s1.length()-1;i>=0;i--){
    	System.out.print(s1.charAt(i));
        }
    	String s3 = new String("Jack Tom Eric");
    	System.out.println();
    	System.out.println(s3.indexOf('o'));
    	String name = "Tom";
    	String s4 =s3.replace(name,"boss");
    	System.out.println(s4);
    	
        int index = s3.indexOf(name);
        System.out.println(index);
        System.out.println(s3.substring(0,index)+"boss"+s3.substring(index+name.length()));
	}
}


