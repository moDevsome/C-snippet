/*** Get the current timestamp ***/
#include <iostream>
#include <ctime>

int main() {

    std::time_t t = std::time(0);
    std::cout << t << "\n";

    return 0;
  
}
/** end snippet **/

/*** Check if file exist ***/
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

string file_path = "C:/path/to/my_file.txt";
ifstream MyReadFile(file_path);

MyReadFile.is_open(); // Return TRUE if file exist

/** end snippet **/
