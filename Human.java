public class Human {
    private String name;
    private String alibi;
    private String backstory;
    private String role;  // Role 

    public Human(){
        
    }
    
    public Human(String name, String alibi, String backstory, String role) {
       this.name=name;
        this.alibi = alibi;
        this.backstory = backstory;
        this.role=role;
    
    }

    // getters/setter
    public String getName(){
        return name;
    }
    public String getAlibi() {
        return alibi;
    }

    public String getBackstory() {
        return backstory;
    }
    public String getRole(){
        return role;
    }

   
   
    

    public void describe() {
        System.out.println("Alibi: " + alibi);
        System.out.println("Backstory: " + backstory);
    }
}
