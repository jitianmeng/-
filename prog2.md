#include<iostream>
#include<fstream>
using namespace std;


void arraysum(int n)
{ int *a;
int sum=0;
  a=new int[n];
ifstream in("D:\\data.txt");
if(! in){cout<<"不能打开文本文件";}
 for(int i=0;in>>a[i],i<n;i++)sum+=a[i];
	 cout<<sum;
  in.close();
}
  int main(void)
{ int a;
	  cout<<"数据长度:";
  cin>>a;
  cout<<"总和为";
  arraysum(a);
  return 0;
}

