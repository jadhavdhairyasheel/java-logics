public class DublicateElement{
    public static void main(String[] args) {
        String a[]= {"java","python","c","c++","java"};

        boolean flag = false;   
        for(int i =0; i<a.length;i++){
            for(int j =i+1;j<a.length;j++){

                if(a[i]==a[j]){
                    System.out.println("this is the Dublicate number "+ a[i]);
                    flag= true;
                }
            }
        }
    }


}