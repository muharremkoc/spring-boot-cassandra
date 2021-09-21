# spring-boot-cassandra

This Project Goal,Spring Data Cassandra And CRUD API 

## Installation

- First,docker-compose up -d
- Second,docker ps and copy container ID

![image](https://user-images.githubusercontent.com/80245013/134132759-fedec2fa-43a9-429b-a204-2552a92ccb04.png)

- Third,docker exec -it containerID bash


![image](https://user-images.githubusercontent.com/80245013/134132857-957e1a96-c33f-4baf-bf24-d6bf2aeff537.png)



-Fourth, write cqlsh

![image](https://user-images.githubusercontent.com/80245013/134133004-31a5232b-90b0-4699-a3dd-a124b41f6f51.png)


- Fifth,describe keyspaces;

![image](https://user-images.githubusercontent.com/80245013/134133073-c175508f-e966-49df-83b2-40f8e0f79073.png)


- Sixth,[IF NOT EXISTS] your keyspace,Create keyspace( your application.properties.keyspace name)


 
''  cqlsh> CREATE KEYSPACE userkeyspace WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};("Optional:3")


![image](https://user-images.githubusercontent.com/80245013/134133180-ae8ac96b-8428-4e3c-8a1b-6d7c2090d4e8.png)

describe keyspaces;''

![image](https://user-images.githubusercontent.com/80245013/134133254-01714379-d3a9-43fe-baab-b64cfb1f3c72.png)


- Seventh CREATE TABLE userList( id int PRIMARY KEY,firstName text,lastName text,age int,email text );

![image](https://user-images.githubusercontent.com/80245013/134133448-0c0e8277-204c-4b2b-a0b2-6407cce29ac3.png)


- Last,describe keyspaces; and describe tables; 

![image](https://user-images.githubusercontent.com/80245013/134135857-faccdaf5-2385-4a83-98db-7b4ee16c7498.png)



[Muharrem Koç](https://github.com/muharremkoc/)
