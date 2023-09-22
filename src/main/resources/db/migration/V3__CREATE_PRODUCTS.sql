CREATE TABLE tb_product (
    product_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    image VARCHAR(255),
    category_id BIGINT NOT NULL,
    quantity INT,
    price INT,
    description TEXT,
    FOREIGN KEY (category_id) REFERENCES tb_category(category_id)
);
