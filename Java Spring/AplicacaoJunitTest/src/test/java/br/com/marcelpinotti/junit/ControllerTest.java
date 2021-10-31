package br.com.marcelpinotti.junit;



import java.util.List;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class ControllerTest {
	@Autowired
	private TesteModelRepository repository;
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	private TesteModel model;
	
	@Before
	public void start() {
		model = new TesteModel("Marcel", "Pinotti", "marcel@gmail.com");
	}
	
	@Test
	public void saveComNomeNuloDeveLancarException() throws Exception {
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O Nome deve ser preenchido");

		model.setNome(null);
		repository.save(model);
	}
	
	@Test
	public void saveDeveSalvarModel() {
		repository.save(model);
		List<TesteModel> contatos = repository.findAll();
		Assert.assertEquals(1, contatos.size());
		repository.deleteAll();
	}
	
	@Test
	public void deleteByIdDeveRemoverContato() {
		repository.save(model);
		List<TesteModel> contatos = repository.findAll();
		Assert.assertEquals(1, contatos.size());

		repository.deleteById(model.getId());
		List<TesteModel> resultado = repository.findAll();
		Assert.assertEquals(0, resultado.size());
	}
	
}