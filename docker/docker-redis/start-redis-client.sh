docker run -it --link redis-master --rm docker.io/redis redis-cli -h redis-master -p 6379
docker run -it --link redis-slave --rm docker.io/redis redis-cli -h redis-slave -p 6380
