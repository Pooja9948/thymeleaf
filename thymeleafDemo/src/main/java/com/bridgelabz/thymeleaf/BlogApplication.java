package com.bridgelabz.thymeleaf;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.context.WebContext;

public class BlogApplication {
    public void process(HttpServletRequest request, HttpServletResponse response) 
   		 throws IOException {
	    WebContext ctx = new WebContext(request, response, request.getServletContext(),
	    		request.getLocale());
	    Page page = new Page();
	    page.setFormAction("saveData");
	    page.setSubmitValue("Submit Data");
	    page.setImageName("flower12.jpg");
	    page.setImageTitle("Flower");
	    ctx.setVariable("myPage", page);
	    ThymeleafAppUtil.getTemplateEngine().process("myblog1", ctx, response.getWriter());
    }
}
