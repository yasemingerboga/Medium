#include "Split.h"

Split::Split()
{
}

Split::~Split()
{
}

string* Split::splitOperations(string str,string token[])
{
	int i = 0;
	while ((beg = str.find_first_not_of(delims, pos)) != string::npos)
	{
		pos = str.find_first_of(delims, beg + 1);
		if (beg == 0) {
			token[i] = str.substr(beg, pos - beg);
		}
		else {
			token[i] = str.substr(beg - 1, pos - beg + 1);
		}
		i++;
	}
	return token;
}