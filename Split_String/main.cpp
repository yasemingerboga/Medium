#include"Split.h"
int main() {
	Split split;
	Split split1;
	string token1[100];
	string token2[100];
	split.splitOperations("159+623+441-654",token1);
	int i = 0;
	cout << "Splitting string with seperator characters" << endl;
	cout << "------------------------------------" << endl;
	while (token1[i] != "") {
		cout << token1[i] << endl;
		i++;
	}
	i = 0;
	cout << "Splitting string without seperator characters" << endl;
	cout << "------------------------------------" << endl;
	split1.splitOperationsWithoutSeperator("159+623+441-654", token2);
	while (token2[i] != "") {
		cout << token2[i] << endl;
		i++;
	}
	return 0;
}