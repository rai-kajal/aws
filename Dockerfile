FROM openjdk:17
EXPOSE 8080
ADD target/aws.demo-0.0.1.jar aws.demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/aws.demo-0.0.1.jar"]