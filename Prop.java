public class Prop {
    private String name;
    private String location;
    private String description;
    private String character;

    // Constructor
    public Prop(String name, String location, String description, String c) {
        this.name = name;
        this.location = location;
        this.description = description;
        character = c;
    }

    // Method to inspect the prop
    public String inspect() {
       
            return "This prop is a" + name + "here is more about it: " + description;
       
    }

    // Getters and setters (if needed)
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getC(){
        return character;
    }

    public String getInfo(){
        return name;
    }


}
