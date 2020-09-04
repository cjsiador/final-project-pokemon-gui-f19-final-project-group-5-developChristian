public class PokemonException extends RuntimeException{
   
    private String message = "";
   
    public PokemonException(){
        //empty constructor
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }   
}