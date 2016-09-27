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
                .antMatchers(HttpMethod.GET,  "/accounts").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,  "/accounts").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/accounts").hasRole("ADMIN")
                // security attractions pages
                .antMatchers(HttpMethod.GET,  "/attractions").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/attractions").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/attractions").hasRole("ADMIN")
                // security coffeebars pages
                .antMatchers(HttpMethod.GET,  "/coffeebars").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/coffeebars").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/coffeebars").hasRole("ADMIN")
                // security cats pages
                .antMatchers(HttpMethod.GET,  "/cats").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/cats").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/cats").hasRole("ADMIN")
                // security cities pages
                .antMatchers(HttpMethod.GET,  "/cities").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/cities").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/cities").hasRole("ADMIN")
                // security customers pages
                .antMatchers(HttpMethod.GET,  "/customers").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/customers").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/customers").hasRole("USER")
                // security dogses pages
                .antMatchers(HttpMethod.GET,  "/dogses").hasRole("USER")
                .antMatchers(HttpMethod.PUT,  "/dogses").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/dogses").hasRole("ADMIN")
                // security hotels pages
                .antMatchers(HttpMethod.GET,   "/hotels").hasRole("USER")
                .antMatchers(HttpMethod.PUT,   "/hotels").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,  "/hotels").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/hotels*").hasRole("ADMIN").and()
                .csrf().disable();
    }
}
