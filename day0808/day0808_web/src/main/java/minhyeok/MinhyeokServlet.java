package minhyeok;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/minhyeok")
public class MinhyeokServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("나민혁이 만든 서블릿 첫번째");
        res.getWriter().println("나민혁이 만든 서블릿 첫번째");
    }
}
