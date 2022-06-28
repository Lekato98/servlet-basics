package com.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Square", value = "/square")
public class SquareOperationService extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
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
