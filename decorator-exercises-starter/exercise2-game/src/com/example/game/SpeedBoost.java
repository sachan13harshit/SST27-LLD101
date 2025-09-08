
public class SpeedBoost implements Character {
    private final Character character;
    private final int speedIncrease;

    public SpeedBoost(Character character, int speedIncrease) {
        this.character = character;
        this.speedIncrease = speedIncrease;
    }

    @Override
    public void attack() {
        character.attack();
    }

    @Override
    public void move() {
        character.move();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speedIncrease;
    }

    @Override
    public int getDamage() {
        return character.getDamage();
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }
}