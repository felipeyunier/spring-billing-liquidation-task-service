#empaquetar el jar
# mvn package

#para desempaca el jar
#$ mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

#luego construir la imagen
#docker build -t felipeyunier/spring-billing-liquidation-task-service .
#docker build -t felipeyunier/spring-billing-liquidation-task-service:0.0.1-SNAPSHOT .

#push de la image en docker hub
#docker push felipeyunier/spring-billing-liquidation-task-service:0.0.1-SNAPSHOT


FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-XX:MaxRAMFraction=1","-XshowSettings:vm","-cp","app:app/lib/*","com.peya.billing.task.aws.SpringBillingLiquidationTaskServiceApplication"]