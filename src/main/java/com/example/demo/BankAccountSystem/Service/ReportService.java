package com.example.demo.BankAccountSystem.Service;

import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Repository.AccountRepository;
import com.example.demo.BankAccountSystem.Repository.CustomerRepository;
import com.example.demo.BankAccountSystem.Repository.LoanRepository;
import com.example.demo.BankAccountSystem.Repository.TransactionRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ReportService {
    public static final String pathToReports ="C:\\Users\\user017\\Downloads\\BankAccountReports";
            @Autowired
    AccountRepository accountRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    LoanRepository loanRepository;
    @Autowired
    TransactionRepository transactionRepository;

    public String generateMonthlyAccountReport() throws FileNotFoundException, JRException {    //generate Monthly Account Report
        List<Account> accountList = accountRepository.findAll();
        File file = ResourceUtils.getFile("classpath:MonthlyAccountReport.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(accountList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "MyName");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports + "\\Monthly_Account_Report.pdf");
        return "Report generated : " + pathToReports + "\\Monthly_Account_Report.pdf";
    }



}
