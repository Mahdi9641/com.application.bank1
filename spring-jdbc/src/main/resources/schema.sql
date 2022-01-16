CREATE TABLE transaction
(
    id SERIAL NOT NULL ,
    amount integer NOT NULL,
    primary key (id)
);

CREATE TABLE account
(
    id int NOT NULL,
    accountNumber  BIGINT     NOT NULL,
    accountBalance BIGINT     NOT NULL,
    primary key (id)
);
