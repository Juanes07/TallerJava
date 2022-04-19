package Exercise15;

import java.util.ArrayList;

public class Movies extends Info {
    public Movies(String nameCharacter, String nameMovies, String typeMovies){
        this.nameCharacter = nameCharacter;
        this.nameMovies = nameMovies;
        this.typeMovies = typeMovies;
    }

    public Movies() {

    }

    void addInfoMovies (){
        ArrayList<Movies> myMovies = new ArrayList<>();
        Movies i1 = new Movies("JHONY DEPP", "Piratas del caribe", "Accion");
        myMovies.add(i1);
        Movies i2 = new Movies("JHONY DEPP", "Alicia en el pais de las maravillas", "Fantasia");
        myMovies.add(i2);
        Movies i3 = new Movies("MORGAN FREEMAN", "Invictus", "Drama");
        myMovies.add(i3);
        Movies i4 = new Movies("SCARLETT JOHANSSON", "Black Widow", "Accion");
        myMovies.add(i4);
    }
}
