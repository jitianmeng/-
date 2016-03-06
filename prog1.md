#include<iostream>
#include<fstream>
using namespace std;

int main(void)
{ int sum=0,a[100];
  ifstream in("D:\\data.txt");
  if(! in){cout<<"不能打开文本文件";}
  for(int i=0;in>>a[i],i<100;i++)sum+=a[i];
  cout<<sum;
  in.close();
  return 0;
}

