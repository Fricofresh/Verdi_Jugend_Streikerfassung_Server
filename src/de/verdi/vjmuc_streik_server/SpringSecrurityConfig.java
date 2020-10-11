package de.verdi.vjmuc_streik_server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecrurityConfig extends WebSecurityConfigurerAdapter {
	
	private Log log = LogFactory.getLog(getClass());
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null)
			log.debug("User with Username '" + auth.getName() + "' is trying to connect!");
		
		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().x509()
				.subjectPrincipalRegex("CN=(.*?)(?:,|$)");
	}
	
}
