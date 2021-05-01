/*** Get the current timestamp ***/
#include <iostream>
#include <ctime>

int main() {

    std::time_t t = std::time(0);
    std::cout << t << "\n";

    return 0;
  
}
/** end snippet **/
