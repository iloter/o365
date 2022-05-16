# syntax=docker/dockerfile:1
FROM ubuntu:18.04

RUN docker build vanyouseea/o365-<<EOF
FROM java:8 
ADD o365-1.7.2.jar o365-1.7.2.jar
EXPOSE 9527
EXPOSE 8443
ENTRYPOINT ["java","-jar","o365-1.7.2.jar"]
EOF
