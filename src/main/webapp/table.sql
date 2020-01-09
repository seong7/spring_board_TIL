create table tblBoard(
    bId number(4,0) NOT NULL ENABLE, 
    bName varchar2(20 BYTE),
    bTitle varchar2(100 BYTE),
    bContent VARCHAR2(300 BYTE),
    bDate date DEFAULT SYSDATE,
    bHit NUMBER(4,0),
    CONSTRAINT tblBoard_PK PRIMARY KEY(bID)
);

create SEQUENCE tblBoardSeq;