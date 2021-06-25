#!/bin/bash

SUBPROJECT = $1
echo $(pwd;ls -la)
cd ${SUBPROJECT} && yarn run lint && yarn run test:jenkins && cd ..
