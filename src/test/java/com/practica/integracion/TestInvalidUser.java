package com.practica.integracion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.practica.integracion.DAO.AuthDAO;
import com.practica.integracion.DAO.GenericDAO;

@ExtendWith(MockitoExtension.class)
public class TestInvalidUser {
	
	@Mock
	private static AuthDAO mockAuthDao;
	
	@Mock
	private static GenericDAO mockGenericDao;
	
	
	@Test
	public void startRemoteSystemValidSystem(String userId, String remoteId){
		
	}
	
	@Test
	public void stopRemoteSystemValidSystem(String userId, String remoteId) {
		
	}
	@Test
	public void addRemoteSystemValidSystem(String userId, Object remote) {
		
	}
	
	@Test
	public void deleteRemoteSystemValidSystem(String userId, String remoteId) {
		
	}
	

	@Test
	public void startRemoteSystemInvalidSystem(String userId, String remoteId){
		
	}
	
	@Test
	public void stopRemoteSystemInvalidSystem(String userId, String remoteId) {
		
	}
	@Test
	public void addRemoteSystemInvalidSystem(String userId, Object remote) {
		
	}
	
	@Test
	public void deleteRemoteSystemInvalidSystem(String userId, String remoteId) {
		
	}
}
