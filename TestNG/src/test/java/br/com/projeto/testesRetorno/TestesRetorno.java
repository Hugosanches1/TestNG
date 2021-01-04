package br.com.projeto.testesRetorno;

import org.testng.annotations.Test;

@Test(groups = {"testes-retorno","testes-unitario"})
public class TestesRetorno {
	
	@Test(groups = {"retorno","unitario"})
	public String saudacao(){
		System.out.println("Bom dia");
		return "Bom dia";
	}
	
	@Test(groups = {"boolenano","integracao"})
	public boolean verdadeiroFalso(){
		System.out.println("Verdadeiro");
		return true;
	}
	
	@Test(groups = {"void","unitario"})
	public void teste3classeRetorno(){
		System.out.println("Teste void da classe de retorno");
		System.out.println(saudacao());
	}
	
	@Test(groups = {"void","integracao"})
	public void teste4classeRetorno(){
		System.out.println("Teste void 2 da classe de retorno");
		System.out.println(verdadeiroFalso());
	}

}
