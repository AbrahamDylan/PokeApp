package skaro.pokeapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("skaro.pokeapi.base-uri=https://pokeapi.co/api/v2/")
public class PokeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(PokeAppApplication.class, args);
    }

}