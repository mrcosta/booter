FROM intelligentpathways/java8

COPY . /usr/app
WORKDIR /usr/app
RUN ./gradlew build -x test -x integrationTest
CMD ./gradlew bootRun
