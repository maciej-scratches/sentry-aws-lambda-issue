# Sentry + AWS Lambda Issue 

This is a sample project illustrating the issue of running Sentry on AWS Lambda (https://github.com/getsentry/sentry-java/issues/1023).

## Prerequisites
- Java 1.8+
- Apache Maven
- [AWS SAM CLI](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install.html)
- Docker

#### Building the project
```
mvn clean install
```

#### Running project locally
```
sam local invoke
```



