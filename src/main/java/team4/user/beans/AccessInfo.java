package team4.user.beans;


import lombok.Data;

@Data
public class AccessInfo {

	private String getPwdInfo;
	private String uCode;
	private String aCode;
	private int method;
	private String publicIp;
	private String privateIp;
	private String browser;
	

}
