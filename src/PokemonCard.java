
public abstract class PokemonCard {
	// types
	public enum Type {pokemon, trainer, energy};
	
	// data members
	String name;
	String number;
	String region;
	String type;
	String flavorText;
	String weakness;
	String resistance;
	String retreatCost;
	int hp;
	int stage;
	Type format;
	boolean holofoil;
	
	// methods
	abstract void callCard();
}
