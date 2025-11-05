#ifndef ARRAYSTACK_H
#define ARRAYSTACK_H
#include <iostream>



template <class T>
class ArrayStack {
private:
    int top;
    int capacity = 10; //Default capacity is 10
    T *elements;
    public:
    ArrayStack(int capacity) {
        this->capacity = capacity;
        this->elements = new T[capacity];
        top = -1;
    };

    ~ArrayStack() {
        delete[] elements;
    };
    bool isFull() const {
        return top == capacity - 1;
    };
    bool isEmpty() const {
        return top == -1;
    };
    bool push(T element) {
        if (isFull()) { //Checks if the stack is full
           std::cout << "Stack is full" << std::endl;
           return false;
        }
        elements[++top] = element;//Add element to the top
        return true;

    };
    T pop() {
        if (!isEmpty()) { //Checks if the stack is empty
           return elements[top--];
        }
        std::cout << "Stack is empty" << std::endl;
        return T();//if its empty send default value.
    };
    T peek() const{
        if (isEmpty()) {
            std::cout << "Stack is empty" << std::endl;
            return T();//if its empty send default value.
        }
            return elements[top];
        }
    };


#endif //ARRAYSTACK_H
