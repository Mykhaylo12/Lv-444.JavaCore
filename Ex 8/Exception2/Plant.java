
public class Plant {
	private enum Color {
		White, Red, Blue
	};

	private enum Type {
		TypeOne, TypeTwo, TypeThree
	}

	private Type type;
	private Color color;
	private int size;

	public Plant(String type, String color, int size) throws ColorException, TypeException {

		Color c = colorStrToEnum(color);
		this.color = c;
		Type t = typeStrToEnum(type);
		this.type = t;

		this.size = size;

	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("Input only color blue, red or white");
		}
	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "one":
			return Type.TypeOne;
		case "two":
			return Type.TypeTwo;
		case "three":
			return Type.TypeThree;
		default:
			throw new TypeException("Input only type One, Two or Three");
		}

	}

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
}
