FROM intelligentpathways/java8

ADD . /usr/app
WORKDIR /usr/app
RUN ./gradlew build -x test -x integrationTest
CMD ./gradlew bootRun
