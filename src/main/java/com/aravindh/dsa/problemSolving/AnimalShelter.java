package com.aravindh.dsa.problemSolving;

import java.util.Date;
import java.util.LinkedList;

/*
* AnimalShelter hold dogs and cats in Queue, implement below operations
* 1. enqueue - add either cat or dog to queue
* 2. dequeueAny - fetches dog or cat which ever is oldest of all
* 3. dequeueDog - fetches oldest dog
* 4. dequeueCat - fetches oldest cat
*
* The idea here is to use to queues one for cat and another for dog and maintain them with timestamp,
* when dequeueAny is called we can do peek of dog and cat and check for oldest and dequeue.
* */
public class AnimalShelter {
    LinkedList<Dog> dogList;
    LinkedList<Cat> catList;

    public AnimalShelter() {
        dogList = new LinkedList<>();
        catList = new LinkedList<>();
    }

    public abstract class Animal{
        String id;
        long inTimeStamp;
    }
    public class Dog extends Animal{
    }

    public class Cat extends Animal{
    }

    public void enqueue(Animal animal){
        animal.inTimeStamp = new Date().getTime();
        if(animal instanceof Dog){
            dogList.addLast((Dog) animal);
        }

        if(animal instanceof Cat){
            catList.addLast((Cat) animal);
        }
    }

    public Dog dequeueDog(){
        return dogList.removeFirst();
    }

    public Cat dequeueCat(){
        return catList.removeFirst();
    }

    public Animal dequeueAny(){
        if(dogList.isEmpty()){
            return catList.removeFirst();
        }
        if(catList.isEmpty()){
            return dogList.removeFirst();
        }

        Dog oldestDog = dogList.peekFirst();
        Cat oldestCat = catList.peekFirst();
        if(oldestCat.inTimeStamp < oldestDog.inTimeStamp){
            return catList.removeFirst();
        }else{
            return dogList.removeFirst();
        }
    }
}
