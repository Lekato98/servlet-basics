package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddOperationService extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//        Each servlet have its own config
        final String SERVICE_NAME = getServletConfig().getInitParameter("service_name");
        System.out.println("Incoming Request#" + SERVICE_NAME);
//        Shared between all servlet services
        String providedBy = getServletContext().getInitParameter("service_provider");
        System.out.println(providedBy);

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
//        Redirect with Cookie
        Cookie cookie = new Cookie("number", Integer.toString(result));
        res.addCookie(cookie);
        res.sendRedirect("square");

//        HttpSession session = req.getSession();
//         Redirect with Session
//        session.setAttribute("number", result);
//        res.sendRedirect("square");

//        URL Rewriting (Redirect)
//        res.sendRedirect("square?number=" + result);
//        Forwarding
//        req.setAttribute("number", result);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/square");
//        dispatcher.forward(req, res);
    }
}
