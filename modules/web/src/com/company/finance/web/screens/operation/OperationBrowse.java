package com.company.finance.web.screens.operation;

import com.haulmont.cuba.core.entity.Category;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.data.Datasource;

import com.haulmont.cuba.gui.screen.*;
import com.company.finance.entity.Operation;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;
import java.util.List;



@UiController("finance_Operation.browse")
@UiDescriptor("operation-browse.xml")
@LookupComponent("operationsTable")
@LoadDataBeforeShow
public class OperationBrowse extends StandardLookup<Operation> {


   }


