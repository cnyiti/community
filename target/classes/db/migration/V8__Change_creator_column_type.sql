alter table QUESTION alter column CREATOR BIGINT default not null;
alter table COMMENT alter column COMMENTATOR BIGINT default not null;