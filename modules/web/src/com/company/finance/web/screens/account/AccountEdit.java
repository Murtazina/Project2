package com.company.finance.web.screens.account;

import com.company.finance.entity.Operation;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.finance.entity.Account;

import javax.inject.Inject;

@UiController("finance_Account.edit")
@UiDescriptor("account-edit.xml")
@EditedEntityContainer("accountDc")

public class AccountEdit extends StandardEditor<Account> {


    @Inject
    private CollectionLoader<Operation> operationsDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        operationsDl.setParameter("account",getEditedEntity());
        getScreenData().loadAll();

}
}