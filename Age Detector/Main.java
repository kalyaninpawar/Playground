#include<iostream>
using namespace std;
int main()
{
   int a,b;

 std::cin>>a>>b;

 if(a>b)

 {

   int x = 1900+a;

 int y = 2000+b;

 std::cout<<y-x;  }

 else

 {

   int x = 2000+a;

 int y = 2000+b;

 std::cout<<y-x;    } 
}