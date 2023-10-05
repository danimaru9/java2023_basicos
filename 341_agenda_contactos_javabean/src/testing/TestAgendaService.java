package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.AgendaService;

class TestAgendaService {
	static AgendaService service;
	@BeforeEach
	void setUp() throws Exception {
		service=new AgendaService();
		service.agregar("c1@gmail.com", "c1", 70, 77777);
		service.agregar("c2@gmail.com", "c2", 70, 77777);
		service.agregar("c3@gmail.com", "c3", 70, 77777);
		service.agregar("c4@gmail.com", "c4", 70, 77777);
		service.agregar("c5@gmail.com", "c5", 70, 77777);
	}
	

	@Test
	void testAgregar() {
		assertTrue(service.agregar("c6@gmail.com","c6", 70, 77777));
		assertFalse(service.agregar("c6@gmail.com","c6", 70, 77777));
		assertEquals(6, service.contactos().length);
	}

	@Test
	void testEliminar() {
		assertFalse(service.eliminar("dddd"));
		assertTrue(service.eliminar("c3@gmail.com"));
		
	}
	@Test
	void testBuscar() {
		assertEquals("c4", service.buscar("c4@gmail.com").getNombre());
	}

	@Test
	void testContactos() {
		assertEquals(5, service.contactos().length);
	}

}
