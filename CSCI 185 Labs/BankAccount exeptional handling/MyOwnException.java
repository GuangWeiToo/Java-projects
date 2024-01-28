
public class MyOwnException extends Exception {
	
    //One exception class satisfy all 3 cases below
    public MyOwnException(String message){
        super(message);
    }
        
/*        //withdraw negative
            public void withdrawCheck(double withdraw ) throws MyOwnException{
                if(withdraw<0.0){
                throw new MyOwnException("Withdraw cannot be negative");
                }
            }
*/
       //deposit negative
        
/*        //overdraft limit
            public void overdraftCheck(double overdraft ) throws MyOwnException{
                if(overdraft>100.0){
                throw new MyOwnException("Overdraft Limit cannot go over 100 dollars");
                }
            }
        add trythrowcatch each cases in bankaccount class
*/
}
    
    
