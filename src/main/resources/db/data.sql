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
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (1, 1, '부산광역시 진구 부암로', 20, 80, 60000, NOW());
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (1, 3, '부산광역시 진구 신암로', 10, 90, 50000, NOW());
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (1, 4, '부산광역시 진구 신암로', 5, 95, 50000, NOW());
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (2, 2, '부산광역시 진구 신암로', 15, 85, 30000, NOW());
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (2, 5, '부산광역시 진구 신암로', 10, 90, 70000, NOW());
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (3, 2, '부산광역시 진구 신암로', 3, 97, 6000, NOW());
INSERT INTO cart_tb(user_id, product_id, adress, order_qty, total_qty, total_price, created_at) VALUES (3, 3, '부산광역시 진구 신암로', 20, 80, 100000, NOW());

-- order 정보

