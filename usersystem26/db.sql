alter table profile add flag Integer default 0
select * from PROFILE
update PROFILE set flag=1 where id=10088