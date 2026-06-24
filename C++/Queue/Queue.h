//
// Created by yusuf on 24.06.2026.
//
#ifndef QUEUE_H
#define QUEUE_H

#include <iostream>

template <class T>
class Queue {
public:
    Queue() {
        data = new T[capacity];
    }

    ~Queue() {
        delete[] data;
    }

    void enqueue(T item) {
        if (isEmpty()) {
            head =0;
        }
        if (!isFull()) {
            tail++;
            data[tail] = item;
        }
        else {
            std::cout << "Queue is full" << std::endl;
        }



    }
    T dequeue() {
    if (isEmpty()) {
        throw std::out_of_range("Queue is empty");
    }
        T item = data[head];
        if (head == tail) {
            head = -1;
            tail = -1;
        }
        else {
            head++;
        }
        return item;
    }
    bool isEmpty() {
        if(head == -1 && tail == -1) {
            return true;
        }
        return false;
    }
    bool isFull() {
        return tail == capacity - 1;
    }


private:
    int head = -1;
    int tail = -1;
    T* data;
    int capacity = 100;

};


#endif //QUEUE_H
