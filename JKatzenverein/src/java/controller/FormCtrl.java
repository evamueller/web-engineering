package controller;

import model.FormModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FormCtrl", urlPatterns = {"/FormCtrl"})
public class FormCtrl extends HttpServlet {

    public static List<FormModel> dataList;

    public FormCtrl() {
        this.dataList = new ArrayList<>();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ihre Anfrage wurde abgeschickt.</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Vielen Dank für Ihre Anfrage.</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        /*
        System.out.print("First Name: ");
        System.out.println(request.getParameter("firstName"));
        
        System.out.print("Last Name: ");
        System.out.println(request.getParameter("lastName"));
        
        System.out.print("eMail: ");
        System.out.println(request.getParameter("email"));
        
        System.out.print("Date: ");
        System.out.println(request.getParameter("date"));
        
        System.out.print("Category: ");
        System.out.println(request.getParameter("category"));
        
        System.out.print("Headline: ");
        System.out.println(request.getParameter("headline"));
        
        System.out.print("Message: ");
        System.out.println(request.getParameter("message"));
        */
        
        FormModel newData = new FormModel();
        newData.setFirstName(request.getParameter("firstName"));
        newData.setLastName(request.getParameter("lastName"));
        newData.setEmail(request.getParameter("email"));
        newData.setDate(Date.valueOf(request.getParameter("date")));
        newData.setCategory(request.getParameter("category"));
        newData.setHeadline(request.getParameter("headline"));
        newData.setMessage(request.getParameter("message"));
        dataList.add(newData);
        
        System.out.println("Requests received so far:");
        for (FormModel data : dataList) {
            System.out.println(data);
            System.out.println("-------------------------------");
        }
        
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
