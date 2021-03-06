package it.intersistemi.springframework.security;

import it.intersistemi.springframework.service.UserService;
import it.intersistemi.springframework.dto.AuthorityDto;
import it.intersistemi.springframework.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDto user = userService.findByUserName(username);
		if(user != null) {
			List<AuthorityDto> authorities = userService.listAuthorities(username);
			Collection<? extends GrantedAuthority> grantedAuthorities = authorities.stream()
					.map(a -> new SimpleGrantedAuthority(a.getAuthority()))
					.collect(Collectors.toSet());

			return new User(user.getUserName(), user.getPassword(), user.isEnabled(), true, true, true, grantedAuthorities);
		} else {
			throw new UsernameNotFoundException(username);
		}
	}

}
