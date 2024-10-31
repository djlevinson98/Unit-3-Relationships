public class Main{    
    
    /*  COMPLETE THE CODE FOR THIS METHOD
     *  1. If one and two refer to the same Kid object, the method should print "Same kid"
     *  2. Regardless of whether one and two refer to the same Kid object, the method should
     *      print "Same parent" if the Parent objects returned by getParent() are equal as 
     *      determined by the equals() method.
     *  3. If the Parent objects returned by getParent() are not equal as determined by the equals() 
     *      method, the method should print "Unrelated"
     */
    public static void determineRelationship(Kid one, Kid two){
        
        //Change this code
        System.out.println("You need to change the code for this method in class Main: determineRelationship");



    }




    public static void main(String[] args){
        System.out.println("\n**********************************************\nThe results below will show you if your code for determineRelationship() works.\n");
        Parent p1 = new Parent("Widmer");
        Parent p2 = new Parent("Oygenblik");
        Parent p3 = new Parent("Shafaie");
        Kid child1 = new Kid(p1);
        Kid child2 = new Kid(p1);
        Kid child3 = new Kid(p2);
        Kid child4 = new Kid(p3);
        Kid childReference = child4;


        System.out.println("Child1 vs. Child2 - Should say \"Same parent\"");
        determineRelationship(child1,child2);

        System.out.println("\nChild3 vs. Child4 - Should say \"Unrelated\"");
        determineRelationship(child3,child4);

        System.out.println("\nChild4 vs. ChildReference - Should say \"Same kid\"");
        determineRelationship(child4,childReference);

        System.out.println("\n**********************************************\n");
        

    }
}
