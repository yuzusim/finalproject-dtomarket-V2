-- user 정보
insert into user_tb(role, username, password, phone, birth, email, created_at) values(1, 'admin', '1234', '010-1234-5678', '1970-12-03','admin@nate.com', now());
insert into user_tb(role, username, password, phone, birth, email, created_at) values(2, 'ssar', '1234', '010-2222-2222', '1980-03-21','ssar@nate.com', now());
insert into user_tb(role, username, password, phone, birth, email, created_at) values(2, 'cos', '1234', '010-3333-3333', '1988-09-22','cos@nate.com', now());
insert into user_tb(role, username, password, phone, birth, email, created_at) values(2, 'love', '1234', '010-4444-4444', '1999-01-26','love@nate.com', now());

-- product 정보
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('성주 참외 1.5kg(4~7입)', 17900, 100, 'prod_3.jpg' ,NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('바나나 실속 2종', 4800, 100, 'prod_4.jpg', NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('당도선별 천혜향 1kg(4~6입)', 15000, 100, 'prod_1.jpg',NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('대추 방울 토마토 750g', 9900, 100,'prod_2.jpg', NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('애플청포도 500g', 11900, 100, 'prod_7.jpg',NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('고랭지 부사 1.3kg(4~5d입)', 21900, 100, 'prod_6.jpg',NOW());

-- cart 정보
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (2, 1, '부산광역시 진구 부암로', 20, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (2, 3, '부산광역시 진구 신암로', 10, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (2, 4, '부산광역시 진구 거제대로', 5, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (3, 2, '부산광역시 진구 동평로', 15, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (3, 5, '부산광역시 진구 양정로', 10, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (4, 2, '부산광역시 진구 신천대로', 3, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, created_at) VALUES (4, 3, '부산광역시 진구 해맞이로', 20, NOW());

-- order 정보
INSERT INTO order_tb(user_id, status, sum, created_at) VALUES (2, '주문완료', 160000 ,NOW());
INSERT INTO order_tb(user_id, status, sum, created_at) VALUES (3, '주문취소', 100000, NOW());
INSERT INTO order_tb(user_id, status, sum, created_at) VALUES (4, '주문완료', 106000, NOW());

-- order-item 정보
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (2, 1, 1, NOW());
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (2, 3, 1, NOW());
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (2, 4, 1, NOW());
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (3, 2, 2, NOW());
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (3, 5, 2, NOW());
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (4, 2, 3, NOW());
INSERT INTO order_item_tb(user_id, product_id, order_id, created_at) VALUES (4, 3, 3, NOW());
