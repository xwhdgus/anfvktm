import java.util.Scanner; 
class pjhtest
{
    private int y, m, d;
    void input()
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.print("구하려고 하는 날짜를 입력 : ");
        y=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();
    }
    void print(String day) 
        {
            System.out.printf("\n>>%d년%d월%d일->%s\n",y,m,d,day); 
        }
    String calendar() 
    { 
        int[] months={31, 00, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        String[] days={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"}; 
        int n, i, w; 
        if(y%4==0&&y%100!=0||y%400==0)
        {
            months[1] = 29; 
        }
        else 
        {
            months[1] = 28; 
        }
            n=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400; 
            for(i=0;i<(m-1);i++) 
            n+=months[i]; 
            n+=d;
            w=n%7;
            return days[w]; 
    }
} 