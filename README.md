# Design a pen

The objective of this case study is to simulate a real world object and design it using OOP principles. The object we are simulating is a pen.

## Requirements

* A Pen is anything that can write.
* Pen can be of different types: Fountain pen,Ball pen, Gel Pen
* Pen can have Refill or  ink.
* A Refill will have a tip and an ink
* A refil has a radius
* Pen can be closed/opened in different ways like either by cap or click.
* Pen will have price, color, brand.
* Actions Pen can do: 
    * Pen can write
    * Can be refilled or not
    * Can be closed/opened


## Entities and Attributes

* Pen
    * Brand
    * Name
    * Type
    * Price
* Refill
    * Type(Ball/Gel)
    * Nib
    * Ink
* Ink
    * Colour
    * Type(Ball/Gel/Fountain)
* Nib
    * Radius
    * Type(Ball/Gel/Fountain)

### Different types of pens

* Gel Pen
    * Type - `Gel`
    * Refill -
        * Type - `Gel`
        * Nib
            * Type - `Gel`
        * Ink
            * Type - `Gel`
        * Refillable - `Yes`

* Ball Pen
    * Type - `Ball`
    * Refill -
        * Type - `Ball`
        * Nib
            * Type - `Ball`
        * Ink
            * Type - `Ball`
        * Refillable - `Yes`

* Throwaway Pen
    * Type - `Throwaway`
    * Refill -
        * Type - `Ball`
        * Nib
            * Type - `Ball`
        * Ink
            * Type - `Ball`
        * Refillable - `No`

* Fountain Pen
    * Type - `Fountain`
    * Ink - 
        * Type - `Fountain`
    * Nib - 
        * Type - `Fountain`


## Class Diagram

![classDiagram](http://url/to/img.png)

