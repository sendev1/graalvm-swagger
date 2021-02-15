.PHONY: build

build:
	./gradlew build

compile: build
	./compile.sh

profile:
	echo "profiling to generate config.."
	java -agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image -jar build/libs/swagger-0.0.1-SNAPSHOT.war

clean:
	./gradlew clean

run:
	./build/native-image/swagger

runJar:
	java -jar ./build/libs/swagger-0.0.1-SNAPSHOT.war
