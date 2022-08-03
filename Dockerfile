FROM adoptopenjdk:11-jdk-hotspot
COPY src/main/docker/wait-for-it.sh .
RUN chmod 744 wait-for-it.sh
ARG JAR_FILE=target/Techreads*.war
COPY ${JAR_FILE} /app/techreads.war
CMD ["java","-jar","/app/techreads.war"]



