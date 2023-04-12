package aluno.utfpr.samuel.Simplemessenger.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@EnableWebSecurity
@Configuration
public abstract class SecurityConfig{
    
    @Autowired
    private static UserDetailsService loginUserService;

    @Bean
    public static BCryptPasswordEncoder createrPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    protected static void configure(AuthenticationManagerBuilder althenticationManagerBuilder)throws Exception{
        althenticationManagerBuilder.userDetailsService(loginUserService).passwordEncoder(createrPasswordEncoder());
    }


    protected static void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeRequests()
            .antMatchers("/app/**").authenticated()
            .and()
            .httpBasic()
            .and()
            .authorizeRequests()
            .anyRequest().permitAll()
            .and()
            .csrf().disable();
    }

    

    
}
