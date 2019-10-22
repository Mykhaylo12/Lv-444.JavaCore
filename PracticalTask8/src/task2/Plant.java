package task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    private Color strToColor(String str) throws ColorException{
        switch (str.toLowerCase()){
            case "black":
                return Color.BLACK;
            case "white":
                return Color.WHITE;
            case  "red":
                return Color.RED;
            case "yellow":
                return Color.YELLOW;
            default:
                throw new ColorException("Bad color");
        }
    }

    private Type strToType(String str) throws TypeException{
        switch (str.toLowerCase()){
            case "lily":
                return Type.LILY;
            case "foxglove":
                return Type.FOXGLOVE;
            case  "orchid":
                return Type.ORCHID;
            case "pansy":
                return Type.PANSY;
            default:
                throw new TypeException("Bad type");
        }
    }

    public Plant(int size, String color, String type) throws ColorException, TypeException{
        this.size = size;
            this.color = strToColor(color);
            this.type = strToType(type);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color.toString().toLowerCase() +
                ", type=" + type.toString().toLowerCase() +
                '}';
    }
}
