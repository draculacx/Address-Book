---
layout: post
title: AddressBook program
---

# AddressBook Homework #

## Introduction ##

[HomePage](https://github.com/xchexin/addressbook)

This is an address book program.


* Users can lookup address item by name
* Users can insert items
* Users can delete items by name
* Users can easily extend it to add more functions

## Usage ##

Install the program

    mvn clean install
    
Run this program

    java -jar target/addressbook.jar
    
Generate the web site

    mvn clean site
    
## NOTE ##

* This MAVEN project site can only be deployed in MAVEN 3.0 due to the compatibility

## Suggestions ##

* Please generate the MAVEN site to see the code in this project

## Implementation ##

### JUnit Test case ###

* The coverage of code is about 76%.

### Expansion ###

* Extends Handler class to support more operations.

* It is better to write a command parser :)

### Plug-in ###

* See pom.xml in project.

### MAVEN site ###

* It shows some project information.

## Achievement ##

* Executor service.
* Response chain.









