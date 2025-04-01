# Usa uma imagem do OpenJDK 17 com Alpine Linux
FROM openjdk:17-jdk-alpine

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR gerado para dentro do container
COPY target/*.jar app.jar

# Comando para executar o aplicativo
CMD ["java", "-jar", "app.jar"]
