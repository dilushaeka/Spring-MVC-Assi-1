package lk.ijse.gde.springmvcassi1.config;

/*This Application Is Copyright Protected
    Author : Dilusha Ekanayaka
    Email  : dilushaeka99@gmail.com
    Date   : 9/15/2023
    Time   : 2:30 AM 
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@PropertySource("classpath:application.properties")

public class HibernateConfig {

    public final Environment env;

    public HibernateConfig(Environment env) {this.env = env;}

    //Factory create
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();

        emf.setDataSource(dataSource);
        emf.setPackagesToScan("lk.ijse.gdse.springmvcassi1.entity");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        emf.setJpaVendorAdapter(vendorAdapter);
        emf.setJpaPropertyMap(hibernateproperties());
        return emf;
    }

    //create data source
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dmd = new DriverManagerDataSource();
        dmd.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dmd.setUrl(env.getProperty("spring.datasource.url"));
        dmd.setUsername(env.getProperty("spring.datasource.username"));
        dmd.setPassword(env.getProperty("spring.datasource.password"));
        return dmd;
    }

    //Transaction
    public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean emf){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf.getObject());
        transactionManager.setEntityManagerFactory(emf.getObject());
        return transactionManager;
    }

    // Load hibernate properties
    private Map<String,String> hibernateproperties() {
        Map<String, String> hibernateProperties = new HashMap<>();
        hibernateProperties.put("spring.jpa.hibernate.hbm2ddl.auto",env.getProperty("spring.jpa.hibernate.ddl-auto"));
        hibernateProperties.put("spring.jpa.hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
        hibernateProperties.put("spring.jpa.hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
        hibernateProperties.put("spring.jpa.hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
        return hibernateProperties;
    }
}
