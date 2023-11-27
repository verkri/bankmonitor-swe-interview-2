DELETE FROM participant;
INSERT INTO participant (fullname) VALUES
  ('Kovacs Laszlo'),
  ('Kovacs Laszlo'),
  ('Nemeth Krisztian'),
  ('Lovasz Katalin');

DELETE FROM mortgage;
INSERT INTO mortgage (participant_id, amount, currency) VALUES
  (1, 123000000, 'HUF'),
  (2, 30000000, 'HUF'),
  (3, 9900000, 'USD'),
  (4, 50000000, 'CHF');