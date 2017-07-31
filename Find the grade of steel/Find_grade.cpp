#include <iostream>
using namespace std;
int main()
{
    int hardness,tensile_strength;
    float carbon_content;
    cin >> hardness >> carbon_content >> tensile_strength;
 
    if ((hardness<1 || hardness>10000) || (tensile_strength<1 || tensile_strength>10000))
    {
        cout << "Invalid data either in hardness or tensile strength" << endl;
        return 0;
    }
    if(carbon_content<0 || carbon_content>1)
    {
        cout << "Invalid Carbon content" << endl;
        return 0;
    }
    
    bool condition1 = hardness > 50;
    bool condition2 = carbon_content < .7;
    bool condition3 = tensile_strength > 5600;
    
    if(condition1 || condition2 || condition3)
    {
        if(condition1 && condition2 && condition3)
            grade = 10;
        else if(condition1 && condition2)
            grade = 9;
        else if(condition2 && condition3)
            grade = 8;
        else if(condition1 && condition3)
            grade = 7;
        else 
            grade = 6;
    }
    
    if(grade>8)
        cout << "The Steel is Very Good with grade as " << g << endl;
    else if(grade<8 && grade>5)
        cout << "The Steel is Good with grade as " << g << endl;
    else
        cout << "The Steel is Very Good with grade as 5" << endl;
    return 0;
}
