-- Insert tech-related categories
INSERT INTO category (name) VALUES
  ('Laptops & Computers'),
  ('Smartphones '),
  ('Gaming Consoles '),

-- Insert tech-related products
INSERT INTO product (name, category_id, quantity, price, description) VALUES
  ('Dell XPS 15 Laptop', 1, 10, 1399, 'High-performance laptop with 4K OLED display'),
  ('iPhone 13 Pro Smartphone', 2, 20, 1099, 'Flagship iPhone with A15 Bionic chip'),
  ('PlayStation 5 Gaming Console', 3, 150, 499, 'Next-gen gaming console with fast SSD'),
  ('Xbox One', 3, 200, 499, 'High-end gaming console from Microsoft'),
  ('Nintendo Switch', 3, 100, 299, 'Versatile gaming console for on-the-go gaming'),
  ('Sony PS4 Pro', 3, 50, 349, 'Powerful gaming console with 4K gaming support'),
  ('Alienware M15 Gaming Laptop', 1, 25, 1799, 'Gaming laptop with high-refresh-rate display'),
  ('MacBook Air', 1, 30, 999, 'Lightweight and sleek laptop by Apple'),
  ('Samsung Galaxy S21 Ultra', 2, 15, 1299, 'Premium Android smartphone with high-res camera'),
  ('Google Pixel 6 Pro', 2, 20, 899, 'Google flagship smartphone with impressive camera features'),

