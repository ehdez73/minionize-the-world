#!/bin/bash
docker rmi -f $(docker images | grep '^<none>' | tr -s ' ' | cut -d ' ' -f 3)
