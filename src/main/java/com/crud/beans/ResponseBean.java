package com.crud.beans;



public class ResponseBean {
	
	private String status;
	private int errorcode;
	private String output;
	
	
	public ResponseBean(String status, int errorcode, String output) {
		super();
		this.status = status;
		this.errorcode = errorcode;
		this.output = output;
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
	
	@Override
	public String toString() {
		return "ResponseBean [status=" + status + ", errorcode=" + errorcode + ", output=" + output + "]";
	}
	
	

}
