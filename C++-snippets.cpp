/*** Get the current timestamp ***/
#include <iostream>
#include <fstream>
#include <ctime>

int main() {

    std::string ticket_number;

    bool device_state = true;
    std::fstream device_state_file;

    std::time_t t = std::time(0);
    std::cout << t << "\n";

    return 0;
  
}
/** end snippet **/
