#!/bin/bash
# Ali Aliyev
# 041013373
# CST8102_311
# Script asks user to input grades, and it outputs calculated final grade

echo -n "Enter Assignment mark  (0 - 40): " ; read assignment
echo -n "Enter Test 1 mark (0 -15): " ; read test1
echo -n "Enter Test 2 mark (0 - 15): " ; read test2
echo -n "Enter Final exam mark (0 - 30): " ; read final
((calculatedMark=$assignment + $test1 + $test2 + $final))

if [ ${calculatedMark} -lt 100 ] && [ ${calculatedMark} -gt 90 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is A+"
elif [ ${calculatedMark} -lt 89 ] && [ ${calculatedMark} -gt 85 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is A"
elif [ ${calculatedMark} -lt 84 ] && [ ${calculatedMark} -gt 80 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is A-"
elif [ ${calculatedMark} -lt 79 ] && [ ${calculatedMark} -gt 77 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is B+"
elif [ ${calculatedMark} -lt 76 ] && [ ${calculatedMark} -gt 73 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is B"
elif [ ${calculatedMark} -lt 72 ] && [ ${calculatedMark} -gt 70 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is B-"
elif [ ${calculatedMark} -lt 69 ] && [ ${calculatedMark} -gt 67 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is C+"
elif [ ${calculatedMark} -lt 66 ] && [ ${calculatedMark} -gt 63 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is C"
elif [ ${calculatedMark} -lt 62 ] && [ ${calculatedMark} -gt 60 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is C-"
elif [ ${calculatedMark} -lt 59 ] && [ ${calculatedMark} -gt 57 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is D+"
elif [ ${calculatedMark} -lt 56 ] && [ ${calculatedMark} -gt 50 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is D"
elif [ ${calculatedMark} -lt 49 ]
then
    echo "Your final numeric grade is "${calculatedMark}", and your final letter grade is F"
fi

