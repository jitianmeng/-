#include<iostream>
#include<fstream>
using namespace std;

int main(void)
{ int sum=0,a[100];
  ifstream in("D:\\data.txt");
  if(! in){cout<<"���ܴ��ı��ļ�";}
  for(int i=0;in>>a[i],i<100;i++)sum+=a[i];
  cout<<sum;
  in.close();
  return 0;
}

