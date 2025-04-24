# Sử dụng Maven với OpenJDK 17 để build ứng dụng
FROM maven:latest AS build

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép tệp cấu hình Maven và mã nguồn ứng dụng vào container
COPY pom.xml .
COPY src ./src

# Nếu bạn dùng Maven Wrapper, cần sao chép thêm:
COPY mvnw ./mvnw
COPY .mvn ./.mvn

# Biên dịch và đóng gói ứng dụng Spring Boot
RUN mvn clean package -DskipTests

# Sử dụng Eclipse Temurin JDK 17 để chạy ứng dụng
FROM eclipse-temurin:17-jdk AS runtime

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép tệp JAR đã được tạo từ bước build vào container chạy
COPY --from=build /app/target/*.jar app.jar

# Mở cổng 8080 để ứng dụng có thể truy cập
EXPOSE 8080

# Chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]