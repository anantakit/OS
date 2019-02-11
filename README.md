# Docker-Compose-Team<br/>

# pull and run mysql<br/>
docker run --name=mysql -e MYSQL_ROOT_PASSWORD=keep1234 -e MYSQL_DATABASE=test -p 3306:3306 -d mysql<br/>

# pull and run phpmyadmin<br/>
docker run --name myadmin -d --link keeplearning:db -p 8081:80 phpmyadmin/phpmyadmin<br/>

phpmyadmin<br/>
http://localhost:8081<br/>

# command<br/>
docker exec -it container_name bash<br/>
mysql -u root -p<br/>
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'keep1234';<br/>
