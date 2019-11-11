public class Information {
    private String name,blood_group;
    private int age,id;

    public Information(String n, String bg , int a , int i ){
        name = n;
        blood_group = bg;
        age = a;
        id = i;
    }

    public void Display(){
        System.out.println("Name : "+name);
        System.out.println("Blood group : "+blood_group);
        System.out.println("Age : "+age);
        System.out.println("ID : "+id);
        
    }
    
    public void check(String s){
        String token = "1";
        if(token == s){
            System.out.println("you are welcome");
        }
        else {
            System.out.println("please  try again");
        }
    }
}
