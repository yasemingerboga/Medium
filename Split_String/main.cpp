#include"Split.h"
int main() {
	Split split;
	string token[100];
	split.splitOperations("159+623+441-654",token);
	int i = 0;
	while (token[i] != "") {
		cout << token[i] << endl;
		i++;
	}
	return 0;
}