create database noordentest;

insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Paulo Santos', '25369863898', '1980-10-25', 'M');
insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Ana Figueredo', '14523699852', '1995-02-02', 'F');
insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Carla Menezes', '65896325485', '1990-12-12', 'F');
insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Cézar Fernandes', '45863259820', '1978-04-30', 'M');
insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Rodrigo Gomes', '85932512530', '1954-08-31', 'M');
insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Manuela Dias', '78532512545', '2000-06-22', 'F');
insert into `client`(`name`, `cpf`, `birthdate`, `sex`) values ('Maria Silva', '12353589612', '1965-03-18', 'F');

insert into `product`(`name`, `price`) values ('Tênis Azul', 149.90);
insert into `product`(`name`, `price`) values ('Sandália Vermelha', 89.99);
insert into `product`(`name`, `price`) values ('Sapatênis Preto', 249.89);
insert into `product`(`name`, `price`) values ('Chinelo Estampado', 59.90);
insert into `product`(`name`, `price`) values ('Mochila Colorida', 165.89);
insert into `product`(`name`, `price`) values ('Bolsa Esportiva', 99.99);
insert into `product`(`name`, `price`) values ('Bota Tratorada', 249.89);

insert into `orders`(`amount`, `client_id`, `product_id`) values (249.89, 5, 7);
insert into `orders`(`amount`, `client_id`, `product_id`) values (165.89, 1, 5);
insert into `orders`(`amount`, `client_id`, `product_id`) values (149.90, 6, 1);
insert into `orders`(`amount`, `client_id`, `product_id`) values (59.90, 3, 4);
insert into `orders`(`amount`, `client_id`, `product_id`) values (149.90, 2, 1);
insert into `orders`(`amount`, `client_id`, `product_id`) values (89.99, 4, 2);
insert into `orders`(`amount`, `client_id`, `product_id`) values (249.89, 7, 3);
insert into `orders`(`amount`, `client_id`, `product_id`) values (99.99, 3, 6);
insert into `orders`(`amount`, `client_id`, `product_id`) values (249.89, 2, 3);
insert into `orders`(`amount`, `client_id`, `product_id`) values (249.89, 6, 3);