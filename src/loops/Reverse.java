package loops;

public class Reverse {
    public static void main(String[] args) {
        int num= 1234;
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        System.out.println(sum);;
    }
}

#include <iostream>
#include <string>
#include <ctime>
using namespace std;

string intToString(int n)
{
    int arr[100];
    int k=0;
    while(n>0)
    {
        arr[k]=n%10;
        n=n/10;
        k++;
    }
    string str="";
    for(int i=0;i<k;i++)
    {
        str+=arr[i];
    }
    return str;    
}

string getFormattedDate(int day,int month,int year)
{
    string y=intToString(year);
    string m=intToString(month);
    string d=intToString(day);
    string str=y+m+d;
    return str;
}

int main()
{
    srand(time(0));
    //Generate a random date.
    //For simplicity assume every month has 30 days and every year has 12 months
    int day = rand() % 30 + 1;
    int month = rand() % 12 + 1;
    int year = rand() % 2022 + 1;
    cout << "The give date is day = " << day << ", month = " << month << ", year = " << year << endl;
    string yyyymmdd = getFormattedDate(day, month, year);
    cout << "The given date in YYYYMMDD format is " << yyyymmdd << endl;
    system("Pause");
    return 0;
}