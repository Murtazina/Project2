-- begin FINANCE_OPERATION
create table FINANCE_OPERATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_  varchar(150) not null,
    AMOUNT decimal(19, 2) not null,
    ACCOUNT_ID varchar(36),
    COMMENT_ varchar(200),
    DATE_ date not null,
    CATEGORY varchar(150) not null,
    --
    primary key (ID)
)^
-- end FINANCE_OPERATION
-- begin FINANCE_ACCOUNT
create table FINANCE_ACCOUNT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(200) not null,
    CURRENCY varchar(150) not null,
    MEANS decimal(19, 2),
    --
    primary key (ID)
)^
-- end FINANCE_ACCOUNT
