public class printnumber{
    int main()
    {
        int i, n;

        printf("Print odd numbers till: ",
                10);
        printf("All odd numbers from 1 to %d are: \n",7);
        for(i=1; i<=7; i++) {
            if(i%2!=0) {
                printf("%d\n", i);
            }
        }

        return 0;
    }

    private void printf(String s, int i) {
    }


}