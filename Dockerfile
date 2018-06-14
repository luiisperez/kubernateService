FROM tomcat
MAINTAINER luis.alejandro120895@gmail.com

ADD testExample.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]