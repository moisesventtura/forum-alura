package br.com.alura.forum.config.swagger;

import br.com.alura.forum.modelo.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

@Configuration
public class SwaggerConfigurations {

    @Bean
    public Docket forumApi(){
        return new Docket(DocumentationType.SWAGGER_2) //Tipo da Documentação
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.alura.forum")) //A partir de qual pacote vai começa a ler
                .paths(PathSelectors.ant("/**")) // quais endpoints fazer analise
                .build()
                .ignoredParameterTypes(Usuario.class) // Ignore todas as URLs que trabalham com a classe Usuario, ignorar objetos do tipo Usuario
                .globalOperationParameters( // Adicionar parametros globais
                        Arrays.asList( // recebe a lista com os parametros
                                new ParameterBuilder()
                                        .name("Authorization")
                                        .description("Header para Token JWT")
                                        .modelRef(new ModelRef("string"))
                                        .parameterType("header")
                                        .required(false)
                                        .build()));


        // para acessar localhost:8080/swagger-ui.html
    }
}
