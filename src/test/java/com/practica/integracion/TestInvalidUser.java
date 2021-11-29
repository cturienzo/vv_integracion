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
	public void startRemoteSystemValidSystem() throws Exception{
		
	}
	
	@Test
	public void stopRemoteSystemValidSystem() throws Exception{
		
	}
	@Test
	public void addRemoteSystemValidSystem() throws Exception{
		
	}
	
	@Test
	public void deleteRemoteSystemValidSystem() throws Exception{
		
	}
	

	@Test
	public void startRemoteSystemInvalidSystem() throws Exception{
		
	}
	
	@Test
	public void stopRemoteSystemInvalidSystem() throws Exception{
		
	}
	@Test
	public void addRemoteSystemInvalidSystem() throws Exception{
		
	}
	
	@Test
	public void deleteRemoteSystemInvalidSystem() throws Exception{
		
	}
}
