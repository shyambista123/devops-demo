FROM tomcat:10.1.25-jre21-temurin

COPY target/ROOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]