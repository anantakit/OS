# Docker-Compose-Team<br/>

# pull and run mysql<br/>
<ul>
  <li>docker run --name=mysql -e MYSQL_ROOT_PASSWORD=keep1234 -e MYSQL_DATABASE=test -p 3306:3306 -d mysql</li>
</ul>

# pull and run phpmyadmin<br/>
<ul>
  <li>docker run --name myadmin -d --link keeplearning:db -p 8081:80 phpmyadmin/phpmyadmin</li>
</ul>

## phpmyadmin<br/>
http://localhost:8081<br/>

# command<br/>
<ul>
  <li>docker exec -it container_name bash</li>
  <li>mysql -u root -p</li>
  <li>ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'keep1234'</li>
</ul>

