package aula03.static_inner_class;

import aula03.static_inner_class.OuterClass.NonStaticInnerClass;

public class Aplicacao {
	
	public static void main(String[] args) {
		//Criando uma instância da InnerClass
		//Note que não precisamos de uma instância da innerClass estática
		OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();
		
		
		//Já para criar uma instância da innerClass não estática, precisamos de uma instância da outerClass primeiro.
		//Criando uma instância de OuterClass
		OuterClass oc = new OuterClass();
		
		NonStaticInnerClass nsic = oc.new NonStaticInnerClass();
		
		
		//imprimindo atributo da outerClass
		System.out.println(oc.x);
		
		//chamando método da innerClass estática
		sic.method();
		
		//chamando método da innerClass não estática
		nsic.method();
		
	}
}
