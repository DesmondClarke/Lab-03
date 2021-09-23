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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // load up a JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("ageNumber");
        int ageInt;
        try {
             ageInt = Integer.parseInt(age);
        }
        catch (NumberFormatException e)
        {
            ageInt = 0;
        }
        
        String message = "Your age next birthday will be " + (ageInt + 1);
        
        //error checking
        if (age == null || age.equals("")) {
            
            request.setAttribute("errormessage", "You must give your current age");
            
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }else if(age == "a") {
            
        }else {
            request.setAttribute("correctmessage", message);
        }
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

}
