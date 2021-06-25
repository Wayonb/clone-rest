#!/bin/bash

SUBPROJECT = $1
cd ${SUBPROJECT} && yarn run lint && yarn run test:travis && cd ..
