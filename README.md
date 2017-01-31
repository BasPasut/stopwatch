# Stopwatch tasks by Pasut Kittiprapas (5910546431)
I ran the tasks on Dell latitude E7270, and got
these results:

 Task | Time
 --------------------------------------|-------:
 Append 50,000 chars to String | 0.7832 sec
 Append 100,000 chars to String | 2.9617 sec
 Append 100,000 chars to StringBuilder | 0.0024 sec
 Add 1 billion double using array | 1.24703 sec
 Add 1 billion array of Double objects | 5.7175 sec
 Add 1 billion BigDecimal using array | 10.1238 sec

## Explanation of Results
--> Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars?
Answer : Because when we build a String which is an object, it consume memories because it keep the String in the memories everytime we build it and it never lost. 100,000 chars is using more memories than 50,000 chars. So we can consider that appending 100,000 chars to a String take more time than append 50,000 chars.

--> Why is appending to StringBuilder so much different than appending to String? What is
happening to the String?
Answer : When we build the StringBuilder, it keeps information in both char and String. So, when it has many information, StringBuilder will keep it in char and then adds all in one String. But, when we build the String, it keep information in one String. Ex. String a = "A" String b = "B" when we use +,- , it will keep old String and add new String in the memories. Ex. a = a + b --> "AB" but in memories it will not keep only "AB".It will keep "A" , "B" and "AB".

--> Explain difference in time to sum double, Double, and BigDecimal. Which is faster and
why?
Answer : The time to sum double is the fastest because it is primitive data type and the time to sum BigDecimal is the slowest because it is much larger than double because BigDecimal is n*10^ scale when double is only n*2^ scale.

--> Why is there such a big difference in the time used to append chars to a String and to a StringBuilder?
Even though we eventually "copy" the StringBuilder into a String so the final result is the same.
Answer : Because when we build String, it keep the information in one String. On the other hand, StringBuilder can keep information in both chars and String so it can save more memories and time.

--> why is there a significant difference in times to sum double, Double, and BigDecimal values?
Answer : 

     