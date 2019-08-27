package com.loginportal.utils.otp;

import org.springframework.boot.SpringApplication;


public class demo {
	public static void main(String[] args) {
		//SpringApplication.run(AwsroomtestApplication.class, args);
		AwsSesOtpApplication mail =new AwsSesOtpApplication();
		mail.setFrom("akashbpatil204@gmail.com");
		mail.setTo("akashbpatil204@gmail.com");
		mail.setSubject("aaa");
		mail.setText("aaa");
		mail.doSendEmailWith();
	}
}
