package simple;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class interest {
	
	@RequestMapping("/add")
	public ModelAndView add( HttpServletRequest request ,    HttpServletResponse response   )
	{
		double i = Integer.parseInt(request.getParameter("amount"));
	    double j = Integer.parseInt(request.getParameter("years"));
	    double k =  Integer.parseInt(request.getParameter("interest"));
	    
	    double L = i*j*k;
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("display.jsp");
	    mv.addObject("result", L);
	    
	    return mv;
	}

}
