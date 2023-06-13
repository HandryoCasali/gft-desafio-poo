import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300 );
        Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500 );
        Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500 );

        VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);


        Loja americanas = new Loja("Americanas", "12345678");
        americanas.adicionaLivro(l1);
        americanas.adicionaLivro(l2);
        americanas.adicionaLivro(l3);

        americanas.adicionaVideoGame(ps4);
        americanas.adicionaVideoGame(ps4Usado);
        americanas.adicionaVideoGame(xbox);

        l2.calculaImposto();
        l3.calculaImposto();

        ps4Usado.calculaImposto();
        ps4.calculaImposto();

        americanas.listaLivros();
        americanas.listaVideoGames();
        americanas.calculaPatrimonio();
    }
}