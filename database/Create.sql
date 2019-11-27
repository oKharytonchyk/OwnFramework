/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     12.11.2019 21:55:44                          */
/*==============================================================*/

drop table Person cascade constraints;
-- drop SEQUENCE person_sequence;
-- FYI SEQUENCE cannot be dropped by idea, but easily from DataGrip
-- DROP TRIGGER person_trigger;


/*==============================================================*/
/* Table: Person                                                */
/*==============================================================*/
create table Person
(
  id        INT         NOT NULL,
  firstName VARCHAR(50) NOT NULL,
  lastName  VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
  -- constraint PK_USER primary key (id)
);

CREATE SEQUENCE person_sequence;
-- FYI SEQUENCE cannot be created by idea, but easily from DataGrip

CREATE TRIGGER person_trigger
  BEFORE INSERT
  ON Person
  FOR EACH ROW
  BEGIN
    SELECT person_sequence.nextval
        INTO :new.id FROM dual;
  END;

-- alter table Person
--   add constraint unique_id UNIQUE (id);

alter table Person
  add constraint check_firstName
CHECK (REGEXP_LIKE(firstName, '[^";]{1,50}$'));

alter table Person
  add constraint check_lastName
CHECK (REGEXP_LIKE(lastName, '[^";]{1,50}$'));

COMMIT;
