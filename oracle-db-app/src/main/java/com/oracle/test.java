package com.oracle;

import in.ashokit.security.PwdUtils;

public class test {
	
	public static void main(String[] args) {
		
		PwdUtils pwd = new PwdUtils();
		String encodedPwd = pwd.encodePwd("abc@123");
        System.out.println(encodedPwd);
	}

}
