package com.servlet;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareOperationService extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        By forwarding
//        int number = (int) req.getAttribute("number");
//        By URL Rewriting
//        int number = Integer.parseInt(req.getParameter("number"));
//        Redirect with Session
//        HttpSession session = req.getSession();
//        int number = (int) session.getAttribute("number");
//        Redirect with Cookies
//        Each servlet have its own config
        final String SERVICE_NAME = getServletConfig().getInitParameter("service_name");
        System.out.println("Incoming Request#" + SERVICE_NAME);

//        Shared between all servlet services
        String providedBy = getServletContext().getInitParameter("service_provider");
        System.out.println(providedBy);

        Cookie[] cookies = req.getCookies();
        int number = 0;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("number")) {
                number = Integer.parseInt(cookie.getValue());
            }
        }

        int result = number * number;
        PrintWriter render = res.getWriter();
        render.println("Square Result: " + result);
    }
}
