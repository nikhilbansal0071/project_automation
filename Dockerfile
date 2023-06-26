FROM openjdk:17
EXPOSE 8083
ADD target/spring-boot-starter-parent.jar spring-boot-starter-parent.jar
ENTRYPOINT ["java","-jar","/spring-boot-starter-parent.jar]