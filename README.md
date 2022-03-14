# Spring Boot Secret Properties

This repository contains the source code for the following tutorial: 

// TODO: add YouTube URL

In this tutorial you will learn how to use Spring Boot secret properties in your next application. When you define
your own configuration properties you need to find a way to set secret properties. You can do this through command line
arguments or environment variables, but I often forget that they are there. 

Spring Boot 2.4 gave us the ability to import additional configuration files. In this demo you will set the secret values
in a file called `secret.properties` and ignore it from Git, so it doesn't get checked in. To wrap this up I will show
you how to deploy this project to Heroku and override those secret properties using config vars. 

