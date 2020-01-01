FROM java:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} administration.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/administration.jar"]
