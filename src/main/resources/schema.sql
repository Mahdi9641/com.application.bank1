CREATE TABLE transaction
(
    id     integer NOT NULL,
    amount integer NOT NULL,
    primary key (id)
);

CREATE TABLE account
(
    id             integer NOT NULL,
    accountNumber  BIGINT     NOT NULL,
    accountBalance BIGINT     NOT NULL,
    primary key (id)
);
