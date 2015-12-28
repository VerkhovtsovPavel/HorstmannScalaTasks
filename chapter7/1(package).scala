package by{
  class Animal
  package verkpavel{
    class Dog extends Animal
    package ch7{
      class Terrier extends Dog
    }
  }
}

package by.verkpavel.ch7.ex1{
  class FoxTerrier extends Terrier //error (not found type Terrier) need import by.verkpavel.ch7.Terrier 
}