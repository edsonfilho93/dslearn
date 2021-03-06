INSERT INTO tb_user (name, email, password)
VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password)
VALUES ('Bob Bear', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password)
VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');


INSERT INTO tb_role (authority)
VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority)
VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority)
VALUES ('ROLE_ADMIN');


INSERT INTO tb_user_role (user_id, role_id)
VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id)
VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id)
VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id)
VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id)
VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id)
VALUES (3, 3);


INSERT INTO tb_course (name, img_uri, img_gray_uri)
VALUES ('BOOTCAMP HTML',
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT46CMo2HgLUdALfI7LMXD4PxjLn5WoyPponSGR2YAjopfYxzTDHcwpBsq_r4shtPcFcVw&usqp=CAU');


INSERT INTO tb_offer(edition, start_moment, end_moment, course_id)
VALUES ('1.0',
        TIMESTAMP WITH TIME ZONE '2021-01-10T20:50:07.12345Z',
        TIMESTAMP WITH TIME ZONE '2022-01-10T20:50:07.12345Z',
        1);
INSERT INTO tb_offer(edition, start_moment, end_moment, course_id)
VALUES ('2.0',
        TIMESTAMP WITH TIME ZONE '2021-01-10T20:50:07.12345Z',
        TIMESTAMP WITH TIME ZONE '2022-01-10T20:50:07.12345Z',
        1);


INSERT INTO tb_resource(title, description, position, img_uri, type, offer_id)
VALUES ('Trilha HTML',
        'Trilha principal do curso',
        1,
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        1,
        1);
INSERT INTO tb_resource(title, description, position, img_uri, type, offer_id)
VALUES ('F??rum',
        'F??rum de perguntas do bootcamp',
        2,
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        2,
        1);
INSERT INTO tb_resource(title, description, position, img_uri, type, offer_id)
VALUES ('Lives',
        'Lives exclusivas',
        3,
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        0,
        1);


INSERT INTO tb_section(title, description, position, img_uri, resource_id, prerequesite_id)
VALUES ('Cap??tulo 1',
        'Neste cap??tulo vamos come??ar',
        1,
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        1,
        null);
INSERT INTO tb_section(title, description, position, img_uri, resource_id, prerequesite_id)
VALUES ('Cap??tulo 2',
        'Neste cap??tulo vamos continuar',
        2,
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        1,
        1);
INSERT INTO tb_section(title, description, position, img_uri, resource_id, prerequesite_id)
VALUES ('Cap??tulo 3',
        'Neste cap??tulo vamos finalizar',
        3,
        'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d',
        1,
        2);


INSERT INTO tb_enrollment(available, only_update, enroll_moment, refund_moment, offer_id, user_id)
VALUES (true,
        false,
        TIMESTAMP WITH TIME ZONE '2021-01-10T20:50:07.12345Z',
        null,
        1,
        1);
INSERT INTO tb_enrollment(available, only_update, enroll_moment, refund_moment, offer_id, user_id)
VALUES (true,
        true,
        TIMESTAMP WITH TIME ZONE '2021-01-10T20:50:07.12345Z',
        TIMESTAMP WITH TIME ZONE '2022-01-10T20:50:07.12345Z',
        2,
        2);
INSERT INTO tb_enrollment(available, only_update, enroll_moment, refund_moment, offer_id, user_id)
VALUES (true,
        true,
        TIMESTAMP WITH TIME ZONE '2021-01-10T20:50:07.12345Z',
        TIMESTAMP WITH TIME ZONE '2022-01-10T20:50:07.12345Z',
        2,
        1);