#include<iostream>
using namespace std;
int main()
{
 int amt, total_amt, sur_charge,unit;
cin>>unit;
if(unit <=200)
{
amt = unit * 0.50;
}
 
 
total_amt= amt + sur_charge;
cout<<"Rs."<<total_amt;
return 0; 
  }
