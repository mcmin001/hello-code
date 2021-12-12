package com.hello.nio.test;

import org.junit.Test;

import java.nio.ByteBuffer;

public class BufferTest {

    @Test
    public void byteBufferTest(){
        //ByteBuffer test
        byte[] testBytes = "A".getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(testBytes);

        int i=0;
        while(true){
            System.out.println((char)byteBuffer.get(i));
            i++;
        }
    }
}
