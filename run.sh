#!/bin/bash

JFILES=()
SUFFIX=".java"
COMMAND="java "

for DIR in */
do
    cd $DIR
    for FILE in *
    do
        
        if [[ $(echo -n $FILE | tail -c5) == $SUFFIX ]]; then
            
            JFILES+=($FILE)
            COMMAND+="${DIR}${FILE} "
        fi
    done
    cd ..

        
done

$COMMAND







