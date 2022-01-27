# kotlin-web-maven-spring-forked-mongo-repo-JAdventure

## Description
A POC for REST web service using mongodb.
Creates a user with credentials.

Uses spring's mongorepository.

## Tech stack
- kotlin
- maven
  - mongo connector
  - springboot
- mongo

## Docker stack
- mongodb:latest
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
- Endpoints
  - localhost/weapons/
  - localhost/weapons/name/shiv

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Data from JAdventure text game](https://github.com/Progether/JAdventure.git)
- [Code concept](https://github.com/ragcrix/StudentInformationSystem.git)
