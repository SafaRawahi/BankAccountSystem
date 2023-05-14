package com.example.demo.BankAccountSystem.Controller;


import com.example.demo.BankAccountSystem.Service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping(value = "report")
public class ReportController {
    @Autowired
    ReportService reportService;

//    @RequestMapping(value = "MonthlyAccountReport")                //generate Monthly Account Report
//    public String generateMonthlyAccountReport() throws JRException, FileNotFoundException {
//        return reportService.generateMonthlyAccountReport();
//    }

}
