#!/bin/bash

docker-compose build

docker-compose up -d axonServer
docker-compose up