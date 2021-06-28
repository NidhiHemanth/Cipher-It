#!/bin/bash

javac ./Ciphers/Cipher.java
javac ./Ciphers/CaesarP/*.java
javac ./Ciphers/DES_P/*.java
javac ./Ciphers/Subs/*.java
javac ./Ciphers/Caesar.java
javac ./Ciphers/DES.java
javac ./Ciphers/Substitution.java
javac Input.java

echo "Successfully built all Bytecode"
echo 

java Input