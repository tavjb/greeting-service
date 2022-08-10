# Creating a microservice within a network

- To build the image: ```docker build . -t <image-name>```
- To run the image: ```docker run -p1000:1000 --network <network-name> --name <image-name> <image-name>```