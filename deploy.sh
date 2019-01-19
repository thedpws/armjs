#! /bin/bash

mvn clean compile war:war
cd target
mv armjs-1.0-SNAPSHOT /usr/local/Cellar/tomcat/9.0.14/libexec/webapps
open http://localhost:8080/armjs-1.0-SNAPSHOT