
public class Student{
    private String name,id,group,email;

    Student(){
        name = "Student";
        id="000";
         group="K62CB";
          email = "uet@vnu.edu.vn";
    }
    Student(String name,String id,String group,String email){
       this.name=name;
       this.id=id;
       this.group=group;
       this.email=email;    
    }
    public String getName(){
        return name;
}   
    public void setName(String n){
        name =n;
    }
    public String getId(){
        return id;
}
    public void setId(String n){
        id =n;
    }
    public String getGroup(){
        return group;
}
    public void setGroup(String n){
        group =n;
    }
    public String getEmail(){
        return email;
}
    public void setEmail(String n){
        email =n;
    }
    public String getInfo(){
        return this.name+" - "+this.id+" - "+this.group+" - "+this.email;
    }
}