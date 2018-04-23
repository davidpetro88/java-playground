FROM gradle:alpine

MAINTAINER David Petro
USER root

COPY . /user/src/app
WORKDIR /user/src/app

RUN ls -l

CMD ./gradlew bootrun
#RUN tar -xvf /user/src/app/cerealiza-service-app/build/distributions/cerealiza-service-app-*.tar
#RUN ls -l
#RUN echo "hello World"

#ADD . /user/src/app
#RUN export JAVA_OPTS="-server -Xmx512m -Xms512m";
#ENTRYPOINT /user/src/app/cerealiza-service-app-*/bin/cerealiza-service-app
EXPOSE 9001
