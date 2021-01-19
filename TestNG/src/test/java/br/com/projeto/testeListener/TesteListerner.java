package br.com.projeto.testeListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TesteListerner  implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Iniciando o teste");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("O teste PASSOU");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("O teste FALHOU");
	}
	public void onFinish(ITestContext context) {
		System.out.println("Finalizando Teste");
	}
	public void onTestSkipped(ITestResult result) {
	System.out.println("O teste foi skepped");
}
}
