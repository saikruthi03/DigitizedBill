package com.student.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
 
import org.springframework.stereotype.Component;
 
@Component
@ManagedBean(name="student")
@RequestScoped
public class StudentBean {
String welcomeMessage="Hiii";

public String getWelcomeMessage() {
	return welcomeMessage;
}

public void setWelcomeMessage(String welcomeMessage) {
	this.welcomeMessage = "Hello";
}
}
