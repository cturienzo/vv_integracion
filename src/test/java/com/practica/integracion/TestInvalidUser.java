package com.practica.integracion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.practica.integracion.manager.SystemManagerException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;

import com.practica.integracion.DAO.AuthDAO;
import com.practica.integracion.DAO.GenericDAO;
import com.practica.integracion.DAO.User;
import com.practica.integracion.manager.SystemManager;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class TestInvalidUser {

	@Mock
	private static AuthDAO mockAuthDao;
	
	@Mock
	private static GenericDAO mockGenericDao;
	
	
	@Test
	
	public void startRemoteSystemValidSystem() throws Exception{
		
		  User invalidUser = new User("1","Ana","Lopez","Madrid", new ArrayList<Object>(Arrays.asList(1, 2)));
		  when(mockAuthDao.getAuthData(invalidUser.getId())).thenReturn(null);

		  String validId = "12345"; // id valido de sistema
		  ArrayList<Object> lista = new ArrayList<>();
		  when(mockGenericDao.getSomeData(invalidUser, "where id=" + validId)).thenReturn(lista);

		  // instanciamos el manager con los mock creados
		  SystemManager manager = new SystemManager(mockAuthDao, mockGenericDao);
		  
		  // llamada al api a probar
		  assertThrows(SystemManagerException.class, () -> {
			  manager.startRemoteSystem(invalidUser.getId(), validId);
		  });

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
