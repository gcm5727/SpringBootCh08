package com.rubypaper.board.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;



@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	SecurityConfig(){
		 System.out.println("===> SecurityConfig 생성자확인" );
	}
		
	
	@Autowired
	private  BoardUserDetailsService  BoardUserDetails;
	
	@Override
	protected   void  configure(HttpSecurity  security) throws Exception {
		
		System.out.println("===> void  configure ");
		
		security.authorizeRequests().antMatchers("/", "/system/**").permitAll();
		security.authorizeRequests().antMatchers("/board/**").authenticated();
		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
		security.csrf().disable();
	
		security.formLogin().loginPage("/system/login.do").defaultSuccessUrl("/board/getBoardList.do", true);
		security.exceptionHandling().accessDeniedPage("/system/accessDenied.do");
		security.logout().logoutUrl("/system/logout.do").invalidateHttpSession(true).logoutSuccessUrl("/");		
		security.userDetailsService(BoardUserDetails);
		
	}
	
	
	@Bean
	public  PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	

}
