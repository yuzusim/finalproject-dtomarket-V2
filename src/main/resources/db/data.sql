-- user 정보
insert into user_tb(role, username, password, phone, birth, email, created_at) values(1, 'admin', '1234', '010-1234-5678', '1970-12-03','admin@nate.com', now());
insert into user_tb(role, username, password, phone, birth, email, created_at) values(2, 'ssar', '1234', '010-2222-2222', '1980-03-21','ssar@nate.com', now());
insert into user_tb(role, username, password, phone, birth, email, created_at) values(2, 'cos', '1234', '010-3333-3333', '1988-09-22','cos@nate.com', now());
insert into user_tb(role, username, password, phone, birth, email, created_at) values(2, 'love', '1234', '010-4444-4444', '1999-01-26','love@nate.com', now());

-- product 정보
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('바나나', 3000, 100, 'banana.jpg' ,NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('딸기', 2000, 100, 'strawberry.jpg', NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('수박', 5000, 100,  'wm.jpg',NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('포도', 10000, 100,'grape.jpg', NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('오렌지', 7000, 100, 'orange.jpg',NOW());

-- cart 정보
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (2, 1, '부산광역시 진구 부암로', 20, 80, 60000, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (2, 3, '부산광역시 진구 신암로', 10, 90, 50000, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (2, 4, '부산광역시 진구 거제대로', 5, 95, 50000, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (3, 2, '부산광역시 진구 동평로', 15, 85, 30000, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (3, 5, '부산광역시 진구 양정로', 10, 90, 70000, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (4, 2, '부산광역시 진구 신천대로', 3, 97, 6000, NOW());
INSERT INTO cart_tb(user_id, product_id, address, order_qty, total_qty, total_price, created_at) VALUES (4, 3, '부산광역시 진구 해맞이로', 20, 80, 100000, NOW());

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
