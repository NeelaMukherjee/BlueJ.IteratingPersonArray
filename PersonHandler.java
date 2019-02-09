 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;
    
//Person p=new Person ();

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        int counter=0;
        while (counter< personArray.length){
        // while `counter` is less than length of array
            // begin loop
result=result+personArray [counter];

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
counter++;
            // end loop
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        
        for(int i=0;i<personArray.length;i++){
           
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                
                result=result+personArray [i];
            // end loop
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
            
            for(Person person:personArray){
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                
                result=result+person;
            // end loop
            
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
