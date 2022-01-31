package com.servlet;

import com.model.ElecBill;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BillServlet extends HttpServlet {
    private ElecBill elecBill;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();

        elecBill = new ElecBill();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("Enter doPost");

        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if ("submit".equals(action)) {
            elecBill.setId(Integer.parseInt(request.getParameter("billId")));
            elecBill.setName(request.getParameter("billName"));
            elecBill.setDailyChargePrice(Double.parseDouble(request.getParameter("dailyChargePrice")));
            elecBill.setDailyChargeUsage(Double.parseDouble(request.getParameter("dailyChargeUsage")));
            elecBill.setOffPeakPrice(Double.parseDouble(request.getParameter("offPeakPrice")));
            elecBill.setOffPeakUsage(Double.parseDouble(request.getParameter("offPeakUsage")));
            elecBill.setPeakPrice(Double.parseDouble(request.getParameter("peakPrice")));
            elecBill.setPeakUsage(Double.parseDouble(request.getParameter("peakUsage")));
            elecBill.setShoulderPrice(Double.parseDouble(request.getParameter("shoulderPrice")));
            elecBill.setShoulderUsage(Double.parseDouble(request.getParameter("shoulderUsage")));
        }

        request.setAttribute("elecBill", elecBill);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
