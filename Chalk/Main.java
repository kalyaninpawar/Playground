#include<iostream>
using namespace std;
int main()
{
 int number=0, days, cycle=50;
float sqr=1;
cin>>number;
while(cycle>0){
sqr = (sqr+(number/sqr))/2;
--cycle;
}
days=number+(int(sqr)+1);
cout<<int(days);
 return 0;
} 