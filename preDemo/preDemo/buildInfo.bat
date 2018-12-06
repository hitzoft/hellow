docker build -t hello-compass:%BUILD_NUMBER% .
docker tag hello-compass:%BUILD_NUMBER% hitzoft/hello-compass:%BUILD_NUMBER%
docker images


docker login -u hitzoft --password Zauds137*
docker push hitzoft/hello-compass:%BUILD_NUMBER%

kubectl set image deployment.v1.apps/hello-compass-deployment hello-compass=hitzoft/hello-compass:%BUILD_NUMBER% --record
kubectl rollout status deployment.v1.apps/hello-compass-deployment