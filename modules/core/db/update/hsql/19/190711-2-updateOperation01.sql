alter table FINANCE_OPERATION alter column TYPE_ rename to TYPE___U09374 ^
alter table FINANCE_OPERATION alter column TYPE___U09374 set null ;
alter table FINANCE_OPERATION add column TYPE_  varchar(150) ^
update FINANCE_OPERATION set TYPE_  = '' where TYPE_  is null ;
alter table FINANCE_OPERATION alter column TYPE_  set not null ;
