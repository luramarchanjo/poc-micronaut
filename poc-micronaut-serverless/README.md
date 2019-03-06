# Overview

## Docker

1. Execute the command `mvn clean install`
2. Enter in the root directory, check if file Dockerfile exists
3. Run the command `docker build -t micronaut-serverless:latest .`
4. Run the command `docker run --rm --net=host --name=micronaut-serverless micronaut-serverless:latest`
5. Execute the command `curl http://localhost:8080/hello`