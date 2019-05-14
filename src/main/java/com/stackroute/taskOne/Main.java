package com.stackroute.taskOne;


import com.stackroute.taskOne.beans.Actor;
import com.stackroute.taskOne.beans.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.rowset.spi.XmlReader;

public class Main {
    public static void main(String[] args) {
//       Resource resource=new ClassPathResource("beans.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(resource);
//    Movie movie=(Movie) beanFactory.getBean("movie");
//        System.out.println("Movie : \n Movie Name: "+movie.getMovieName()+"\n Genre: "+movie.getGenreName()+"\n Actor: "+movie.getActor());
//        System.out.println("\n");

//                BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
  //      System.out.println("Movie : \n Movie Name: "+movie.getMovieName()+"\n Genre: "+movie.getGenreName()+"\n Actor: "+movie.getActor());

//        System.out.println("\n");
//
//
//
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie= (Movie) context.getBean("movie");
        //      System.out.println("Movie : \n Movie Name: "+movie.getMovieName()+"\n Genre: "+movie.getGenreName()+"\n Actor: "+movie.getActor());
//        System.out.println("\n");


        Movie movie= (Movie) context.getBean("RSMovies");
        System.out.println("Movie : \n Movie Name: "+movie.getMovieName()+"\n Genre: "+movie.getGenreName()+"\n Actor: "+movie.getActor());
        System.out.println("\n");

        movie= (Movie) context.getBean("GullyBoy");
        System.out.println("Movie : \n Movie Name: "+movie.getMovieName()+"\n Genre: "+movie.getGenreName()+"\n Actor: "+movie.getActor());
        System.out.println("\n");

        Movie movie1=(Movie) context.getBean("movie1",Movie.class);
        System.out.println("Movie : \n Movie Name: "+movie1.getMovieName()+"\n Genre: "+movie1.getGenreName()+"\n Actor: "+movie1.getActor());
        System.out.println("\n");

        Movie movie2=(Movie) context.getBean("movie2");
        System.out.println("Movie : \n Movie Name: "+movie2.getMovieName()+"\n Genre: "+movie2.getGenreName()+"\n Actor: "+movie2.getActor());
        System.out.println("\n");

        Movie movie3=(Movie) context.getBean("movie2");
        System.out.println(movie2==movie3);

    }
}
