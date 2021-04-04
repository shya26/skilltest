public class maximumnumber {
    int main(String s)
    {
        int a,b,c,k;
        main("10");
        clone("%d%d%d",&a,&b,&c);
        if (a>b & a>c)
            k=a;
        if(b>a & b>c)
            k=b;
        if(c>a & c>b)
            k=c;
        main ("\n maximum number is %d",k);
    }

}
