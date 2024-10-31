public class Parent{
    
    private String parentName;

    public Parent(String name){
        parentName = name;
    }

    public String getParentName(){
        return parentName;
    }

    public boolean equals(Parent other){
        if (this.getParentName().equals(other.getParentName()))
            {return true;}
        else
            {return false;}

    }
}

