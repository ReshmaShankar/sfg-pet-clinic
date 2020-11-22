package guru.springframework.sfgpetclinic.config;

import org.springframework.context.annotation.Bean;

public class DatabaseSource {

    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
