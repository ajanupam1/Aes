package com.aes;

import java.util.Scanner;

public class Encode_decode {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in) ;
        String input = scanner.next();

        // creating the instance
        Encrypt_decrypt aes = new Encrypt_decrypt();
        // creating the key
        aes.init();
        // encryption
        String encrypt = aes.encrypt(input) ;
        //decryption
         String decrypt  = aes.decrypt(encrypt);

        System.out.printf(decrypt);
    }
}
