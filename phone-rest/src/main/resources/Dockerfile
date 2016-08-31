FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp

MAINTAINER Ankur Saxena

#FROM ubuntu:14.04

#MAINTAINER Ankur Saxena

#ENV DEBIAN_FRONTEND noninteractive

# Update Ubuntu
#RUN apt-get update --fix-missing && apt-get -y upgrade

# Add oracle java 7 repository && Install supervisor
#RUN apt-get -y install software-properties-common supervisor
#RUN add-apt-repository ppa:webupd8team/java
#RUN apt-get -y update

# Accept the Oracle Java license
#RUN echo "oracle-java7-installer shared/accepted-oracle-license-v1-1 boolean true" | debconf-set-selections

# Install Oracle Java
#RUN apt-get -y install oracle-java8-installer
#ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

# Expose ports.
EXPOSE 8080 

ADD phone-rest-0.1.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#CMD /bin/bash
#CMD ["java", "-jar", "/phone-rest-0.1.0.jar"]
