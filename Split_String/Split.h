#pragma once
#include<iostream>
using namespace std;
class Split
{
private:
	string const delims{ "-+" };
	size_t beg, pos = 0;
public:
	Split();
	~Split();
	string* splitOperations(string,string[]);
	string* splitOperationsWithoutSeperator(string,string[]);
};