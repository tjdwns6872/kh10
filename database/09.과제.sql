CREATE table customer(
client_no number unique not null check(client_no >= 0),
client_id varchar2(20) unique not null check(regexp_like(client_id, '^[a-z0-9]{7,19}$')),
client_phone char(13) unique not null check(regexp_like(client_phone, '^010-[0-9]{4}-[0-9]{4}$')),
client_date char(10) not null,
client_lastdate char(10) not null,
client_mileage number default 0 not null ,
client_rank varchar2(12) check(client_rank in('일반', 'VIP', 'VVIP', '플래티넘'))
);

create SEQUENCE customer_seq;

INSERT into customer(
client_no, client_id, client_phone, client_date, client_lastdate, client_mileage, client_rank)
values(customer_seq.nextval, 'testuser1', '010-1212-3434', '2022-01-01', '2022-03-11', 5500, 'VIP');

INSERT into customer(
client_no, client_id, client_phone, client_date, client_lastdate, client_mileage, client_rank)
values(customer_seq.nextval, 'testuser2', '010-2323-4545', '2020-05-11', '2022-01-30', 7200, 'VVIP');

INSERT into customer(
client_no, client_id, client_phone, client_date, client_lastdate, client_mileage, client_rank)
values(customer_seq.nextval, 'testuser3', '010-3434-5656', '2021-11-26', '2021-12-25', 30000, '플래티넘');

INSERT into customer(
client_no, client_id, client_phone, client_date, client_lastdate, client_mileage, client_rank)
values(customer_seq.nextval, 'testuser4', '010-4545-6767', '2022-02-03', '2022-03-15', 500, '일반');

INSERT into customer(
client_no, client_id, client_phone, client_date, client_lastdate, client_mileage, client_rank)
values(customer_seq.nextval, 'testuser5', '010-5656-7878', '2021-12-31', '2022-01-31', 800, '일반');



