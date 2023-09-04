public class first {
    public static void main(String[] args) {

        try{
            int i=4/0;
        }catch(Throwable e){
            e.printStackTrace();
            System.err.println("Cause : "+e.getCause());
        }
    }
}