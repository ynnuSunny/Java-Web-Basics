package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport{
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public int doStartTag() throws JspException {
		
		
		try {
			JspWriter out = pageContext.getOut();
		    out.println("<h1>"+"This tag is created by "+msg+"<h2>");	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
     
}
