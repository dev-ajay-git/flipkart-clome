# Build the JAR first
mvn clean package -DskipTests

# Then build Docker image
docker build -f docker/Dockerfile.product -t flipkart/product-service .

docker build -f docker/Dockerfile.order -t flipkart/order-service .

docker build -f docker/Dockerfile.user -t flipkart/user-service .

docker build -f docker/Dockerfile.gateway -t flipkart/gateway-service .

docker build -f docker/Dockerfile.config -t flipkart/config-server .
