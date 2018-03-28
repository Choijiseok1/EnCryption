package reper;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.nio.charset.Charset;
import java.security.MessageDigest;

import javax.servlet.http.*;



public class encpyreper extends HttpServletResponseWrapper{
	public encpyreper(HttpServletResponse response) {
		super(response);
		// TODO Auto-generated constructor stub
	}
	public String gerParament(String name) {
		String enCrypPwd=null;
		if(name!=null && name.equals("")) {
			
		}else {
			
		}
		return enCrypPwd;
	}
	private static String getSha512(String passwd) {
		String encPwd=null;
		try {
			MessageDigest md= MessageDigest.getInstance("SHA-512");
			byte[] pwd=passwd.getBytes(Charset.forName("utf-8"));
			md.update(pwd);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return passwd;
	}
	
}
