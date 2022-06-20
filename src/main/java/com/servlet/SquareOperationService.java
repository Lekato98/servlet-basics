package com.servlet;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

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
