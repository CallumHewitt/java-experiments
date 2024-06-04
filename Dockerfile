FROM ghcr.io/graalvm/native-image-community:21-ol9
WORKDIR /home/app
COPY . .
RUN microdnf -y install findutils
RUN ls -ltr
RUN ./gradlew nativeCompile

ENTRYPOINT ./build/native/nativeCompile/java-experiments
EXPOSE 1200