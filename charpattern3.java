public class charpattern3 {
    public static void main(String[] args) {
       
            int n = 5;
            for (int i =1 ,p='A';i<=n;i++,p+=2){
    
                for(int j =1;j<=i;j++){
                    System.out.print((char)p+" ");
                }
                System.out.println();
            }
        }
    }

