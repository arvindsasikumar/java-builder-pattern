public class Vehicle{
  
  public class Builder{
  
    private String type;
    private String color;
    private int noOfWheels;
    private int id;
    
    public Builder(int id){
    
      this.id = id;
    }
    
    public Builder setType(String type){
    
      this.type = type;
      return this;
    }
    
    public Builder setColor(String color){
      
      this.color = color;
      return this;
    }
    
    public Builder setNoOfWheels(int noOfWheels){
      this.noOfWheels = noOfWheels;
      return this;
    }
    
    public Vehicle build(){
      
      return new Vehicle(this);
    }
  }
  
  private Vehicle(Builder builder){
    
    this.id = builder.id;
    this.type = builder.type;
    this.color = builder.color;
    this.noOfWheels = noOfWheels;
  }
}
