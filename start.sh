#!/bin/bash
service falcon-sensor start
service qualys-cloud-agent start
java -jar lighttower-udp-listener-1.0-SNAPSHOT.jar
