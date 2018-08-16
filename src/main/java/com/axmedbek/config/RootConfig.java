package com.axmedbek.config;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("com.axmedbek")
public class RootConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springtest");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan(new String[]{"com.axmedbek.model"});
        sessionFactoryBean.setHibernateProperties(properties());
        return sessionFactoryBean;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
    }

    public Properties properties(){
        return new Properties(){
            {
                setProperty("hibernate.hbm2ddl.auto","update");
                setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
                setProperty("hibernate.show_sql","true");
                setProperty("hibernate.connection.characterEncoding","UTF-8");
                setProperty("hibernate.connection.useUnicode","true");
            }
        };
    }
}
