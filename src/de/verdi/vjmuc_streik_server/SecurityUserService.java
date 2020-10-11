package de.verdi.vjmuc_streik_server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserService implements UserDetailsService {
	
	@Value("${key.cn}")
	private String commonName;
	
	private Log log = LogFactory.getLog(getClass());
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		
		log.debug("User with Username '" + username + "' is trying to connect!");
		if (commonName.equals(username)) {
			return new User(username, "", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
		}
		log.warn("User with Username '" + username + "' not found");
		throw new UsernameNotFoundException("User not found!");
	}
}
