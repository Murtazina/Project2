package com.company.finance.web.screens.operation;

import com.haulmont.cuba.gui.screen.*;
import com.company.finance.entity.Operation;

@UiController("finance_Operation.edit")
@UiDescriptor("operation-edit.xml")
@EditedEntityContainer("operationDc")
@LoadDataBeforeShow
public class OperationEdit extends StandardEditor<Operation> {
}