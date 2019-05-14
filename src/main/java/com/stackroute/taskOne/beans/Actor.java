//Task 1:
//Create a Maven project and add required dependency of spring-context 5.1.4.RELEASE

//Create a Main class in package com.stackroute and two Spring Beans – Movie, and Actor in
//package com.stackroute.domain.

//Actor has two String properties, name and gender, and an age property of type int.
//An Actor can be initialized with the three properties via the corresponding setter methods. Use
//property based injection in the bean definition file (beans.xml)
//Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
//based object injection in the bean definition file (beans.xml)
//The Main class looks up Movie bean via three ways to print out actor information:
//1. Using XmlBeanFactory
//2. Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
//3. Using ApplicationContext
//Create a spring-xml-demo repo and push the code to master branch.

package com.stackroute.taskOne.beans;


public class Actor{
    String name;
    String gender;
    int age;

//    public Actor() {
//    }

    public Actor() {

    }

    public Actor(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor Details \n" +
                "Name='" + name + '\'' +
                "\n Gender='" + gender + '\'' +
                "\n Age=" + age;


    }
}

