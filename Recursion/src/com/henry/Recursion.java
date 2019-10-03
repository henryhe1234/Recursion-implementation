package com.henry;
//Properties of Recursion:
//Same operation is performed multiple times with different inputs
//In every step we try to make the problem smaller
//We mandatorily need to have a base condition,which tells system when to stop recursion
//(We either found the answer or the answer does not exist, giving base condition to stop recursion is very important)

//Why should we learn 'Recursion'?
//Because it makes the code easy to write whenever a given problem can be broken down into similar sub-problem
//Because it is heavily used in Data Structures like Tree,Graph,ets
//It is heavily used in techniques like "Divide and Conquer", "Greddy" "Dynamic Programming"

//Format of a 'Recursive Function'
//Recursive Case: Case where the function recur.
//Base Case:Case where the function does not recur.

/*Example:
    SampleRecursion(parameter){
        if(base case is satisfied){
            return some base case value
        }else{
            SampleRecursion(modified parameter)
        }
    }
 */
//Recursion method is store in the stack which is Last In First Out
//It will call the last in method and then move up to call the parent method with remaining code

//When to use/Avoid Recursion?
//When we can easily breakdown a problem into similar sub problem
//When we are ok with extra overhead(both time and space)that comes with it
//When we need a quick working solution instead of efficient one

//Practical use of 'Recursion'
//Stack
//Tree - Traversal/Searching/Insertion/Deletion
//Sorting - Quick Sort,Merge Sort
//Divide and Conquer
//Dynamic Programming
public class Recursion {
}
