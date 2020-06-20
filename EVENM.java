#include <bits/stdc++.h> 
using namespace std; 


void ix(int z) 
{ 

	// Array to store all 
	// the N*N numbers 
	int ry[z * z + 1] = { 0 }; 

	for (int i = 1; i <= z * z; i++) 
		ry[i] = i; 

	// 2-d matrix is used 
	// to store the value. 
	vector<vector<int> > arr; 

	int k = 1; 
	// Check if the dimension of 
	// the matrix is odd 
	if (z % 2 != 0) { 
		for (int i = 0; i < z; i++) { 

			// Helper matrix 
			// which store the number 
			// of every row 
			vector<int> helper; 

			for (int j = 0; j < z; j++) { 
				helper 
					.push_back( 
						ry[k++]); 
			} 

			// push the vector 
			// into vector of vector 
			arr.push_back(helper); 
		} 
	} 

	// Check if dimension of the 
	// array is even 
	else { 
		for (int i = 0; i < z; i++) { 

			// Helper matrix 
			// which store the number 
			// of every row 
			vector<int> helper; 

			for (int j = 0; j < z; j++) { 

				helper 
					.push_back( 
						ry[k++]); 
			} 

			// Check if the row of 
			// the matrix is odd 
			if (i % 2 != 0) { 

				// reverse the row 
				reverse(helper.begin(), 
						helper.end()); 
				arr.push_back(helper); 
			} 
			else { 
				arr.push_back(helper); 
			} 
		} 
	} 
	// print the matrix 
	for (int i = 0; i < z; i++) { 
		for (int j = 0; j < z; j++) { 
			cout << arr[i][j] << " "; 
		} 
		cout << "\n"; 
	} 
} 

// Drive Code 
int main() 
{   int n;
    cin>>n;
    while(n--){
	int z;
	cin>>z;
	ix(z); 
	} return 0;
} 

