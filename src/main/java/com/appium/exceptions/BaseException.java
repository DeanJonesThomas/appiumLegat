package com.appium.exceptions;
/**
 * @author DeanJones
 */
public class BaseException extends Exception{
	
	private static final long serialVersionUID = 1L;
	String errorMsg;
	public BaseException(String msg) {
		this.errorMsg = msg;
	}
	public String toString() {
	      return ("Exception Occurred : " + errorMsg);
	   }

}
