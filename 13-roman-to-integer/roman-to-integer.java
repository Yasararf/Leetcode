class Solution 
{
    public int romanToInt(String s) 
    {
        int l = s.length();
        int sum = 0;

        for (int i = 0; i < l; i++)
        {
            int curr = 0;

            switch (s.charAt(i))
            {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }

            if (i + 1 < l && curr < getValue(s.charAt(i + 1)))
                sum -= curr;
            else
                sum += curr;
        }

        return sum;
    }

    private int getValue(char c)
    {
        switch (c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
