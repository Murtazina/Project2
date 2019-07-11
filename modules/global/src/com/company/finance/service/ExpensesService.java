package com.company.finance.service;


import java.math.BigDecimal;
import java.util.Date;

public interface ExpensesService {
    String NAME = "finance_ExpensesService";

    BigDecimal getExpensesCategory(String category);
    BigDecimal getExpensesDate(Date date1, Date date2);
}