/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serlvet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import resource.ViewEnum;
import utility.ServletUtil;

/**
 *
 * @author Sabrina
 */
public class ConverterServlet extends HttpServlet
{

    private HttpServletRequest request;
    private HttpServletResponse response;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String view = "";
        
        try
        {
            this.request = request;
            this.response = response;
            
            switch (ServletUtil.checkRequestCommando(request, "toCel", "toFah"))
            {
                case "TOFAH":
                    view = celToFah();
                    break;
                case "TOCEL":
                    view = fahToCel();
                    break;
                case "EMPTY":
                    ServletUtil.forwardError(request, response, "Falsches Kommando");
                    break;
            }
            
            ServletUtil.forward(view, request, response);
        }
        
        catch(Exception e)
        {
            try
            {
                ServletUtil.forwardError(request, response, e.getMessage());
            }
            catch (Exception ex)
            {
                Logger.getLogger(ConverterServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private String celToFah() throws Exception
    {
        double cel  = Double.parseDouble(request.getParameter("celsius"));
        
        double fah = cel * 1.8 + 32;
        
        ConverterBean cb = new ConverterBean(fah, "Celsius to Fahrenheit", cel, "°C", "F");
        
        request.setAttribute("ConverterBean", cb);
        return ViewEnum.RESULT.getView();
    }
    
    private String fahToCel() throws Exception
    {
        double fah = Double.parseDouble(request.getParameter("fahrenheit"));
        
        double cel = (fah - 32) / 1.8;
        
        ConverterBean cb = new ConverterBean(cel, "Fahrenheit to Celsius", fah, "F", "°C");
        request.setAttribute("ConverterBean", cb);
        
        return ViewEnum.RESULT.getView();
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
