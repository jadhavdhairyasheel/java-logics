public class fibonacci {

        public static void main(String[]args){
        
        int n1 =0 ,n2= 1 , sum = 0;
        
        System.err.println(n1+"  "+n2 );
        
        for(int i = 2; i<20; i++){
            sum=n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;
        
        
        }
        
        
        
        }
        
        
    
}
