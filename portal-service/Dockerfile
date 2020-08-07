FROM centos:7.7.1908

RUN yum install -y java-1.8.0-openjdk

RUN mkdir -p /opt/apps/
COPY ./target/wc-portal-service-1.0.4.jar /opt/apps/wc-portal-service.jar

CMD ["java", "-jar", "/opt/apps/wc-portal-service.jar"]
