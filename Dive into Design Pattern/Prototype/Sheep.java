package Prototype;

public class Sheep implements Clonable {
    
    private String name;
    private int age;
    private String type;
    private String owner;
    
    public Sheep(String iName, int iAge, String iType, String iOwner) {
        this.name = iName;
        this.age = iAge;
        this.type = iType;
        this.owner = iOwner;
    }
    
    public Sheep(Sheep iSheep) {
        this.name = iSheep.getName();
        this.age = iSheep.getAge();
        this.type = iSheep.getType();
        this.owner = iSheep.getOwner();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String iName) {
        this.name = iName;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int iAge) {
        this.age = iAge;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String iType) {
        this.type = iType;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String iOwner) {
        this.owner = iOwner;
    }
    
    public Clonable clone() {
        return new Sheep(this);
    }
    
    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
    
}

