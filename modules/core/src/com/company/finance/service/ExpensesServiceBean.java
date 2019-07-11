package com.company.finance.service;

import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Date;


@Service(ExpensesService.NAME)
public class ExpensesServiceBean implements ExpensesService {

    @Inject
    private DataManager dataManager;

    @Override
    public BigDecimal getExpensesCategory(String category) {

        BigDecimal sum = dataManager.loadValue("select sum(o.amount) from finance_Operation o " +
                "where o.category = :category", BigDecimal.class)
                .parameter("category", category)
                .one();

        return sum;
    }

    @Override
    public BigDecimal getExpensesDate(Date date1, Date date2) {
        BigDecimal sum = dataManager.loadValue("select sum(o.amount) from finance_Operation o " +
                "where  @dateAfter(o.date, :date1) and @dateBefore(o.date, :date2) ", BigDecimal.class)
                .parameter("date1", date1).parameter("date2",date2)
                .one();

        return sum;

    }
}