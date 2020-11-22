package guru.springframework.sfgpetclinic.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
/*@PropertySources({
        @PropertySource("classpath:database.properties")
})*/
public class PropertyConfig {
    @Value("${guru.user}")
    public String user;

    @Value("${guru.pwd}")
    public String password;

    @Value("${guru.url}")
    public String url;

    @Bean
    public DatabaseSource getDatabaseSource() {
        DatabaseSource databaseSource = new DatabaseSource();
        databaseSource.setUser(user);
        databaseSource.setPassword(password);
        databaseSource.setUrl(url);
        return databaseSource;
    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/
}
