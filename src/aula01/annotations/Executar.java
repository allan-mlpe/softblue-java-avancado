package aula01.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //define que só métodos podem receber esta anotação
@Retention(RetentionPolicy.RUNTIME) //define que a anotação estará disponível em tempo de execução
public @interface Executar {
	String arg();
}
