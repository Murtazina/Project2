package com.company.finance.web.screens;

import com.company.finance.service.ExpensesService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Date;


@UiController("finance_DateExpenses")
@UiDescriptor("new-screen.xml")
public class DateExpenses extends Screen {

    @Inject
    private Button button;


    @Inject
    private TextField<String> resultTextField;

    @Inject
    private ExpensesService expensesService;

    @Inject
    private DateField<java.sql.Date> dateField1;

    @Inject
    private DateField<java.sql.Date> dateField2;


    public void onButtonClickDate() {
        Date valueDate1 =  dateField1.getValue();
        Date valueDate2 = dateField2.getValue();

        BigDecimal result = expensesService.getExpensesDate(valueDate1,valueDate2);

        resultTextField.setValue(result.toString());
    }

}