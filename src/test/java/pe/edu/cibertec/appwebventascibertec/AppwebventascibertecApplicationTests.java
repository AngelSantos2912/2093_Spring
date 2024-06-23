package pe.edu.cibertec.appwebventascibertec;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.cibertec.appwebventascibertec.model.bd.Usuario;
import pe.edu.cibertec.appwebventascibertec.service.UsuarioService;


@SpringBootTest
class AppwebventascibertecApplicationTests {

	@Autowired
	private UsuarioService usuarioService;
	@Test
	void contextLoads() {
		Usuario  usuario= new Usuario();
		usuario.setNomusuario("angel");
		usuario.setEmail("angel@gmail.com");
		usuario.setNombres("Angelito");
		usuario.setApellidos("Santito");
usuarioService.guardarUsuario(usuario);

	}

}
