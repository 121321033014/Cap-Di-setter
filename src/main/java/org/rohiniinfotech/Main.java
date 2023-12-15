package org.rohiniinfotech;


import org.rohiniinfotech.Employee.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// now open pom.xml file and add dependency tag and now add the code in the given url https://mvnrepository.com/artifact/org.springframework/spring-context/6.1.1
// now go to resources and right click and create file as applicationContext.xml
      //then copy past the code that's under(The equivalent file in the XML Schema-style would be..)
      // in the following url https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
      //now create bean tag in the applicationContext.xml
// and write this code
//<bean id="pro" class="org.rohiniinfotech.Employee.Project">
//    <property name="projectid">
//        <value>123456</value>
//    </property>
//        <property name="projectname">
//            <value>centumproject</value>
//        </property>
//        <property name="projectCode">
//            <value>CTE001</value>
//        </property>
//        <property name="projectmanager">
//            <value>Kim Namjoon</value>
//    </property>
//    </bean>
//later run the main method code we can see the output of the respected class
  // that was specified in the bean tag
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Project p=context.getBean("pro",Project.class);
        p.display();

    }
}