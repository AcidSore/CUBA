-- begin PURCHASE_CARD
create table PURCHASE_CARD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CARD_ID integer not null,
    DISCOUNT decimal(19, 2) not null,
    TOTAL_COST decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end PURCHASE_CARD
-- begin PURCHASE_ORDER
create table PURCHASE_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID integer not null,
    COST decimal(19, 2) not null,
    CLIENT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PURCHASE_ORDER
-- begin PURCHASE_CLIENT
create table PURCHASE_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID integer not null,
    FIRST_NAME varchar(100) not null,
    SECOND_NAME varchar(100) not null,
    REGISTRATION_DATE timestamp not null,
    PHONE_NUMBER varchar(15) not null,
    EMAIL varchar(50) not null,
    CARD_ID_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PURCHASE_CLIENT
