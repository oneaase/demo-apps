FROM centos:7.7.1908

RUN yum install -y java-1.8.0-openjdk

RUN mkdir -p /opt/apps/
COPY ./target/account-service-1.1.0.jar /opt/apps/account-service.jar

CMD ["java", "-jar", "/opt/apps/account-service.jar"]
