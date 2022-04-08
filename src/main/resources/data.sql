INSERT INTO users(username, password, enabled)
        values (
                'Mark', 'password', true
               );

INSERT INTO users(username, password, enabled)
       values (
               'Aziz', 'password', true
              );

INSERT INTO authorities (username, authority)
        values ('Mark', 'ROLE_USER');

INSERT INTO authorities (username, authority)
values ('Aziz', 'ROLE_ADMIN');