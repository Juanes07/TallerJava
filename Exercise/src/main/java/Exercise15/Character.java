package Exercise15;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    List<Character> listCharacter = new ArrayList<>();
    void addCharacter(String nameCharacter){
        Character character = new Character(nameCharacter.toUpperCase(Locale.ROOT));
        listCharacter.add(character);
    }
    void searchCharacter(String nameCharacter){
        listCharacter.contains(nameCharacter.toUpperCase(Locale.ROOT));
    }
    void deleteCharacter(String nameCharacter){
        listCharacter.remove(nameCharacter.toUpperCase(Locale.ROOT));
    }

    void editCharacter(int positionName,String editName){
        listCharacter.get(positionName).setName(editName);
    }
    void showCharacter(){
        System.out.println(listCharacter);
    }

    public void setName(String newNameCharacter){
        name = newNameCharacter;
    }
}
