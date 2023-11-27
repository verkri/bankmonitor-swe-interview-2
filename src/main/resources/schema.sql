CREATE TABLE IF NOT EXISTS participant (
  participant_id INT GENERATED ALWAYS AS IDENTITY,
  fullname VARCHAR(200) NOT NULL,
  PRIMARY KEY(participant_id)
);

CREATE TABLE IF NOT EXISTS mortgage (
  mortgage_id INT GENERATED ALWAYS AS IDENTITY,
  participant_id INT,
  amount INT NOT NULL,
  currency VARCHAR(3) NOT NULL,
  PRIMARY KEY(mortgage_id),
    CONSTRAINT fk_participant
      FOREIGN KEY(participant_id)
    	  REFERENCES participant(participant_id)
);