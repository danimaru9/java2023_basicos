package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudadService {
	static CiudadesService service=new CiudadesService();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.guardarCiudad("Madrid", 3500000, "España");
		service.guardarCiudad("Sevilla", 1000000, "España");
		service.guardarCiudad("París", 5700000, "España");
		service.guardarCiudad("Bruselas", 800000, "España");
		service.guardarCiudad("Barcelona", 1800000, "España");
	}

	@Test
	void testGuardarCiudad() {
		service.guardarCiudad("Burdeos", 100000, "Francia");
		assertEquals(2, service.ciudadesPorPais("Frencia").size());

	}

	@Test
	void testCiudadesPorPais() {
		fail("Not yet implemented");
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("Paris", service.ciudadMasPoblada().getCiudad());
	}

	@Test
	void testEliminarCiudad() {
		assertEquals(2, service.ciudadesPorPais("España").size());
	}

}
