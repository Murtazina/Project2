package com.company.finance.web;

import com.company.finance.service.ExpensesService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.sql.Date;

@UiController("finance_NewScreen")
@UiDescriptor("new-screen.xml")
public class CategoryExpenses extends Screen {

    @Inject
    private Button button;

    @Inject
    private TextField<String> categoryTextField;

    @Inject
    private DateField<Date> dateField;

    @Inject
    private TextField<String> resultTextField;

    @Inject
    private ExpensesService expensesService;


    public void onButtonClick() {
        String valueCategory = categoryTextField.getRawValue();

        BigDecimal result = expensesService.getExpensesCategory(valueCategory);

        resultTextField.setValue(result.toString());
    }

}