#!/bin/sh

PORT=${3:- 27017}

docker run --name questionnaire-mongo -p ${PORT}:27017 mongo
