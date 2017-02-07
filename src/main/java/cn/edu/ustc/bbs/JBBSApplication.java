package cn.edu.ustc.bbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * JBBS Spring Boot Application
 *
 * @author guangyu
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class JBBSApplication {

    public static void main(String[] args) {
        SpringApplication.run(JBBSApplication.class, args);
    }
}
