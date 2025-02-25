package org.example;

public class Method {
    int Check1(int A, int B,int result){
        if((A%2==1&&B==A+1)||(B%2==1&&A==B+1)) {
            return result;
        }
        else {
            result++;
            return result;
        }
    }
}
