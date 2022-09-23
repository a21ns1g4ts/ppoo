FROM maven:3.8-jdk-11
RUN mkdir /project
COPY . /project
WORKDIR /project
RUN mvn clean package -DskipTests -X
CMD ["java", "-jar", "target/store-0.0.1-snapshot.jar"]


# docker build -t ppoo/docker-java-store:0.0.1-SNAPSHOT .
# docker run -d -p 8080:8080 ppoo/docker-java-store:0.0.1-SNAPSHOT