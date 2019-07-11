package com.company.finance.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "FINANCE_OPERATION")
@Entity(name = "finance_Operation")
public class Operation extends StandardEntity {
    private static final long serialVersionUID = -7591338423646985910L;

    @NotNull
    @Column(name = "TYPE_ ", nullable = false, length = 150)
    protected String type;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    protected BigDecimal amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ID")
    protected Account account;

    @Column(name = "COMMENT_", length = 200)
    protected String comment;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @NotNull
    @Column(name = "CATEGORY", nullable = false, length = 150)
    protected String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}