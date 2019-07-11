alter table FINANCE_OPERATION alter column TYPE_ rename to TYPE___U10673 ^
alter table FINANCE_OPERATION alter column TYPE___U10673 set null ;
alter table FINANCE_OPERATION add column TYPE_  varchar(150) ^
update FINANCE_OPERATION set TYPE_  = '' where TYPE_  is null ;
alter table FINANCE_OPERATION alter column TYPE_  set not null ;
