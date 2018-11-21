docker run -d --name redis-master -v /Users/dliang/work/BEA/docker/docker-redis/data:/data  docker.io/redis redis-server
docker run  -d --name redis-slave --link redis-master docker.io/redis redis-server --port 6380 --slaveof redis-master 6379

