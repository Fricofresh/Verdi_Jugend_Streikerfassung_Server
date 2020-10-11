package de.verdi.vjmuc_streik_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecrurityConfig extends WebSecurityConfigurerAdapter {
	
	@Value("${key.cn}")
	private String commonName;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// http.authorizeRequests().anyRequest().authenticated().and().x509().subjectPrincipalRegex("CN=(.*?)(?:,|$)");
		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().x509()
				.subjectPrincipalRegex("CN=(.*?)(?:,|$)").userDetailsService(userDetailsService());
	}
	
	@Override
	@Bean
	public UserDetailsService userDetailsService() {
		
		return new UserDetailsService() {
			
			@Override
			public UserDetails loadUserByUsername(String username) {
				
				if (username.equals(commonName)) {
					return new User(username, "", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
				}
				throw new UsernameNotFoundException("User not found!");
			}
		};
	}
	
}
