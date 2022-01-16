CREATE TABLE POST
(
    ID   BIGSERIAL PRIMARY KEY NOT NULL,
    NAME VARCHAR               NOT NULL
);

CREATE TABLE COMMENT
(
    ID         BIGSERIAL PRIMARY KEY NOT NULL,
    CONTENT    VARCHAR               NOT NULL,
    POST_ID_FK INTEGER               NOT NULL,
    CONSTRAINT POST_ID_FK FOREIGN KEY (POST_ID_FK) REFERENCES POST (ID)
);

insert into public.post (id, name)
values  (1, 'Test'),
        (2, 'test2'),
        (3, 'Test3');

insert into public.comment (id, content, post_id_fk)
values  (1, 'comment_1', 1),
        (2, 'comment_11', 1),
        (3, 'comment_2', 2),
        (4, 'comment_3', 3);