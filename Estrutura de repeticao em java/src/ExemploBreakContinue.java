public class ExemploBreakContinue {
    public static void main(String[] args) {
        for ( int x = 1; x <= 5;x++){
            if ( x == 3){
            continue;}

        System.out.println(x);
        }

        System.out.println("------------" );

        for ( int x = 1; x <= 5;x++){
            if ( x == 3)
            break;

        System.out.println(x);
        }
    }
}
