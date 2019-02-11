# Docker-Compose-Team

# pull and run mysql
docker run --name=mysql -e MYSQL_ROOT_PASSWORD=keep1234 -e MYSQL_DATABASE=test -p 3306:3306 -d mysql

# pull and run phpmyadmin
docker run --name myadmin -d --link keeplearning:db -p 8081:80 phpmyadmin/phpmyadmin

phpmyadmin
http://localhost:8081

# command
docker exec -it container_name bash
mysql -u root -p
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'keep1234';
