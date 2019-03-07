# Overview

## Docker

1. Execute the command `mvn clean install`
2. Enter in the root directory, check if file Dockerfile exists
3. Run the command `docker build -t micronaut-serverless:latest .`
4. Run the command `docker run --rm --net=host --name=micronaut-serverless micronaut-serverless:latest`
5. Execute the command `curl http://localhost:8080/hello`

## Knative

1. Run the command `kubectl apply -f knative-service.yaml`
2. Run the command `watch kubectl get pods`
3. Open a new terminal
4. Run the command `kubectl get svc istio-ingressgateway --namespace istio-system` and get the value from `EXTERNAL-IP` column
5. Run the command `kubectl get ksvc micronaut-serverless --output=custom-columns=NAME:.metadata.name,DOMAIN:.status.domain` and get the value from `DOMAIN` column
6. Run the command `curl -H "Host: ${SERVICE_HOST}" http://${ISTIO_INGRESS_GATEWAY}/hello`
