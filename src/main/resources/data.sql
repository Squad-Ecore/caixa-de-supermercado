INSERT INTO CATEGORIA(nome) VALUES('Frutas');
INSERT INTO CATEGORIA(nome) VALUES('Higiene Pessoal');

INSERT INTO PRODUTO(nome, codigo_de_barras, quantidade_em_estoque, preco, data_de_validade, categoria_id)
VALUES('Maçã', '123866252FFAG', 73, 3.50, '2025-05-05', 1);

INSERT INTO PRODUTO(nome, codigo_de_barras, quantidade_em_estoque, preco, data_de_validade, categoria_id)
VALUES('Pera', 'HGDG636EFFD6E', 16, 2.87, '2026-02-05', 1);

INSERT INTO PRODUTO(nome, codigo_de_barras, quantidade_em_estoque, preco, data_de_validade, categoria_id)
VALUES('Creme Dental Colgate', 'GGS62355345SF', 24, 4.98, '2025-10-10', 2);

INSERT INTO CLIENTE(nome, endereco, telefone, email, possui_cartao_loja) VALUES('Ruan', 'Rua das Águas','11918872625', 'ruan@email.com', true);
INSERT INTO CLIENTE(nome, endereco, telefone, email, possui_cartao_loja) VALUES('Carlos', 'Rua das Claras','1194273652', 'carlos@email.com', false);
INSERT INTO CLIENTE(nome, endereco, telefone, email, possui_cartao_loja) VALUES('Oscar', 'Rua dos Peixes','1198763523', 'oscar@email.com', false);

INSERT INTO CARRINHO(valor_total_compra, cliente_id) VALUES(342.75, 1);
INSERT INTO CARRINHO(valor_total_compra, cliente_id) VALUES(420.30, 2);
INSERT INTO CARRINHO(valor_total_compra, cliente_id) VALUES(87.98, 3);