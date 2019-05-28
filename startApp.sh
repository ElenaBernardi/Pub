#!/bin/bash

docker-compose build

docker-compose up -d axonserver postgres
docker-compose up