import java.util.*;
class Main
{
    public static void main(String args [])
    {   Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number between(1 to 9999)");
        n=sc.nextInt();
        if(n<1 && n>9999) 
            System.out.println("Please enter correct number");
        else
        {
            int u=n%10;//last digit
            int tt=n/10;
            int t=tt%10;//second digit
            int h=tt/10;//fist digit
            
            int h1=tt/10;
            int  h2=h1%10;// 2nd digit if 4 no.
            int f1=n/1000;//1st digit if 4 no.
            String uw[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
            String tw[]={" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String hw[]={" "," Hundred ","Twohundred","Threehundred","Fourhundred","Fivehundred","Sixhundred","Sevenhundred","Eighthundred","Ninehundred"};
            String th[]={" ","Onethousand","Twothousand","Threethousand","Fourthousand","Fivethousand","Sixthousand","Seventhousand","Eightthousand","Ninethousand"};
            if(n<20)
                System.out.println(+n+" in words is "+uw[n]);
            else if(n<100)
                System.out.println(+n+" in words is "+tw[t]+" "+uw[u]);
           else if(n>99 && n<999)
                System.out.println(+n+" in words is "+hw[h] +" "+tw[t]+" "+uw[u]);
            else
                System.out.println(+n+" in words is "+th[f1]+" "+hw[h2]+" "+tw[t]+" "+uw[u]);
        }
    }
}
   
