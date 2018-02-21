// [Yiu] [Jonathan] [9582764254]
#include <fstream>
#include <string>
#include <iostream>
#include <algorithm>
// put other includes here
using namespace std;

// Please fill in your USC username
const string USCusername = "yiuj";

// TRYNG RECURSIVELY FIRST
int recursiveDash(int **c, int x, int y, int count, int posx, int posy) 
{
	if(posy == y) { //Base Case
		return count;
	}
	if(posx < 0 || posx >= x || c[posx][posy] == -1) {
		return -1;
	}
	count += c[posx][posy]; // Add to count
	int checkLeft = recursiveDash(c, x, y, count, posx-1, posy+1);

	int checkMiddle = recursiveDash(c, x, y, count, posx, posy+1);

	int checkRight = recursiveDash(c, x, y, count, posx+1, posy+1);

	return max(checkLeft, max(checkMiddle, checkRight));
}

int boulderDash(int **c, int x, int y)
{
	// YOUR CODE HERE
	for(int posy = y-2; posy >= 0; posy--) {
		for(int posx = 0; posx < x; posx++) {

			int checkLeft = -1;
			if(posx-1 >= 0) {
				checkLeft = c[posx-1][posy+1];
			}

			int checkMiddle = c[posx][posy+1];

			int checkRight = -1;
			if(posx+1 < x) {
				checkRight = c[posx+1][posy+1];
			}

			int maximum = max(checkLeft, max(checkMiddle, checkRight));
			if(maximum == -1 || c[posx][posy] == -1) {
				c[posx][posy] = -1;
			}
			else {
				c[posx][posy] += maximum;
			}
		}
	}
	return c[0][0];
}

// DO NOT MODIFY THE FOLLOWING

int main()
{
	int x, y, **c;
	int tests;
	ofstream out;
	out.open((USCusername+".txt").c_str(), ios::app);
	cin >> tests;

	// COMMENT OUT - start **************************
	ifstream in("test2.txt");

	// COMMENT Out - end ****************************


	for (int t = 0; t < tests; t++) {
		// COMMENT OUT - start **************************
		in >> x;
		in >> y;
		// COMMENT Out - end **************************


		// cin >> x; PUT BACK IN CODE **************************
		// cin >> y;
		c = new int*[x];
		for (int i = 0; i < x; i++) {
			c[i] = new int[y];
			for (int j = 0; j < y; j++) {
				in >> c[i][j];
				
				//cin >> c[i][j]; PUT BACK IN CODE **************************
			}
		}


		// COMMENT OUT - start **************************
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				cout << c[j][i] << " ";
			}
			cout << endl;
		}
		cout << "RECURSIVE ANSWER " << recursiveDash(c, x, y, 0, 0, 0) << endl;;
		cout << "DYNAMIC ANSWER: " << boulderDash(c, x , y) << endl;
		// COMMENT Out - end ****************************


		out << boulderDash(c, x, y) << endl;
		for (int i = 0; i < x; i++)
			delete [] c[i];
		delete [] c;
	}
	out.close();
	return 0;
}