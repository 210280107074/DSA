import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class File_io {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        /*basically there are two types of stream 
        (1)byte stream -> input stream & output stream
        (2)character stream -> reader & writer 
        here when we use system.in to take input from keyboard.whatever user gives as input it converts it into byte input stream and if we want to give input as a character input stream then we have to use inputStreamReader class.*/
        // try(InputStreamReader isr = new InputStreamReader(System.in)) {
        //     System.out.println("enter the letter : ");
        //     int letter = isr.read(); // here what ever input character is there is in integer form
        //     while(isr.ready()){
        //         System.out.println((char)letter);
        //         letter = isr.read();
        //     }
        //     System.out.println();
        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
    
    // try(FileReader fr = new FileReader("notes.txt")){
    //     char letter = (char)fr.read();
    //     while (fr.ready()) {
    //         System.out.println(letter);
    //         letter = (char)fr.read();
    //     } 
    //     System.out.println();
    // }
    // catch(IOException e){
    //     System.out.println(e.getMessage());
    // }

// try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//     System.out.println("type a message : ");
//     System.out.println("you typed " + br.readLine());
  
// }
// catch(IOException e){
//     System.out.println(e.getMessage());
// }

// try(BufferedReader br = new BufferedReader(new FileReader("notes.txt"))){
//     System.out.println(br.readLine());
// }
// catch(IOException e){
//     System.out.println(e.getMessage());
// }

// try(OutputStreamWriter osw = new OutputStreamWriter(System.out) ){
//     osw.write("hello world");
// }
// catch(IOException e){
//     System.out.println(e.getMessage());
// }

// try(FileWriter osw = new FileWriter("notes.txt") ){
//     osw.write(" hello world");
// }
// catch(IOException e){
//     System.out.println(e.getMessage());
// }

//creating a file
try{
    File file = new File("new.txt");
    file.createNewFile();
    try(FileWriter fw = new FileWriter("new.txt")){
        fw.write("congrats !! new file created");
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
}
catch(IOException e){
    System.out.println(e.getMessage());
}

}
}
