//@author Maria Arlyn R. Fuerte (BSCS-2A)
//Activity 5.5
public class Fuerte_Act5 {
    
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=4; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            for(int j=0; j<i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    
}
