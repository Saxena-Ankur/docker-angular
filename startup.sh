#!/bin/bash          

docker rm -f $(docker ps -qa)
docker rmi $(docker images -q)
lsof -t -i tcp:8080 -s tcp:listen | xargs kill
lsof -t -i tcp:27017 -s tcp:listen | xargs kill


cd phone-rest
mvn clean install
cp target/classes/Dockerfile target/
cd target
docker build . -t spring-boot
cd ..

docker-compose build
docker-compose up -d

cd ..

docker cp ./mongodb-db/phones.json asmdproto1_mongodb_1:phones.json
docker exec -it asmdproto1_mongodb_1 mongoimport -d test -c phones phones.json --jsonArray


 exit
