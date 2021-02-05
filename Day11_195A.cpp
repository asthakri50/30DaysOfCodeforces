#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int  main()
{
	double a,b,c,n,w;
	cin>>a>>b>>c;
	n=(a-b)*c;
	w=ceil(n/b);
	if(a<=b)
	w=0;
	cout<<w<<endl;
}