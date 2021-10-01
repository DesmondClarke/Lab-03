/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 507936
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNum = request.getParameter("firstNum");
        int firstNumInt;
        try {
             firstNumInt = Integer.parseInt(firstNum);
        }
        catch (NumberFormatException e)
        {
            firstNumInt = 0;
        }
        
        String secondNum = request.getParameter("secondNum");
        int secondNumInt;
        try {
             secondNumInt = Integer.parseInt(secondNum);
        }
        catch (NumberFormatException e)
        {
            secondNumInt = 0;
        }
        
        String message;
        String choice = request.getParameter("sub");
        
        switch(choice) {
        case "+":
        message = "Result: " + (firstNumInt + secondNumInt);
        break;
        case "-":
        message = "Result: " + (firstNumInt - secondNumInt);
        break;
        case "*":
        message = "Result: " + (firstNumInt * secondNumInt);
        break;
        case "%":
        message = "Result: " + (firstNumInt % secondNumInt);
        break;
        default:
        message = "Default";
        }

        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
    }

 
}
