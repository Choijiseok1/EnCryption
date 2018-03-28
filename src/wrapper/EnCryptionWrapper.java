package wrapper;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.http.*;

public class EnCryptionWrapper extends HttpServletRequestWrapper{
	public EnCryptionWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		String result = null;
		if(name != null && name.equals("userpwd")) {
			//패스워드 암호화 처리
			result = getSha512(super.getParameter("userpwd"));
		}else {
			result = super.getParameter(name);
		}
		
		return result;
	}
	
	//암호화 처리용 메소드
	private static String getSha512(String passwd) {
		String encPwd = null;
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			byte[] pwdBytes = passwd.getBytes(Charset.forName("UTF-8"));
			md.update(pwdBytes);
			
			encPwd = Base64.getEncoder().encodeToString(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return encPwd;
	}
}

















