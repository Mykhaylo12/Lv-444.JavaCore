package pt3;

public enum continents {
    AFRICA, AMERICA, ASIA, EUROPE, AUSTRALIA, ANTARCTICA;

    public void getContinent(String country){
        switch (country) {
            case "Nigeria": case "Egypt": case "Uganda":
                System.out.println(continents.AFRICA);
                break;
            case "Ukraine": case "German": case "Poland":
                System.out.println(continents.EUROPE);
                break;
            case "China": case "Russian": case "Thailand":
                System.out.println(continents.ASIA);
                break;
            case "USA": case "Canada": case "Mexico":
                System.out.println(continents.AMERICA);
                break;
            case "Australia":
                System.out.println(continents.AUSTRALIA);
                break;
            default:
                System.out.println("I don't know there is this country");
        }
    }
}
