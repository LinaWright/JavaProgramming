package office_hour.day17_04_12_2022;

public class ConstructorIntro {

    /*

    What is Constr ?

    - It is a special method to init all instance Variables  for CURRENT OBJECT
    - Constructor name MUST be SAME with CLASSNAME
    - DOES NOT HAVE RETURN TYPE



    When it works ?

    - it works when you call it.

     ConstructorIntro c =  new ConstructorIntro();



     - Structure

            AccessModifier ClassName(){

            }

            public Car(){
               // No ARG Constr

            }


    Types of Constr


    1- No ARG Constr

         - if we dont create any CONSTR , Compiler will create DEFAULT Constr (with no param)

         - if you create CONSTR either with param OR not , compiler will not create it for you


     2- Parameterized Constr

        - if you want to init your instances , you need to pass your values as arg


         public class Rectangle {

            int length ;

            int width ;

            public Rectangle(int length,int width){

            this.length=length;
            this.width=width ;

            }

            // Java prioritizes local variables
            // that s why we need to specify current Object instance variable with this

         }


        Constructor Chaining --> Call one Constr from ANother One

        - use this() to call another constr
        - it MUST be in FIRST LINE for another Constr
        - Can not call more than ONE CONSTR with this()
        - Can not call ITSELF


        This VS This()

        this : it refers current OBJECT

                this.instanceMethd();
                this.instanceVar;


        this() : it refers current OBJECT Constructor.It can take parameters too




        Amazon

                user (M)                  UserInfo(user,password);
                password (M)              UserInfo(user,password,card);
                card (optional )
                address (Optional)
                DoB   (Optional)

               UserInfo(user,password,card,address,DoB);


     */
}


