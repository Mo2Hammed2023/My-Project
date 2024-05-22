package digital.clocke;

import java.util.Scanner;

public class DigitalClocke {
    public static void main(String[] args) {
   Scanner in=new Scanner (System.in);
  int Opration;
  do{           
System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
System.out.println("أدخل الى الساعة-1");
System.out.println("أدخل الى المؤقت-2");
System.out.println("أدخل المنبة-3");
System.out.println("خروج -4");
System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
System.out.println("أختار العملية المراد تنفيذها ");
System.out.println("\033[h\033[2j");
System.out.flush();
Opration =in.nextInt();
switch(Opration){
case 1:
    System.out.println("الساعة");
    System.out.println("أدخل الساعة");
    int H=in.nextInt();
    System.out.println("أدخل الدقائق");
    int M=in.nextInt();                  
      while (true) {
    for (int x = 1; x <= 1; x--) {
    for (int h = H; h < 24; h++) {
    for (int m = M; m < 60; m++) {
    for (int s = 0; s < 60;s++) {
       if(M==59)
          M=1;
       if(H==24)
          H=1;
         try{
      Thread.sleep(1000);
 }catch(InterruptedException e){}
System.out.println("\033[h\033[2j");
System.out.flush();     
System.out.println(h+":"+m+":"+s);    

    }}}}}                       
 case 2:
     System.out.println("المؤقت");
     int totalTime = 0;
     int maxTime = 100;
     while (totalTime < maxTime) {
   for (int x = 1; x <= 1; x--) {
for (int h = 0; h < 100; h++) {
for (int m = 0; m < 60; m++) {
for (int s=0;s<60;s++) {
    try{
    Thread.sleep(100);
}catch(InterruptedException e){}
  System.out.println("\033[h\033[2j");
System.out.flush();
for (int q = 0; q <= 99; q++) {
    try{
    Thread.sleep(1000);
}catch(InterruptedException e){}
System.out.println("\033[h\033[2j");
System.out.flush();
System.out.println(h+":"+m+":"+s);
totalTime++;
}}}}}}
case 3:
    System.out.println("المنبة الذكي");

    int currentHour, currentMinute;
    int alarmHour, alarmMinute;

    System.out.println("أدخل الساعة الحالية");
    currentHour = in.nextInt();
    System.out.println("أدخل الدقائق الحالية");
    currentMinute = in.nextInt();
    System.out.println("أدخل ساعة التنبية");
    alarmHour = in.nextInt();
    System.out.println("أدخل دقيقة التنبية");
    alarmMinute = in.nextInt();
    while (true) {
        for (int h = currentHour; h < 24; h++) {
            for (int m = currentMinute; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    System.out.println("\033[h\033[2j");
                    System.out.flush();
                    System.out.println(h + ":" + m + ":" + s);

                    if (h == alarmHour && m == alarmMinute) {
                        System.out.println("تنبية");
                    }}}}}
                    case 4:{
                        System.out.println("شكرا لإستخدام تبطبيقنا");
                       break;}
                    default:
                        System.out.println("Error.Try again");}
  }while(Opration !=4);
        System.out.println("Thanks");
 
        }
 }
        
 
           
        
