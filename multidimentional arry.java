public class multidmentionalarry {

    public static void main(String[] args){

int [][] marks = {
{12,23,54,56,63},
{32,45,65,76,68},
{45,76,98,49,59}
};
for(int i=0; i<3;i++){
    for(int j=0 ;j<5;j++){
        System.out.print(marks[i][j] + "\t");
    }
    System.out.println();
}

    }
    
}
