create table user_products (id bigserial primary key, billing_number varchar(255), balance numeric(8,2), product_type varchar(255));

insert into user_products (billing_number, balance, product_type) values
                                     ('t1248', 10, 'card'),
                                     ('t1242', 50, 'virtual'),
                                     ('t1245', 100, 'billing');
