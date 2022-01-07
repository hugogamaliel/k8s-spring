FROM openjdk:12-oraclelinux7
VOLUME /tmp
EXPOSE 8080
ADD target/*.jar k8s-spring-1.0.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /k8s-spring-1.0.jar" ]