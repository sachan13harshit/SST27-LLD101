
public class DamageBoost implements Character {
    private final Character character;
    private final int damageIncrease;

    public DamageBoost(Character character, int damageIncrease) {
        this.character = character;
        this.damageIncrease = damageIncrease;
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
        return character.getSpeed();
    }

    @Override
    public int getDamage() {
        return character.getDamage() + damageIncrease;
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }
}