package com.app;

import org.apache.commons.codec.binary.Base64;

public class Test {
	public static void main(String[] args) {
		String m="Hello,Welcome Hyderabad";
		System.out.println(m);
		/* byte[] a=m.getBytes(); */
		byte[] b=Base64.encodeBase64(m.getBytes());
		String s=new String(b);
		System.out.println(s);
		
		/* byte[] c=s.getBytes(); */
		byte[] d=Base64.decodeBase64(s.getBytes());
		String s1=new String(d);
		System.out.println(s1);
	}

}
