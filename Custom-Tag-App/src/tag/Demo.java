package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out = pageContext.getOut();
		    out.println("<h1>THis is Demo tag information<h2>");	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
     
}
