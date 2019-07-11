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
    TYPE_ varchar(150) not null,
    AMOUNT decimal(19, 2) not null,
    ACCOUNT_ID varchar(36),
    COMMENT_ varchar(200),
    DATE_ date not null,
    CATEGORY varchar(150) not null,
    --
    primary key (ID)
);