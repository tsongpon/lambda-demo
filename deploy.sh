#!/bin/bash

echo "######### building package #########"
mvn clean package

cd terraform
echo "######### deploy package to Lambda function #########"
terraform apply -auto-approve