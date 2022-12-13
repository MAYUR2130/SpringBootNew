FROM openjdk:11
COPY ./target/first_project-1.jar /usr/src/myapp/first_project-1.jar
WORKDIR /usr/src/myapp
EXPOSE 8080
CMD ["java","-jar","first_project-1.jar"]
