package com.practica.integracion;

import com.practica.integracion.DAO.AuthDAO;
import com.practica.integracion.DAO.GenericDAO;
import com.practica.integracion.DAO.User;
import com.practica.integracion.manager.SystemManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestValidUser {

	@Mock
	private static AuthDAO mockAuthDao;
	
	@Mock
	private static GenericDAO mockGenericDao;

	@Test
	public void testStartRemoteSystemValidSystem() throws Exception{
		
	}
	
	@Test
	public void testStopRemoteSystemValidSystem()  throws Exception{
		
	}
	@Test
	public void testAddRemoteSystemValidSystem()  throws Exception{
		
	}
	
	@Test
	public void testDeleteRemoteSystemValidSystem()  throws Exception{
		
	}
	

	@Test
	public void testStartRemoteSystemInvalidSystem() throws Exception{
		
	}
	
	@Test
	public void testStopRemoteSystemInvalidSystem()  throws Exception{
		
	}
	@Test
	public void testAddRemoteSystemInvalidSystem()  throws Exception{
		
	}
	
	@Test
	public void testDeleteRemoteSystemInvalidSystem()  throws Exception{
		
	}

}
