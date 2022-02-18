INSERT INTO USER_ROLE(type) VALUES ('USER');
INSERT INTO TABLE_USER(username, password, fullname, email)
VALUES ('bill','abc123', 'Bill','Watcher','bill@xyz.com');

INSERT INTO APP_USER_ROLE (user_id, user_role_id)
  SELECT user.id, role.id FROM TABLE_USER user, USER_ROLE role  
  where user.username='bill' and role.type='USER';