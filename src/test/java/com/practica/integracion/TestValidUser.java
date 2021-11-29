package com.practica.integracion;

import com.practica.integracion.DAO.AuthDAO;
import com.practica.integracion.DAO.GenericDAO;
import com.practica.integracion.DAO.User;
import com.practica.integracion.manager.SystemManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
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
		  User validUser = new User("1","Ana","Lopez","Madrid", (List<Object>) new ArrayList<Object>(Arrays.asList(1, 2)));
		  when(mockAuthDao.getAuthData(validUser.getId())).thenReturn(validUser);

		  String validId = "12345"; // id valido de sistema
		  ArrayList<Object> lista = new ArrayList<>(Arrays.asList("uno", "dos"));
		  when(mockGenericDao.getSomeData(validUser, "where id=" + validId)).thenReturn(lista);
		  // primero debe ejecutarse la llamada al dao de autenticación
		  // despues el de  acceso a datos del sistema (la validaciones del orden en cada prueba)
		  InOrder ordered = inOrder(mockAuthDao, mockGenericDao);
		  // instanciamos el manager con los mock creados
		  SystemManager manager = new SystemManager(mockAuthDao, mockGenericDao);
		  // llamada al api a probar
		  Collection<Object> retorno = manager.startRemoteSystem(validUser.getId(), validId);
		  assertEquals(retorno.toString(), "[uno, dos]");
		  // vemos si se ejecutan las llamadas a los dao, y en el orden correcto
		  ordered.verify(mockAuthDao, times(1)).getAuthData(validUser.getId());
		  ordered.verify(mockGenericDao, times(1)).getSomeData(validUser, "where id=" + validId);
	}
	
	@Test
	public void testStopRemoteSystemValidSystem()  throws Exception{
		  
		  User validUser = new User("1","Ana","Lopez","Madrid", (List<Object>) new ArrayList<Object>(Arrays.asList(1, 2)));
		  when(mockAuthDao.getAuthData(validUser.getId())).thenReturn(validUser);
		
		  String validId = "12345"; // id valido de sistema
		  ArrayList<Object> lista = new ArrayList<>(Arrays.asList("uno", "dos"));
		  when(mockGenericDao.getSomeData(validUser, "where id=" + validId)).thenReturn(lista);
		  
		  // primero debe ejecutarse la llamada al dao de autenticación
		  // despues el de  acceso a datos del sistema (la validaciones del orden en cada prueba)
		  InOrder ordered = inOrder(mockAuthDao, mockGenericDao);
		  
		  // instanciamos el manager con los mock creados
		  SystemManager manager = new SystemManager(mockAuthDao, mockGenericDao);
		  
		  // llamada al api a probar
		  Collection<Object> retorno = manager.stopRemoteSystem(validUser.getId(), validId);
		  assertEquals(retorno.toString(), "[uno, dos]");
		  
		  // vemos si se ejecutan las llamadas a los dao, y en el orden correcto
		  ordered.verify(mockAuthDao, times(1)).getAuthData(validUser.getId());
		  ordered.verify(mockGenericDao, times(1)).getSomeData(validUser, "where id=" + validId);
	}
	@Test
	public void testAddRemoteSystemValidSystem()  throws Exception{
		User validUser = new User("1","Ana","Lopez","Madrid", (List<Object>) new ArrayList<Object>(Arrays.asList(1, 2)));
		  when(mockAuthDao.getAuthData(validUser.getId())).thenReturn(validUser);
		  
		  String validId = "12345"; // id valido de sistema
		  ArrayList<Object> lista = new ArrayList<>(Arrays.asList("uno", "dos"));
		  when(mockGenericDao.getSomeData(validUser, "where id=" + validId)).thenReturn(lista);
		  
		// primero debe ejecutarse la llamada al dao de autenticación
		  // despues el de  acceso a datos del sistema (la validaciones del orden en cada prueba)
		  InOrder ordered = inOrder(mockAuthDao, mockGenericDao);
		  
		// instanciamos el manager con los mock creados
		  SystemManager manager = new SystemManager(mockAuthDao, mockGenericDao);
		  
		  manager.addRemoteSystem(validUser.getId(), validId);
		  
		  // vemos si se ejecutan las llamadas a los dao, y en el orden correcto
		  ordered.verify(mockAuthDao).getAuthData(validUser.getId());
		  ordered.verify(mockGenericDao).updateSomeData(validUser, "where id=" + validId);
		  
		
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
