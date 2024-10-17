import assigment6.*;
public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor textEditor = new TextEditor(characterFactory);


        textEditor.addCharacter('D', "Arial", 14, 10, 10);
        textEditor.addCharacter('a', "Arial", 14, 20, 10);
        textEditor.addCharacter('u', "Arial", 14, 30, 10);
        textEditor.addCharacter('k', "Arial", 14, 40, 20);
        textEditor.addCharacter('e', "Arial", 14, 50, 20);

        textEditor.renderText();

}
}