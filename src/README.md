# Introduction

## Deploy

1. package

    ```mvn clean package```
2. move this package from local to serve.
3. create database "simpleblog"
4. execute `init.sql` in the root folder of this reposity.
5. execute this jar.

    ```nohup java -jar xxx.jar &```
6. config nginx
