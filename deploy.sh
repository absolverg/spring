#!/bin/zsh

echo "> Start Build"
./gradlew build -x test

echo "> Docker build"
nerdctl build --platform=amd64,arm64 -t absolver/spring-toy:latest .

# echo "> Docker Push"
# nerdctl image push absolver/spring-toy:latest

echo "> Docker compose up"
nerdctl compose -f docker-compose.yml up -d