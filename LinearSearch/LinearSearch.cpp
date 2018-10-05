#include <iostream>

using namespace std;

int LinearSearch (int *array, int size, int value){
	bool found = false;
	int position
	
	for (int i = 0; i < size && !found; i++){
		if (array[i] == value){
			found = true;
			position = i;
		}
	}
	
	if (found)
		return position;
	else
		return -1;
}
