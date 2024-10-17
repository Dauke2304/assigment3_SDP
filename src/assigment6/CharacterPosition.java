package assigment6;

public class CharacterPosition {
    private Character character;
    private int x;
    private int y;

    public CharacterPosition(Character character, int x, int y) {
        this.character = character;
        this.x = x;
        this.y = y;
    }

    public void render() {
        character.render(x, y);
    }
}
