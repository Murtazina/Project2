package com.company.finance.web.screens.account;

import com.haulmont.cuba.gui.screen.*;
import com.company.finance.entity.Account;

@UiController("finance_Account.browse")
@UiDescriptor("account-browse.xml")
@LookupComponent("accountsTable")
@LoadDataBeforeShow
public class AccountBrowse extends StandardLookup<Account> {
}