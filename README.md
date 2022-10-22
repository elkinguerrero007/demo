# demo

>> * sudo yum update
>> * sudo yum install git
>> * sudo yum install java-11-openjdk-devel
>> * sudo yum-config-manager --add-repo
>> * http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo
>> * sudo yum-config-manager --enable epel-apache-maven
>> * sudo yum install -y maven
>> * sudo alternatives --config java
>> * sudo alternatives --config javac
>> * sudo firewall-cmd --zone=public --add-port=8080/tcp
>> * sudo firewall-cmd --zone=public --add-port=8099/tcp --permanent
>> * sudo firewall-cmd --zone=public --add-port=8080/tcp --permanent
>> * mvn -e package -DskipTests
>> * export JAVA_HOME=$(readlink -f /usr/bin/java | sed "s:bin/java::")
>> * mvn clean package -DskipTests
>> * java -jar Reto3-0.0.1-SNAPSHOT.jar
>> * sudo firewall-cmd --permanent --zone=public --add-service=http
>> * sudo firewall-cmd --reload

