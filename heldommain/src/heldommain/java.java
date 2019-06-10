
package heldommain;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
import java.util.Arrays; 

public class java {

    public static boolean royalflush(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
    
    int suit[] = new int[7];
    suit[0]=c1b;
    suit[1]=c2b;
    suit[2]=c3b;
    suit[3]=c4b;
    suit[4]=c5b;
    suit[5]=mc1b;
    suit[6]=mc2b;
    
    int x0=0;
    int x1=0;
    int x2=0;
    int x3=0;
   
    boolean flush = false;
    
    Arrays.sort(suit);
    // Arrays.sort(arr);
    // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
    //System.out.printf("Modified arr[] : %s", Arrays.toString(suit)); 
    
    for (int x = 0; x < 7; x++){
        if (suit[x]==0){
            x0++;
        }
        if (suit[x]==1){
            x1++;
        }
        if (suit[x]==2){
            x2++;
        }
        if (suit[x]==3){
            x3++;
        }
    }
    
    if (x0>=5||x1>=5||x2>=5||x3>=5){
        flush = true;
    }

    
    int royal[] = new int[7];
    royal[0]=c1a;
    royal[1]=c2a;
    royal[2]=c3a;
    royal[3]=c4a;
    royal[4]=c5a;
    royal[5]=mc1a;
    royal[6]=mc2a;
    
    int royalorder = 0;
    boolean royalorderboolean = false;
    
    for (int x=0; x<7;x++){
        if (royal[x]==0){
            ++royalorder;
        }
        if (royal[x]==9){
            ++royalorder;
        }
        if (royal[x]==10){
            ++royalorder;
        }
        if (royal[x]==11){
            ++royalorder;
        }
        if (royal[x]==12){
            ++royalorder;
        }
    }
      
    
    if (royalorder==5){
        royalorderboolean = true;
    }

   
    if (flush&&royalorderboolean){
        return true;
    }
    // Arrays.asList(arr).contains(targetValue);
    // https://www.programcreek.com/2014/04/check-if-array-contains-a-value-java/
    
     return false;
    }

    //---------------------------------------------------------------------------------------------------------------------
    public static int[] straightflush(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        
        int suit[] = new int[7];
        suit[0]=c1b;
        suit[1]=c2b;
        suit[2]=c3b;
        suit[3]=c4b;
        suit[4]=c5b;
        suit[5]=mc1b;
        suit[6]=mc2b;
    
        int x0=0;
        int x1=0;
        int x2=0;
        int x3=0;
        
        
        for (int i = 0; i < 7; i++){
        if (suit[i]==0){
            x0++;
        }
        if (suit[i]==1){
            x1++;
        }
        if (suit[i]==2){
            x2++;
        }
        if (suit[i]==3){
            x3++;
        }
        }
    
        if (x0>=5||x1>=5||x2>=5||x3>=5){
        x[0]=1;
        }
        
        int straight[] = new int[7];
        straight[0]=c1a;
        straight[1]=c2a;
        straight[2]=c3a;
        straight[3]=c4a;
        straight[4]=c5a;
        straight[5]=mc1a;
        straight[6]=mc2a;
        
        
        Arrays.sort(straight);
        
        
        //boolean flag = false;
        /*for(int i=0; i<3||flag==true;i++){
            if (straight[i]+1==straight[i+1]){
                if (straight[i+1]+1==straight[i+2]){
                    if (straight[i+2]+1==straight[i+3]){
                        if (straight[i+3]+1==straight[i+4]){
                            flag=true;
                            if (x[0]==1){
                            x[0]=1;
                            x[1]=straight[i+4];
                            }
                            else{
                            x[0]=0;
                            x[1]=0;
                            }
                        }
                    }
                }
            }
        }*/
        
        if (x[0]==1){
        if (straight[0]+1==straight[1]){
            if  (straight[1]+1==straight[2]){
                if  (straight[2]+1==straight[3]){
                    if  (straight[3]+1==straight[4]){
                        x[0]=1;
                        x[1]=straight[4];
                    }
                }
            }
        }
        if (straight[1]+1==straight[2]){
            if  (straight[2]+1==straight[3]){
                if  (straight[3]+1==straight[4]){
                    if  (straight[4]+1==straight[5]){
                        x[0]=1;
                        x[1]=straight[5];
                    }
                }
            }
        }
        if (straight[2]+1==straight[3]){
            if  (straight[3]+1==straight[4]){
                if  (straight[4]+1==straight[5]){
                    if  (straight[5]+1==straight[6]){
                        x[0]=1;
                        x[1]=straight[6];
                    }
                }
            }
        }
        }
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] fourofakind(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        
        int four4[] = new int[7];
        four4[0]=c1a;
        four4[1]=c2a;
        four4[2]=c3a;
        four4[3]=c4a;
        four4[4]=c5a;
        four4[5]=mc1a;
        four4[6]=mc2a;
        
        int x0=0;
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        int x5=0;
        int x6=0;
        int x7=0;
        int x8=0;
        int x9=0;
        int x10=0;
        int x11=0;
        int x12=0;
        
        for (int i = 0; i < 7; i++){
        if (four4[i]==0){
            x0++;
        }
        if (four4[i]==1){
            x1++;
        }
        if (four4[i]==2){
            x2++;
        }
        if (four4[i]==3){
            x3++;
        }
        if (four4[i]==4){
            x4++;
        }
        if (four4[i]==5){
            x5++;
        }
        if (four4[i]==6){
            x6++;
        }
        if (four4[i]==7){
            x7++;
        }
        if (four4[i]==8){
            x8++;
        }
        if (four4[i]==9){
            x9++;
        }
        if (four4[i]==10){
            x10++;
        }
        if (four4[i]==11){
            x11++;
        }
        if (four4[i]==12){
            x12++;
        }
        }
    
        if (x0==4||x1==4||x2==4||x3==4||x4==4||x5==4||x6==4||x7==4||x8==4||x9==4||x10==4||x11==4||x12==4){
        x[0]=1;
        }
        
        if (x0==4){
            x[1]=13;
        }
        else if (x12==4){
            x[1]=12;
        }
        else if (x11==4){
            x[1]=11;
        }
        else if (x10==4){
            x[1]=10;
        }
        else if (x9==4){
            x[1]=9;
        }
        else if (x8==4){
            x[1]=8;
        }
        else if (x7==4){
            x[1]=7;
        }
        else if (x6==4){
            x[1]=6;
        }
        else if (x5==4){
            x[1]=5;
        }
        else if (x4==4){
            x[1]=4;
        }
        else if (x3==4){
            x[1]=3;
        }
        else if (x2==4){
            x[1]=2;
        }
        
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] fullhouse(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        
            boolean t3ofaking = false;
            boolean pair1 = false;
            if (threeofaking(c1a,c1b,c2a,c2b,c3a,c3b,c4a,c4b,c5a,c5b,mc1a,mc1b,mc2a,mc2b)[0]==1){
               t3ofaking=true;
            }
            if (pair(c1a,c1b,c2a,c2b,c3a,c3b,c4a,c4b,c5a,c5b,mc1a,mc1b,mc2a,mc2b)[0]==1){
                pair1=true;
            }
            if (pair1&&t3ofaking){
                x[0]=1;
            }
            else{
                x[0]=0;
                x[1]=0;
            }
            
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] flush(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
            int suit[] = new int[7];
    suit[0]=c1b;
    suit[1]=c2b;
    suit[2]=c3b;
    suit[3]=c4b;
    suit[4]=c5b;
    suit[5]=mc1b;
    suit[6]=mc2b;
    
    int x0=0;
    int x1=0;
    int x2=0;
    int x3=0;
   

    
    
    // Arrays.sort(arr);
    // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
    //System.out.printf("Modified arr[] : %s", Arrays.toString(suit)); 
    
    for (int i = 0; i < 7; i++){
        if (suit[i]==0){
            x0++;
        }
        if (suit[i]==1){
            x1++;
        }
        if (suit[i]==2){
            x2++;
        }
        if (suit[i]==3){
            x3++;
        }
    }
    
    if (x0>=5||x1>=5||x2>=5||x3>=5){
        x[0]=1;
    }
    
    if (mc1a==0){
        x[1]=13;
    }
    else if (mc2a==0){
        x[1]=13;
    }
    else if (mc1a>mc2a){
        x[1]=mc1a;
    }
    else if (mc1a<mc2a){
        x[1]=mc2a;
    }
    else{
        x[1]=mc2a;
    }
        
        //System.out.printf("Modified arr[] : %s", Arrays.toString(x)); 
        // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
         
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] straight(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        x[0]=0;
        x[1]=0;
        
        int straight[] = new int[7];
        straight[0]=c1a;
        straight[1]=c2a;
        straight[2]=c3a;
        straight[3]=c4a;
        straight[4]=c5a;
        straight[5]=mc1a;
        straight[6]=mc2a;
        
        Arrays.sort(straight);
        // Arrays.sort(arr);
        // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
        //System.out.printf("Modified arr[] : %s", Arrays.toString(suit)); 
        
        //boolean flag = false;
        
        /*for(int i=0; i<3||flag!=true;i++){
            if (straight[i]+1==straight[i+1]){
                if (straight[i+1]+1==straight[i+2]){
                    if (straight[i+2]+1==straight[i+3]){
                        if (straight[i+3]+1==straight[i+4]){
                            flag=true;
                            x[0]=1;
                            x[1]=straight[i+4];
                        }
                    }
                }
            }
        }*/
        
        if (straight[0]+1==straight[1]){
            if  (straight[1]+1==straight[2]){
                if  (straight[2]+1==straight[3]){
                    if  (straight[3]+1==straight[4]){
                        x[0]=1;
                        x[1]=straight[4];
                    }
                }
            }
        }
        if (straight[1]+1==straight[2]){
            if  (straight[2]+1==straight[3]){
                if  (straight[3]+1==straight[4]){
                    if  (straight[4]+1==straight[5]){
                        x[0]=1;
                        x[1]=straight[5];
                    }
                }
            }
        }
        if (straight[2]+1==straight[3]){
            if  (straight[3]+1==straight[4]){
                if  (straight[4]+1==straight[5]){
                    if  (straight[5]+1==straight[6]){
                        x[0]=1;
                        x[1]=straight[6];
                    }
                }
            }
        }
        
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] threeofaking(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        
        int three3[] = new int[7];
        three3[0]=c1a;
        three3[1]=c2a;
        three3[2]=c3a;
        three3[3]=c4a;
        three3[4]=c5a;
        three3[5]=mc1a;
        three3[6]=mc2a;
        
        int x0=0;
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        int x5=0;
        int x6=0;
        int x7=0;
        int x8=0;
        int x9=0;
        int x10=0;
        int x11=0;
        int x12=0;
        
        for (int i = 0; i < 7; i++){
        if (three3[i]==0){
            x0++;
        }
        if (three3[i]==1){
            x1++;
        }
        if (three3[i]==2){
            x2++;
        }
        if (three3[i]==3){
            x3++;
        }
        if (three3[i]==4){
            x4++;
        }
        if (three3[i]==5){
            x5++;
        }
        if (three3[i]==6){
            x6++;
        }
        if (three3[i]==7){
            x7++;
        }
        if (three3[i]==8){
            x8++;
        }
        if (three3[i]==9){
            x9++;
        }
        if (three3[i]==10){
            x10++;
        }
        if (three3[i]==11){
            x11++;
        }
        if (three3[i]==12){
            x12++;
        }
        }
    
        if (x0==3||x1==3||x2==3||x3==3||x4==3||x5==3||x6==3||x7==3||x8==3||x9==3||x10==3||x11==3||x12==3){
        x[0]=1;
        }
        
        if (x0==3){
            x[1]=13;
        }
        else if (x12==3){
            x[1]=12;
        }
        else if (x11==3){
            x[1]=11;
        }
        else if (x10==3){
            x[1]=10;
        }
        else if (x9==3){
            x[1]=9;
        }
        else if (x8==3){
            x[1]=8;
        }
        else if (x7==3){
            x[1]=7;
        }
        else if (x6==3){
            x[1]=6;
        }
        else if (x5==3){
            x[1]=5;
        }
        else if (x4==3){
            x[1]=4;
        }
        else if (x3==3){
            x[1]=3;
        }
        else if (x2==3){
            x[1]=2;
        }
        
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] twopair(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        
        int twopair2[] = new int[7];
        twopair2[0]=c1a;
        twopair2[1]=c2a;
        twopair2[2]=c3a;
        twopair2[3]=c4a;
        twopair2[4]=c5a;
        twopair2[5]=mc1a;
        twopair2[6]=mc2a;
        
        int x0=0;
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        int x5=0;
        int x6=0;
        int x7=0;
        int x8=0;
        int x9=0;
        int x10=0;
        int x11=0;
        int x12=0;
        
        for (int i = 0; i < 7; i++){
        if (twopair2[i]==0){
            x0++;
        }
        if (twopair2[i]==1){
            x1++;
        }
        if (twopair2[i]==2){
            x2++;
        }
        if (twopair2[i]==3){
            x3++;
        }
        if (twopair2[i]==4){
            x4++;
        }
        if (twopair2[i]==5){
            x5++;
        }
        if (twopair2[i]==6){
            x6++;
        }
        if (twopair2[i]==7){
            x7++;
        }
        if (twopair2[i]==8){
            x8++;
        }
        if (twopair2[i]==9){
            x9++;
        }
        if (twopair2[i]==10){
            x10++;
        }
        if (twopair2[i]==11){
            x11++;
        }
        if (twopair2[i]==12){
            x12++;
        }
        }
    
        int twopaircard = 0;
        if (x0==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
        x[1]=13;
        }
        if (x12==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<12){
                x[1]=12;
            }
        }
        if (x11==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<11){
                x[1]=11;
            }
        }
        if (x10==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<10){
                x[1]=10;
            }
        }
        if (x9==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<9){
                x[1]=9;
            }
        }
        if (x8==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<8){
                x[1]=8;
            }
        }
        if (x7==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<7){
                x[1]=7;
            }
        }
        if (x6==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<6){
                x[1]=6;
            }
        }
        if (x5==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<5){
                x[1]=5;
            }
        }
        if (x4==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<4){
                x[1]=4;
            }
        }
        if (x3==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<3){
                x[1]=3;
            }
        }
        if (x2==2&&x[0]!=1){
            ++twopaircard;
            if (twopaircard==2){
                x[0]=1;
            }
            if(x[1]<2){
                x[1]=2;
            }
        }
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static int[] pair(int c1a, int c1b, int c2a, int c2b, int c3a, int c3b, int c4a, int c4b, int c5a, int c5b, int mc1a, int mc1b, int mc2a, int mc2b){
        int x[]= new int[2];
        
        int pair1[] = new int[7];
        pair1[0]=c1a;
        pair1[1]=c2a;
        pair1[2]=c3a;
        pair1[3]=c4a;
        pair1[4]=c5a;
        pair1[5]=mc1a;
        pair1[6]=mc2a;
        
        int x0=0;
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        int x5=0;
        int x6=0;
        int x7=0;
        int x8=0;
        int x9=0;
        int x10=0;
        int x11=0;
        int x12=0;
        
        for (int i = 0; i < 7; i++){
        if (pair1[i]==0){
            x0++;
        }
        if (pair1[i]==1){
            x1++;
        }
        if (pair1[i]==2){
            x2++;
        }
        if (pair1[i]==3){
            x3++;
        }
        if (pair1[i]==4){
            x4++;
        }
        if (pair1[i]==5){
            x5++;
        }
        if (pair1[i]==6){
            x6++;
        }
        if (pair1[i]==7){
            x7++;
        }
        if (pair1[i]==8){
            x8++;
        }
        if (pair1[i]==9){
            x9++;
        }
        if (pair1[i]==10){
            x10++;
        }
        if (pair1[i]==11){
            x11++;
        }
        if (pair1[i]==12){
            x12++;
        }
        }
    
        if (x0==2||x1==2||x2==2||x3==2||x4==2||x5==2||x6==2||x7==2||x8==2||x9==2||x10==2||x11==2||x12==2){
        x[0]=1;
        }
        
        if (x0==2){
            x[1]=13;
        }
        else if (x12==2){
            x[1]=12;
        }
        else if (x11==2){
            x[1]=11;
        }
        else if (x10==2){
            x[1]=10;
        }
        else if (x9==2){
            x[1]=9;
        }
        else if (x8==2){
            x[1]=8;
        }
        else if (x7==2){
            x[1]=7;
        }
        else if (x6==2){
            x[1]=6;
        }
        else if (x5==2){
            x[1]=5;
        }
        else if (x4==2){
            x[1]=4;
        }
        else if (x3==2){
            x[1]=3;
        }
        else if (x2==2){
            x[1]=2;
        }
        
        
        return x;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
     String [][] cardarray  = {{ "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts", "Ace of Spades"} ,
                                        { " 2 of Diamonds", "2 of Clubs", "2 of Hearts", "2 of Spades"} , 
                                        { "3 of Diamonds", "3 of Clubs", "3 of Hearts", "3 of Spades"} , 
                                        { "4 of Diamonds", "4 of Clubs", "4 of Hearts", "4 of Spades"} , 
                                        { "5 of Diamonds", "5 of Clubs", "5 of Hearts", "5 of Spades"} , 
                                        { "6 of Diamonds", "6 of Clubs", "6 of Hearts", "6 of Spades"} , 
                                        { "7 of Diamonds", "7 of Clubs", "7 of Hearts", "7 of Spades"} , 
                                        { "8 of Diamonds", "8 of Clubs", "8 of Hearts", "8 of Spades"} , 
                                        { "9 of Diamonds", "9 of Clubs", "9 of Hearts", "9 of Spades"} , 
                                        { "10 of Diamonds", "10 of Clubs", "10 of Hearts", "10 of Spades"} , 
                                        { "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Jack of Spades"} , 
                                        { "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "Queen of Spades"} , 
                                        { "King of Diamonds", "King of Clubs", "King of Hearts", "King of Spades"}};
     Scanner sc = new Scanner(System.in);
     Random rand = new Random();
     
     int mymoney = 10000;
     int botmoney = 10000;
     int mybet= 0;
     int botbet= 0;
     int bigblind=1;
     boolean play = true;
     
     while(play==true){
     
     int card1a = rand.nextInt(13);
     int card1b = rand.nextInt(4);
     int card2a = rand.nextInt(13);
     int card2b = rand.nextInt(4);
     int card3a = rand.nextInt(13);
     int card3b = rand.nextInt(4);
     int card4a = rand.nextInt(13);
     int card4b = rand.nextInt(4);
     int card5a = rand.nextInt(13);
     int card5b = rand.nextInt(4);
     int cardmy1a = rand.nextInt(13);
     int cardmy1b = rand.nextInt(4);
     int cardmy2a = rand.nextInt(13);
     int cardmy2b = rand.nextInt(4);
     int cardbot1a = rand.nextInt(13);
     int cardbot1b = rand.nextInt(4);
     int cardbot2a = rand.nextInt(13);
     int cardbot2b = rand.nextInt(4);
     
     /*
     //testing 
     int card1a = 5;
     int card1b = 0;
     int card2a = 7;
     int card2b = 1;
     int card3a = 9;
     int card3b = 1;
     int card4a = 10;
     int card4b = 3;
     int card5a = 11;
     int card5b = 2;
     int cardmy1a = 12;
     int cardmy1b = 0;
     int cardmy2a = 6;
     int cardmy2b = 3;
     int cardbot1a = 3;
     int cardbot1b = 2;
     int cardbot2a = 5;
     int cardbot2b = 2;
     */
     /*
     System.out.println("card1: "+cardarray [card1a][card1b]);
     System.out.println("card2: "+cardarray [card2a][card2b]);
     System.out.println("card3: "+cardarray [card3a][card3b]);
     System.out.println("card4: "+cardarray [card4a][card4b]);
     System.out.println("card5: "+cardarray [card5a][card5b]);
     System.out.println("mycard1: "+cardarray [cardmy1a][cardmy1b]);
     System.out.println("mycard2: "+cardarray [cardmy2a][cardmy2b]);
     System.out.println("botcard1: "+cardarray [cardbot1a][cardbot1b]);
     System.out.println("botcard2: "+cardarray [cardbot2a][cardbot2b]);
     */
     int max=0;
     for(int cardisnotequal = 0; cardisnotequal>=0&&max<=10000 ;cardisnotequal-- ){
         System.out.println("prossesing?"+max);//is checking on the amount of loops it has done. 
         //to chech if cards are not the same. maxumum amount of loops is 10000.
         //properbility that the cards are going to be the same is amost 0%. it like 1 out of 9^10000 witch is small.
         ++max;
         if (card1a*4+(card1b+1)==card2a*4+(card2b+1)||card1a*4+(card1b+1)==card3a*4+(card3b+1)||card1a*4+(card1b+1)==card4a*4+(card4b+1)||card1a*4+(card1b+1)==card5a*4+(card5b+1)||card1a*4+(card1b+1)==cardmy1a*4+(cardmy1b+1)||card1a*4+(card1b+1)==cardmy2a*4+(cardmy2b+1)||card1a*4+(card1b+1)==cardbot1a*4+(cardbot1b+1)||card1a*4+(card1b+1)==cardbot2a*4+(cardbot2b+1)){
            card1a = rand.nextInt(13);
            card1b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (card2a*4+(card2b+1)==card1a*4+(card1b+1)||card2a*4+(card2b+1)==card3a*4+(card3b+1)||card2a*4+(card2b+1)==card4a*4+(card4b+1)||card2a*4+(card2b+1)==card5a*4+(card5b+1)||card2a*4+(card2b+1)==cardmy1a*4+(cardmy1b+1)||card2a*4+(card2b+1)==cardmy2a*4+(cardmy2b+1)||card2a*4+(card2b+1)==cardbot1a*4+(cardbot1b+1)||card2a*4+(card2b+1)==cardbot2a*4+(cardbot2b+1)){
            card2a = rand.nextInt(13);
            card2b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (card3a*4+(card3b+1)==card1a*4+(card1b+1)||card3a*4+(card3b+1)==card2a*4+(card2b+1)||card3a*4+(card3b+1)==card4a*4+(card4b+1)||card3a*4+(card3b+1)==card5a*4+(card5b+1)||card3a*4+(card3b+1)==cardmy1a*4+(cardmy1b+1)||card3a*4+(card3b+1)==cardmy2a*4+(cardmy2b+1)||card3a*4+(card3b+1)==cardbot1a*4+(cardbot1b+1)||card3a*4+(card3b+1)==cardbot2a*4+(cardbot2b+1)){
            card3a = rand.nextInt(13);
            card3b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (card4a*4+(card4b+1)==card1a*4+(card1b+1)||card4a*4+(card4b+1)==card4a*4+(card2b+1)||card4a*4+(card4b+1)==card3a*4+(card3b+1)||card4a*4+(card4b+1)==card5a*4+(card5b+1)||card4a*4+(card4b+1)==cardmy1a*4+(cardmy1b+1)||card4a*4+(card4b+1)==cardmy2a*4+(cardmy2b+1)||card4a*4+(card4b+1)==cardbot1a*4+(cardbot1b+1)||card4a*4+(card4b+1)==cardbot2a*4+(cardbot2b+1)){
            card4a = rand.nextInt(13);
            card4b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (card5a*4+(card4b+1)==card1a*4+(card1b+1)||card5a*4+(card5b+1)==card4a*4+(card2b+1)||card5a*4+(card5b+1)==card3a*4+(card3b+1)||card5a*4+(card5b+1)==card4a*4+(card4b+1)||card5a*4+(card5b+1)==cardmy1a*4+(cardmy1b+1)||card5a*4+(card5b+1)==cardmy2a*4+(cardmy2b+1)||card5a*4+(card5b+1)==cardbot1a*4+(cardbot1b+1)||card5a*4+(card5b+1)==cardbot2a*4+(cardbot2b+1)){
            card5a = rand.nextInt(13);
            card5b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (cardmy1a*4+(cardmy1b+1)==card1a*4+(card1b+1)||cardmy1a*4+(cardmy1b+1)==card4a*4+(card2b+1)||cardmy1a*4+(cardmy1b+1)==card3a*4+(card3b+1)||cardmy1a*4+(cardmy1b+1)==card4a*4+(card4b+1)||cardmy1a*4+(cardmy1b+1)==card5a*4+(card5b+1)||cardmy1a*4+(cardmy1b+1)==cardmy2a*4+(cardmy2b+1)||cardmy1a*4+(cardmy1b+1)==cardbot1a*4+(cardbot1b+1)||cardmy1a*4+(cardmy1b+1)==cardbot2a*4+(cardbot2b+1)){
            cardmy1a = rand.nextInt(13);
            cardmy1b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (cardmy2a*4+(cardmy2b+1)==card1a*4+(card1b+1)||cardmy2a*4+(cardmy2b+1)==card4a*4+(card2b+1)||cardmy2a*4+(cardmy2b+1)==card3a*4+(card3b+1)||cardmy2a*4+(cardmy2b+1)==card4a*4+(card4b+1)||cardmy2a*4+(cardmy2b+1)==card5a*4+(card5b+1)||cardmy2a*4+(cardmy2b+1)==cardmy1a*4+(cardmy1b+1)||cardmy2a*4+(cardmy2b+1)==cardbot1a*4+(cardbot1b+1)||cardmy2a*4+(cardmy2b+1)==cardbot2a*4+(cardbot2b+1)){
            cardmy2a = rand.nextInt(13);
            cardmy2b = rand.nextInt(4);
            ++cardisnotequal;
         }
         if (cardbot1a*4+(cardbot1b+1)==card1a*4+(card1b+1)||cardbot1a*4+(cardbot1b+1)==card4a*4+(card2b+1)||cardbot1a*4+(cardbot1b+1)==card3a*4+(card3b+1)||cardbot1a*4+(cardbot1b+1)==card4a*4+(card4b+1)||cardbot1a*4+(cardbot1b+1)==card5a*4+(card5b+1)||cardbot1a*4+(cardbot1b+1)==cardmy1a*4+(cardmy1b+1)||cardbot1a*4+(cardbot1b+1)==cardmy2a*4+(cardmy2b+1)||cardbot1a*4+(cardbot1b+1)==cardbot2a*4+(cardbot2b+1)){
            cardbot1a = rand.nextInt(13);
            cardbot1b = rand.nextInt(4);
            ++cardisnotequal;
         }
     }
     
         if (bigblind%2==1){
         mybet=100;
         botbet=50;
         mymoney=mymoney-mybet;
         botmoney=botmoney-botbet;
         System.out.println("auto bet (bigblind): "+mybet+" you still have "+mymoney+" left.");
         System.out.println("BOT auto bet (smallblind): "+botbet+" BOT still have "+botmoney+" left.");
         
     }
     else if (bigblind%2==0){
         mybet=50;
         botbet=100;
         mymoney=mymoney-mybet;
         botmoney=botmoney-botbet;
         System.out.println("auto bet (smallblind): "+mybet+" you still have "+mymoney+" left.");
         System.out.println("BOT auto bet (bigblind): "+botbet+" BOT still have "+botmoney+" left.");
         
     }
     
          int count = 0;
          String answer;
     
          System.out.println("mycard1: "+cardarray [cardmy1a][cardmy1b]);
          System.out.println("mycard2: "+cardarray [cardmy2a][cardmy2b]);
     
     System.out.println("if you want to bet more money 'b'. if you want to check press 'c'. if you want to fold press 'f'. ");
     answer = sc.next();
     if (answer.equals("b")){
             System.out.println("how much do you want to bet:");
             int exetrabet = sc.nextInt();
             if (mymoney>=exetrabet){
                 mybet= mybet+exetrabet;
                 mymoney=mymoney-exetrabet;
                 System.out.println(mymoney);
                 ++count;
             }
             
             else{
                System.out.println("how much do you want to bet:");
                int exetrabet1 = sc.nextInt();
                 if (mymoney>=exetrabet){
                    mybet= mybet+exetrabet;
                    mymoney=mymoney-exetrabet;
                    System.out.println(mymoney);
                    ++count;
                }
                else{
                     System.out.println("Stop trying to brake the code!!");
                     System.out.println("exit Program!!");
                     System.exit(0);
                     //System.exit(0);
                     //https://stackoverflow.com/questions/22452930/terminating-a-java-program
                }
            }
        }
     else if (answer.equals("c")){
         System.out.println("Check!");
         ++count;
     }
     else if (answer.equals("f")){
         System.out.println("FOLD!");
     }
     
     if (count==1){
     System.out.println("card1: "+cardarray [card1a][card1b]);
     System.out.println("card2: "+cardarray [card2a][card2b]);
     System.out.println("card3: "+cardarray [card3a][card3b]);
     System.out.println("mycard1: "+cardarray [cardmy1a][cardmy1b]);
     System.out.println("mycard2: "+cardarray [cardmy2a][cardmy2b]);
     System.out.println("if you want to bet more money 'b'. if you want to check press 'c'. if you want to fold press 'f'. ");
     answer = sc.next();
     if (answer.equals("b")){
             System.out.println("how much do you want to bet:");
             int exetrabet = sc.nextInt();
             if (mymoney>=exetrabet){
                 mybet= mybet+exetrabet;
                 mymoney=mymoney-exetrabet;
                 System.out.println(mymoney);
                 ++count;
             }
             
             else{
                System.out.println("how much do you want to bet:");
                int exetrabet1 = sc.nextInt();
                if (mymoney>=exetrabet){
                    mybet= mybet+exetrabet;
                    mymoney=mymoney-exetrabet;
                    System.out.println(mymoney);
                    ++count;
                 }
                else{
                     System.out.println("Stop trying to brake the code!!");
                     System.out.println("exit Program!!");
                     System.exit(0);
                     //System.exit(0);
                     //https://stackoverflow.com/questions/22452930/terminating-a-java-program
                }
            }
        }
     else if (answer.equals("c")){
         System.out.println("Check!");
         ++count;
     }
     else if (answer.equals("f")){
         System.out.println("FOLD!");
     }
     }
     
     
     
     if (count==2){
     
     System.out.println("card1: "+cardarray [card1a][card1b]);
     System.out.println("card2: "+cardarray [card2a][card2b]);
     System.out.println("card3: "+cardarray [card3a][card3b]);
     System.out.println("card4: "+cardarray [card4a][card4b]);
     System.out.println("mycard1: "+cardarray [cardmy1a][cardmy1b]);
     System.out.println("mycard2: "+cardarray [cardmy2a][cardmy2b]);
     
     System.out.println("if you want to bet more money 'b'. if you want to check press 'c'. if you want to fold press 'f'. ");
     answer = sc.next();
     if (answer.equals("b")){
             System.out.println("how much do you want to bet:");
             int exetrabet = sc.nextInt();
             if (mymoney>=exetrabet){
                 mybet= mybet+exetrabet;
                 mymoney=mymoney-exetrabet;
                 System.out.println(mymoney);
                 ++count;
             }
             
             else{
                System.out.println("how much do you want to bet:");
                int exetrabet1 = sc.nextInt();
                if (mymoney>=exetrabet){
                    mybet= mybet+exetrabet;
                    mymoney=mymoney-exetrabet;
                    System.out.println(mymoney);
                    ++count;
                }
                else{
                     System.out.println("Stop trying to brake the code!!");
                     System.out.println("exit Program!!");
                     System.exit(0);
                     //System.exit(0);
                     //https://stackoverflow.com/questions/22452930/terminating-a-java-program
                }
            }
        }
     else if (answer.equals("c")){
         System.out.println("Check!");
         ++count;
     }
     else if (answer.equals("f")){
         System.out.println("FOLD!");
     }
     }
     
     if (count==3){
     System.out.println("card1: "+cardarray [card1a][card1b]);
     System.out.println("card2: "+cardarray [card2a][card2b]);
     System.out.println("card3: "+cardarray [card3a][card3b]);
     System.out.println("card4: "+cardarray [card4a][card4b]);
     System.out.println("card5: "+cardarray [card5a][card5b]);
     System.out.println("mycard1: "+cardarray [cardmy1a][cardmy1b]);
     System.out.println("mycard2: "+cardarray [cardmy2a][cardmy2b]);
     
     System.out.println("if you want to bet more money 'b'. if you want to check press 'c'. if you want to fold press 'f'. ");
     answer = sc.next();
     if (answer.equals("b")){
             System.out.println("how much do you want to bet:");
             int exetrabet = sc.nextInt();
             if (mymoney>=exetrabet){
                 mybet= mybet+exetrabet;
                 mymoney=mymoney-exetrabet;
                 System.out.println(mymoney);
                 ++count;
             }
             
             else{
                System.out.println("how much do you want to bet:");
                int exetrabet1 = sc.nextInt();
                if (mymoney>=exetrabet){
                    mybet= mybet+exetrabet;
                    mymoney=mymoney-exetrabet;
                    System.out.println(mymoney);
                    ++count;
                }
                else{
                     System.out.println("Stop trying to brake the code!!");
                     System.out.println("exit Program!!");
                     System.exit(0);
                     //System.exit(0);
                     //https://stackoverflow.com/questions/22452930/terminating-a-java-program
                }
            }
        }
     else if (answer.equals("c")){
         System.out.println("Check!");
         ++count;
     }
     else if (answer.equals("f")){
         System.out.println("FOLD!");
     }
     }
     
     
     
     int typewin=0;
     int winhighest=0;
     int typebot=0;
     int bothighest=0;
     
     
     if (royalflush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)==true){
         System.out.println("you got a royal flush!!!");
         typewin=9;
         winhighest=13;
     }
     else if (straightflush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
          System.out.println("you got a straightflush!!!");
          typewin=8;
          winhighest=straightflush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (fourofakind(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a four of a kind!!!");
         typewin=7;
         winhighest=fourofakind(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (fullhouse(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a fullhouse!!!");
         typewin=6;
         winhighest=fullhouse(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (flush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a flush!!!");
         typewin=5;
         winhighest=flush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (straight(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a straight!!!");
         typewin=4;
         winhighest=straight(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (threeofaking(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a three of a king!!!");
         typewin=3;
         winhighest=threeofaking(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (twopair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a two pair!!!");
         typewin=2;
         winhighest=twopair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     else if (pair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[0]==1){
         System.out.println("you got a pair!!!");
         typewin=1;
         winhighest=pair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardmy1a,cardmy1b,cardmy2a,cardmy2b)[1];
     }
     
     
     //-------------------------------------------------------------------------------------------------------------------------------------------
     //bot
     
     
     if (royalflush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)==true){
         System.out.println("bot got a royal flush!!!");
         typebot=9;
         bothighest=13;
     }
     else if (straightflush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
          System.out.println("bot got a straightflush!!!");
          typebot=8;
          bothighest=straightflush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (fourofakind(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a four of a kind!!!");
         typebot=7;
         bothighest=fourofakind(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (fullhouse(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a fullhouse!!!");
         typebot=6;
         bothighest=fullhouse(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (flush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a flush!!!");
         typebot=5;
         bothighest=flush(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (straight(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a straight!!!");
         typebot=4;
         bothighest=straight(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (threeofaking(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a three of a king!!!");
         typebot=3;
         bothighest=threeofaking(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (twopair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a two pair!!!");
         typebot=2;
         bothighest=twopair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     else if (pair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[0]==1){
         System.out.println("bot got a pair!!!");
         typebot=1;
         bothighest=pair(card1a,card1b,card2a,card2b,card3a,card3b,card4a,card4b,card5a,card5b,cardbot1a,cardbot1b,cardbot2a,cardbot2b)[1];
     }
     
     
 
     
     if (count==4){
     System.out.println("card1: "+cardarray [card1a][card1b]);
     System.out.println("card2: "+cardarray [card2a][card2b]);
     System.out.println("card3: "+cardarray [card3a][card3b]);
     System.out.println("card4: "+cardarray [card4a][card4b]);
     System.out.println("card5: "+cardarray [card5a][card5b]);
     System.out.println("mycard1: "+cardarray [cardmy1a][cardmy1b]);
     System.out.println("mycard2: "+cardarray [cardmy2a][cardmy2b]);
     System.out.println("botcard1: "+cardarray [cardbot1a][cardbot1b]);
     System.out.println("botcard2: "+cardarray [cardbot2a][cardbot2b]);
     
     
     if (typewin>typebot){
         System.out.println("YOU WIN");
         mymoney=mymoney+(2*mybet);
         System.out.println(mymoney);
     }
     else if (typewin<typebot){
         System.out.println("YOU LOSE");
         System.out.println(mymoney);
     } 
     else if(typewin==typebot){
         if(winhighest>bothighest){
            System.out.println("YOU WIN");
            mymoney=mymoney+(2*mybet);
            System.out.println(mymoney);
         }
         else if (winhighest<bothighest){
            System.out.println("YOU LOSE");
            System.out.println(mymoney);
         }
         else if (winhighest==bothighest){
            System.out.println("SPLIT");
            mymoney=mymoney+mybet;
            System.out.println(mymoney);
         }
     } 
     
     }
     
     System.out.println("do you still wan to play type 'y' if not type 'n'.");
     String continueplay = sc.next();
     if (continueplay.equals("n")){
         System.exit(0);
         //System.exit(0);
         //https://stackoverflow.com/questions/22452930/terminating-a-java-program
     }
     else{
         
     }
 
  
    }
            
    
    }
    
}
