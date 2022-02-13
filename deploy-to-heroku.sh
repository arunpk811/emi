APP_NAME=emi-app-pk

mvn clean package\
  -Dquarkus.container-image.build=true\
  -Dquarkus.container-image.group=registry.heroku.com/$APP_NAME\
  -Dquarkus.container-image.name=web\
  -Dquarkus.container-image.tag=latest

docker push registry.heroku.com/$APP_NAME/web
heroku container:release web --app $APP_NAME

heroku logs --app $APP_NAME --tail