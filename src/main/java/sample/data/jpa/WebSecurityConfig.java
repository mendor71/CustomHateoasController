package sample.data.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().and()
                .authorizeRequests()
                // security accounts pages
                .antMatchers(HttpMethod.GET,  "/api/accounts").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,  "/api/accounts").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/accounts").hasRole("ADMIN")
                // security attractions pages
                .antMatchers(HttpMethod.GET,  "/api/attractions").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/api/attractions").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/attractions").hasRole("ADMIN")
                // security coffeebars pages
                .antMatchers(HttpMethod.GET,  "/api/coffeebars").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/api/coffeebars").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/coffeebars").hasRole("ADMIN")
                // security cats pages
                .antMatchers(HttpMethod.GET,  "/api/cats").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/api/cats").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/cats").hasRole("ADMIN")
                // security cities pages
                .antMatchers(HttpMethod.GET,  "/api/cities").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/api/cities").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/cities").hasRole("ADMIN")
                // security customers pages
                .antMatchers(HttpMethod.GET,  "/api/customers").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/api/customers").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/customers").hasRole("USER")
                // security dogses pages
                .antMatchers(HttpMethod.GET,  "/api/dogses").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/api/dogses").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/dogses").hasRole("ADMIN")
                // security hotels pages
                .antMatchers(HttpMethod.GET,   "/api/hotels").hasRole("USER")
                .antMatchers(HttpMethod.PUT,   "/api/hotels").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,  "/api/hotels").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/api/hotels*").hasRole("ADMIN").and()
                .csrf().disable();
    }
}
