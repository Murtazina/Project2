package com.company.finance.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "FINANCE_ACCOUNT")
@Entity(name = "finance_Account")
public class Account extends StandardEntity {
    private static final long serialVersionUID = 5876730186996711490L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 200)
    protected String name;

    @NotNull
    @Column(name = "CURRENCY", nullable = false, length = 150)
    protected String currency;

    @Column(name = "MEANS")
    protected BigDecimal means;

    public BigDecimal getMeans() {
        return means;
    }

    public void setMeans(BigDecimal means) {
        this.means = means;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}