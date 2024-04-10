package j01007_kiem_tra_so_fibonacci;

import java.util.Scanner;

public class J01007_KIEM_TRA_SO_FIBONACCI {
    public static void main(String[] args) 
    {
        Long[] F = new Long[93];
        F[0] = Long.valueOf(0);
        F[1] = F[2] = Long.valueOf(1);
        for(int i = 3; i < 93; i++)
        {
            F[i] = F[i - 2] + F[i - 1];
        }
        Scanner m_sc = new Scanner(System.in);
        int m = m_sc.nextInt();
        while(m-- > 0)
        {
            Boolean check = false;
            Long n = m_sc.nextLong();
            for(int i = 0; i < 93; i++)
            {
                if(n.equals(F[i]))
                {
                    check = true;
                    break;
                }
            }
            if(check)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}
