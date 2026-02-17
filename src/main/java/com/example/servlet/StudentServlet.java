package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String course = req.getParameter("course");

        req.setAttribute("name", name);
        req.setAttribute("course", course);

        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
