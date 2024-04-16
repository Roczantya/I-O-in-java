
public class Dog {
    private String Name;
    private int Age;
    private String ColorFur;
    private String Ukuran;
    private String TypeoFur;
    private String Gender;
    private boolean Makansehari;

    public Dog(){

    }
       
    public Dog (String Name, int Age, String Ukuran, String ColorFur, String TypeofFur, String Gender, boolean Makansehari ){
        this.Name = Name;
        this.Age = Age;
        this.Ukuran=Ukuran;
        this.ColorFur = ColorFur;
        this.TypeoFur = TypeofFur;
        this.Gender = Gender;
        this.Makansehari= Makansehari; 
        
    }
    
    

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name= Name;
    }
    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getColorFur() {
        return ColorFur;
    }
    
    public void setColorFur(String ColorFur) {
        this.ColorFur = ColorFur;
    }

    public String getUkuran(){
        return Ukuran;
    }
    
    public void setUkuran(String Ukuran){
        this.Ukuran = Ukuran;
    }

    public String getTypeoFur() {
        return TypeoFur;
    }

    public void setTypeoFur(String TypeoFur) {
        this.TypeoFur = TypeoFur;
    }

    public String getGender() {
    return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public boolean getMakanSehari() {
        return Makansehari;
    }

    public void setMakanSehari(boolean Makansehari) {
        this.Makansehari = Makansehari;
    }

    public void printDogInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Color of Fur: " + ColorFur);
        System.out.println("Size: " + Ukuran);
        System.out.println("Type of Fur: " + TypeoFur);
        System.out.println("Gender: " + Gender);
        System.out.println("Daily Food Intake: " + Makansehari);
    }
    
    }

