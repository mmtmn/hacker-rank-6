import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    var x=0
    while (x<grades.size){
        if (grades[x]>37) {
            if (grades[x] % 5 == 3) {
                grades[x]+=2
            }
            else if (grades[x] % 5 == 4) {
                grades[x]+=1
            }
        }
        x+=1
    }
    return grades

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}



/** Same problem but solved in python


#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'gradingStudents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY grades as parameter.
#

def gradingStudents(grades):
x=0
for x in range(len(grades)):
if grades[x]>37:
if grades[x] % 5 == 3:
grades[x] += 2
elif grades[x] % 5 == 4:
grades[x] += 1
return grades


if __name__ == '__main__':
fptr = open(os.environ['OUTPUT_PATH'], 'w')

grades_count = int(input().strip())

grades = []

for _ in range(grades_count):
grades_item = int(input().strip())
grades.append(grades_item)

result = gradingStudents(grades)

fptr.write('\n'.join(map(str, result)))
fptr.write('\n')

fptr.close()

 */