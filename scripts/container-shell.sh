#!/bin/bash
# container-shell
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <container-name>"
    exit 
fi

CONTAINER=$1
PS="$( docker ps -a | grep -i "${CONTAINER}")"
if [[ -z "$PS" ]]
then
	echo "Container not found"
else
	echo "Container $CONTAINER found"
	docker exec -i -t $CONTAINER /bin/bash
fi
