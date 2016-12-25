/*package com.siv.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;


@Service
public class MyClientDetailServices implements ClientDetailsService{
	
	@Autowired
	private ClientDao clientDao;
	
	public ClientDetails loadClientByClientId(String clientId)
			throws ClientRegistrationException {
		
		CustomClientDetail clientDetails = clientDao.findByClientId(clientId);
		return buildClientForAuthentication(clientDetails);
	}
	
	private ClientDetails buildClientForAuthentication(CustomClientDetail client) {
		
		BaseClientDetails details = new BaseClientDetails();
		details.setAccessTokenValiditySeconds(client.getAccessTokenValidity());
		details.setAuthorities(buildClientAuthority(client.getAuthorities()));
		details.setClientId(client.getClientId());
		details.setClientSecret(client.getClientSecret());
		details.setResourceIds(buildClientInfo(client.getResourceIds()));
		details.setScope(buildClientInfo(client.getScope()));

		return details;
	}
	
	private List<GrantedAuthority> buildClientAuthority(String authority) {
		 
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
 
		setAuths.add(new SimpleGrantedAuthority(authority));
	
 		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
 
		return Result;
	}
	
	private Collection<String>  buildClientInfo(String info){
		Collection<String> additionalList = new ArrayList<String>();
		additionalList.add(info);
		
		return additionalList;
	}

}
*/