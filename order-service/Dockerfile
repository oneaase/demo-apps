FROM centos:7.7.1908

RUN yum install -y java-1.8.0-openjdk

RUN mkdir -p /opt/apps/
COPY ./target/wc-order-service-0.0.1.jar /opt/apps/wc-order-service.jar

CMD ["java", "-jar", "/opt/apps/wc-order-service.jar"]
