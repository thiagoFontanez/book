**********************************************
▁ ▂ ▄ ▅ ▆ ▇ █ projeto kotlin █ ▇ ▆ ▅ ▄ ▂ ▁
**********************************************

Project uses kotlin ,springBoot technologies to create rest requests

1) - to start clone the project
2) - in the main folder execute the command
	mvn clean install -DskipeTest
3) - copy the book.txt file to the target folder or command
	cp book.txt target/
4) - to upload the spring boot server
	java -jar book-0.0.1-SNAPSHOT.jar 
**********************************************
	     ▀▄▀▄▀▄ finish ▄▀▄▀▄▀
**********************************************
At the moment it only contains 2 endpoints,local:
**********************************************
List All Books : GET Method
Exemple
http://localhost:8080/book
**********************************************
Find Book by name Book : GET method + param = bookTitle
Exemple
http://localhost:8080/book/find?book=The%20Pigeon
**********************************************