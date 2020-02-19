package important;

public class NUMTOROMAN
{
public static void main(int n)
{
String thou[]={"","M","MM","MMM"};
String hund[]={"","C","CC","CCC","CD","D","DCC","CM"};
String tens[]={"","X","XX","XXX","XV","V","VI","VII","VIII","IX"};
String once[]={"","I","II","III","IV","V","VI","VII","IX"};
int thou1=(n/1000)%10;
int hund1=(n/100)%10;
int tens1=(n/10)%10;
int once1=(n%10);
System.out.print(thou[thou1]+hund[hund1]+tens[tens1]+once[once1]);
}
}

