import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;



class NotePad
{
    static Scanner input = new Scanner(System.in);

    static void notepad()
    {
        while (true) 
                {
                    System.out.println("\n\n-----------------------------------------------------------------------------  Notepade  --------------------------------------------------------------------------------------");
                    System.out.println("\n\n1.Create File\n\n2.Write File\n\n3.Read File\n\n4.Delete File");
                    System.out.print("\nEnter What You Want to do or (exit): ");
                    String user_choice_in_notepade = input.nextLine().toLowerCase().strip();
                    System.out.println("\n\n");
    
                    if (user_choice_in_notepade.equalsIgnoreCase("exit")) 
                    {
                        System.out.println("Exiting Notepade");
                        break;
                    }
    
                    switch (user_choice_in_notepade) 
                    {
                        case "1":
                        case "create file":
                        case "createfile":
                            create_file();
                            break;

                        case "2":
                        case "write file":
                        case "writefile":
                            write_file();
                            break;

                        case "3":
                        case "read file":
                        case "readfile":
                            read_file();
                            break;

                        case "4":
                        case "delete file":
                        case "deletefile":
                            delete_file();
                            break;

                        default:
                            System.out.println("!Invalid option. Try again.");
                            break;
                    }
                }
    }

    // Method 1: Create File

    static void create_file() 
    {
        while (true) {
            System.out.println("***Creating New File***\n");
            System.out.print("File Name: ");
            String filename = input.nextLine();
    
            if (filename.equalsIgnoreCase("exit")) 
            {
                System.out.println("Exiting program.\n\n");
                break;
            }
    
            if (!filename.matches("[a-zA-Z. _-]+")) 
            {
                System.out.println("Invalid file name. Please use alphabets and - only.\n");
                continue;
            }
    
            File file_location = new File("src\\" + filename + ".txt");
    
            try 
            {
                if (file_location.createNewFile()) 
                {
                    System.out.println("File created:" + file_location.getName() + "\n");
                    break;
                } 
                else 
                {
                    System.out.println("File already exists.\n");
                    continue;
                }
            } 
            catch (IOException e) 
            {
                System.out.println("Error occurred while creating the file.");
            }
        }
    }
    
    // Method 2: Write File

    static void write_file() 
    {
        byte count = 1, max = 3;
    
        while (true) {
            System.out.println("***Write in File***\n");
            System.out.print("File Name: ");
            String fileName = input.nextLine();
    
            if (fileName.equalsIgnoreCase("exit")) 
            {
                System.out.println("Exiting program.\n\n");
                break;
            }
    
            File file_location = new File("src\\" + fileName + ".txt");
    
            if (file_location.exists()) 
            {
                System.out.println("File exists\n");
    
                try 
                {
                    System.out.println("\nNow You Can Start to Write...\nTo end the writing (stop.)\n\n");
                    FileWriter fw = new FileWriter("D:\\Java\\src\\" + fileName + ".txt");
    
                    while (true) 
                    {
                        String user_write = input.nextLine().toLowerCase().strip();
    
                        if (user_write.equalsIgnoreCase("stop.")) 
                        {
                            System.out.println("Stopped Writing\n");
                            break;
                        }
    
                        fw.write(user_write + "\n");
                    }
                    fw.close();
                    break;
    
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while writing this file.");
                }
            } 
            else 
            {
                System.out.println("File does not exist.");
    
                if (count == max) 
                {
                    System.out.print("\nDo you want to create a file? (yes): ");
                    String yorn = input.nextLine();
    
                    if (yorn.equalsIgnoreCase("yes")) 
                    {
                        System.out.println();
                        create_file();
                        break;
                    }
                }
            }
            count++;
            System.out.println();
        }
    }
    
    // Method 3: Read File

    static void read_file() 
    {
        byte count = 1, max = 3;
        while (true) 
        {
            System.out.println("***Read a File***\n");
            System.out.print("File Name: ");
            String file_name = input.nextLine();
    
            if (file_name.equalsIgnoreCase("exit")) 
            {
                System.out.println("Exiting program\n\n");
                break;
            }
    
            File file_location = new File("src\\" + file_name + ".txt");
    
            if (file_location.exists()) 
            {
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println();
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }
                    System.out.println();
                    break;
                } 
                catch (IOException e) 
                {
                    
                    System.out.println("Error occurred while reading the file.");
                }
            } 
            else 
            {
                System.out.println("File does not exist\n");
                if (count == max) 
                {
                    System.out.print("\nDo you want to create a file? (yes): ");
                    String yorn = input.nextLine();
    
                    if (yorn.equalsIgnoreCase("yes")) 
                    {
                        System.out.println();
                        create_file();
                        write_file();
                        break;
                    }
                }
            }
            count++;
            System.out.println();
        }
    }
    
    // Method 4: Delete File

    static void delete_file() 
    {
        while (true) 
        {
            System.out.println("***Delete File***\n");
            System.out.print("File Name: ");
            String file_name = input.nextLine().strip();
    
            if (file_name.equalsIgnoreCase("exit")) 
            {
                System.out.println("Exiting program\n\n");
                break;
            }
    
            File file_location = new File("src\\" + file_name + ".txt");
            if (file_location.exists()) 
            {
                if (file_location.delete()) 
                {
                    System.out.println("File Deleted Successfully");
                    System.out.println();
                    break;
                }
            } 
            else 
            {
                System.out.println("File does not exist\n");
            }
        }
    }
}

class Printer


{
    static Scanner input = new Scanner(System.in);

    
    static String num_of_papers, num_of_pages, on_off;

    //Printer

    static void printer() 
    {
    
        while (true) 
        {
            System.out.println("\n\n-----------------------------------------------------------------------------  Printer  --------------------------------------------------------------------------------------");
            System.out.print("\n\nTo Turn on the Printer (On/exit): ");
            on_off = input.nextLine().strip();
    
            if (on_off.equalsIgnoreCase("exit")) 
            {
                System.out.println("\nExiting Printer...");
                Mini_disktop_Application.main(null);
            }
    
            else if(on_off.equalsIgnoreCase("on")) 
            {
                printer_wifi();
            }
            else 
            {
                System.out.println("\nPrinter is Offline\n\n!Please Turn on the Printer");
            }
        }
    } 

    //Printer wifi

    static void printer_wifi()
    {
        String filePath = "src\\printer on sound.mp3";
    
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
        {
            Player player = new Player(fileInputStream);
            System.out.println("\nSystem in process...");
            player.play();
    
            System.out.println("\nPrinter is Online. Ready to Connect Wi-Fi");
    
            while (true) 
            {
                System.out.print("\n\nName of the Wi-Fi: ");
                String wifi_name = input.nextLine();
        
                if (!wifi_name.matches("[a-zA-Z0-9_ -]+")) 
                {
                    System.out.println("\nWi-Fi name is incorrect");
                    continue;
                }
        
                System.out.println("\n"+wifi_name + " device connected successfully");
                file_name();
                break;
            }
    
        } 
        catch (JavaLayerException | IOException e) 
        {
            System.out.println("Error playing the MP3 file: " + e.getMessage());
            printer();
        }
    }

    //Printer filename

    static void file_name()
    {
    
        while (true) 
        {
            System.out.print("\n\nEnter name of the file you want to print: ");
            String file_name = input.nextLine();
    
            File file_location = new File("src\\" + file_name + ".txt");
    
            if (file_location.exists())
            {
                System.out.println("File exists.");
    
                System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t"+file_location.getName());
    
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println();
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }
                    System.out.println();
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while reading the file.");
                }
    
                System.out.print("\n\nInsert the papers in printer");
    
    
                while (true) 
                {
                    System.out.print("\nEnter count of papers: ");
                    num_of_papers = input.nextLine();
    
                    if (num_of_papers.matches("[0-9]+")) 
                    {
                        while (true)
                        {
                            System.out.print("\nEnter number of copies: ");
                            num_of_pages = input.nextLine();
    
                            if (num_of_pages.matches("[0-9]+")) 
                            {
    
                                int papers = Integer.parseInt(num_of_papers);
                                int pages = Integer.parseInt(num_of_pages);
    
                                if (papers >= pages) 
                                {
                                    start_to_print();
                                    System.out.print("\nPrinter still in Process...\n\ndo you want print again (yes/stop): ");
                                    String exit = input.nextLine().strip();
    
                                    if(exit.equalsIgnoreCase("stop") || exit.equalsIgnoreCase("no"))
                                    {
                                        print_off();
                                    }
                                    else
                                    {
                                        file_name();
                                    }
    
                                }
                                else
                                {
                                    System.out.println("\n!Not enough of papers to print\nInsert the exetra papers in printer");
                                    break;
                                }
    
                            }
                            else
                            {
                                System.out.println("\n\n!Please enter a integer number.");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("\n!Please enter a integer number.");
                        continue;
                    }
                }
            }
            else 
            {
                System.out.println("!File does not exist. Try again.");
                continue;
            }
        }
    
    }
    
    //Start to Printing

    static void start_to_print()
    {
        System.out.println("\n\n\nStart to Printing...");
        int printing_cout = Integer.parseInt(num_of_pages);
    
        String printingsound = "src\\printer printing audio.mp3";
    
        for(byte i = 1; i<=printing_cout; i++)
        {
            try (FileInputStream fileInputStream = new FileInputStream(printingsound)) 
            {
                Player player = new Player(fileInputStream);
                player.play();
                System.out.println("\n\nPage " + i + "\nPrinted Sucessfully");
            } 
            catch (JavaLayerException | IOException e) 
            {
                System.out.println("Error playing the MP3 file: " + e.getMessage());
                continue;
            }
        }
    }
    
    //Printer Off

    static void print_off()
    {
        System.out.println("\nSystem in process...");                                    
        String filePath = "D:\\Java\\src\\printer on sound.mp3";
    
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
        {
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("\n\nPrinter in Stoped...");
            Mini_disktop_Application.main(null);
    
        }
        catch (JavaLayerException | IOException e) 
        {
            System.out.println("Error playing the MP3 file: " + e.getMessage());
        }
    }

}

class MusicPlayer
{
    static Scanner input = new Scanner(System.in);

    static String song_category, exit, song_name;

    //1.Motivational

    static void motivation_songs()
    {
        while (true)
        {
            System.out.print("\n\nSong Name: ");
            song_name = input.nextLine().toLowerCase().strip();
                         
            Thread playThread = new Thread(() ->
            {

                //1.Ella-Pugazhum

                if(song_name.equals("1") || song_name.equals("ella-pugazhum"))
                {
                    String filePath = "songs\\Ella-Pugazhum.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //2.Pala Palakura

                else if(song_name.equals("2") || song_name.equals("pala palakura"))
                {
                    String filePath = "songs\\Pala Palakura.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //3.Damakku-Damakku

                else if(song_name.equals("3") || song_name.equals("damakku-damakku"))
                {
                    String filePath = "songs\\Damakku-Damakku.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //4.Soora Thenga Addra

                else if(song_name.equals("4") || song_name.equals("soora thenga addra"))
                {
                    String filePath = "songs\\Soora Thenga Addra.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //5.Surviva
                else if(song_name.equals("5") || song_name.equals("surviva"))
                {
                    String filePath = "songs\\Surviva.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //6.Ethir-Neechal

                else if(song_name.equals("6") || song_name.equals("ethir-neechal"))
                {
                    String filePath = "songs\\Ethir-Neechal.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }        
                
                //7.Arjunar Villu

                else if(song_name.equals("7") || song_name.equals("arjunar villu"))
                {
                    String filePath = "songs\\Arjunar Villu.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }    
                
                //8.Chinnavaru Sirappudhan

                else if(song_name.equals("8") || song_name.equals("chinnavaru sirappudhan"))
                {
                    String filePath = "songs\\Chinnavaru Sirappudhan.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    { 
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }              

            });
    
            playThread.start();
            System.out.print("Do you want to (exit):");

            exit = input.nextLine().toLowerCase().strip();
        
            if(exit.equals("exit") || exit.equals("yes") || exit.equals("stop")) 
            {
                playThread.stop();
                variety_of_songs();
            }
            else
            {
                
                playThread.stop();
                Motivation_title();
            }
    
        }

    }

    static void Motivation_title() 
    {
        while (true) 
        {
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t***Motivation***");


            File file_location = new File("src\\" + "Motivation songs.txt");
    
            if (file_location.exists()) 
            {
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println("\n\n\n\n");
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }

                    System.out.println();
                    motivation_songs();
                    break;
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while reading the file.");
                }
            }

        }

    }

    //2.Romatic

    static void romantic_songs()
    {
        while (true)
        {
            System.out.print("\n\nSong Name: ");
            song_name = input.nextLine().toLowerCase().strip();
                         
            Thread playThread = new Thread(() ->
            {

                //1.Marudhaani-Marudhaani

                if(song_name.equals("1") || song_name.equals("marudhaani-marudhaani"))
                {
                    String filePath = "songs\\Marudhaani-Marudhaani.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //2.Chinnamma-Chilakkamma

                else if(song_name.equals("2") || song_name.equals("chinnamma-chilakkamma"))
                {
                    String filePath = "songs\\Chinnamma-Chilakkamma.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //3.Siragugal

                else if(song_name.equals("3") || song_name.equals("siragugal"))
                {
                    String filePath = "songs\\Siragugal.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //4.Arabu-Naade

                else if(song_name.equals("4") || song_name.equals("arabu-naade"))
                {
                    String filePath = "songs\\Arabu-Naade.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //5.Anbe-En-Anbe

                else if(song_name.equals("5") || song_name.equals("anbe-en-anbe"))
                {
                    String filePath = "songs\\Anbe-En-Anbe.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //6.konjam ulari kotava

                else if(song_name.equals("6") || song_name.equals("konjam ulari kotava"))
                {
                    String filePath = "songs\\konjam ulari kotava.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }        
                
                //7.Vaseegara

                else if(song_name.equals("7") || song_name.equals("vaseegara"))
                {
                    String filePath = "songs\\Vaseegara.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }    
                
                //8.Thaen-Thaen-Thaen

                else if(song_name.equals("8") || song_name.equals("thaen-thaen-thaen"))
                {
                    String filePath = "songs\\Thaen-Thaen-Thaen.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }       
                
                //9.Azhagiye

                else if(song_name.equals("9") || song_name.equals("azhagiye"))
                {
                    String filePath = "songs\\Azhagiye.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }          
                
                //10.Orasaadha-Usurathan

                else if(song_name.equals("10") || song_name.equals("crasaadha-usurathan"))
                {
                    String filePath = "songs\\Orasaadha-Usurathan.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //11.Vizhi Moodi Yosithaal

                else if(song_name.equals("11") || song_name.equals("vizhi moodi yosithaal"))
                {
                    String filePath = "songs\\Vizhi Moodi Yosithaal.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //12.Kadhal-Aasai

                else if(song_name.equals("12") || song_name.equals("kadhal-aasai"))
                {
                    String filePath = "songs\\Kadhal-Aasai.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

            });

    
            playThread.start();
            System.out.print("Do you want to (exit):");

            exit = input.nextLine().toLowerCase().strip();
        
            if(exit.equals("exit") || exit.equals("yes") || exit.equals("stop")) 
            {
                playThread.stop();
                variety_of_songs();
            }
            else
            {
                playThread.stop();
                Romantic_title();
            }
    
        }

    }

    static void Romantic_title()
    {
        while (true) 
        {
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t***Romantic***");


            File file_location = new File("src\\" + "Romantic songs.txt");
    
            if (file_location.exists()) 
            {
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println("\n\n\n\n");
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }

                    System.out.println();
                    romantic_songs();
                    break;
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while reading the file.");
                }
            }

        }

    }

    //3.Energetic

    static void energetic_songs()
    {
        while (true)
        {
            System.out.print("\n\nSong Name: ");
            song_name = input.nextLine().toLowerCase().strip();
                         
            Thread playThread = new Thread(() ->
            {

                //1.Pistah

                if(song_name.equals("1") || song_name.equals("pistah"))
                {
                    String filePath = "songs\\Pistah.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //2.Dandaana-Darna

                else if(song_name.equals("2") || song_name.equals("dandaana-darna"))
                {
                    String filePath = "songs\\Dandaana-Darna.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //3.Chennai-City-Gangsta

                else if(song_name.equals("3") || song_name.equals("chennai-city-gangsta"))
                {
                    String filePath = "songs\\Chennai-City-Gangsta.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //4.Athiradee-Kaalam

                else if(song_name.equals("4") || song_name.equals("athiradee-kaalam"))
                {
                    String filePath = "songs\\Athiradee-Kaalam.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //5.Guleba-Sokama-Sokama

                else if(song_name.equals("5") || song_name.equals("guleba-sokama-sokama"))
                {
                    String filePath = "songs\\Guleba-Sokama-Sokama.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //6.Pakkam-Vanthu

                else if(song_name.equals("6") || song_name.equals("pakkam-vanthu"))
                {
                    String filePath = "songs\\Pakkam-Vanthu.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }        
                
                //7.Palaanadhu-Palaanadhu

                else if(song_name.equals("7") || song_name.equals("palaanadhu-palaanadhu"))
                {
                    String filePath = "songs\\Palaanadhu-Palaanadhu.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }    
                
                //8.Vaathi-Kabaddi

                else if(song_name.equals("8") || song_name.equals("vaathi-kabaddi"))
                {
                    String filePath = "songs\\Vaathi-Kabaddi.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }       
                
                //9.Kalasala-Kalasala

                else if(song_name.equals("9") || song_name.equals("kalasala-kalasala"))
                {
                    String filePath = "songs\\Kalasala-Kalasala.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }          
                
                //10.Vengamavan

                else if(song_name.equals("10") || song_name.equals("vengamavan"))
                {
                    String filePath = "songs\\Vengamavan.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //11.Ithellam-Dupe

                else if(song_name.equals("11") || song_name.equals("ithellam-dupe"))
                {
                    String filePath = "songs\\Ithellam-Dupe.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //12.Aathichudi

                else if(song_name.equals("12") || song_name.equals("aathichudi"))
                {
                    String filePath = "songs\\Aathichudi.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }                 

            });
    
            playThread.start();
            System.out.print("Do you want to (exit):");

            exit = input.nextLine().toLowerCase().strip();
        
            if(exit.equals("exit") || exit.equals("yes") || exit.equals("stop")) 
            {
                playThread.stop();
                variety_of_songs();
            }
            else
            {
                playThread.stop();
                Energetic_title();
            }
    
        }

    }

    static void Energetic_title()
    {
        while (true) 
        {
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t***Energetic***");


            File file_location = new File("src\\" + "Energetic songs.txt");
    
            if (file_location.exists()) 
            {
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println("\n\n\n\n");
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }

                    System.out.println();
                    energetic_songs();
                    break;
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while reading the file.");
                }
            }

        }
    }

    //4.Feel-Good

    static void feel_good_songs()
    {
        while (true)
        {
            System.out.print("\n\nSong Name: ");
            song_name = input.nextLine().toLowerCase().strip();
                         
            Thread playThread = new Thread(() ->
            {

                //1.Vroom-Vroom

                if(song_name.equals("1") || song_name.equals("vroom-vroom"))
                {
                    String filePath = "songs\\Vroom-Vroom.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //2.Kilimanjaro

                else if(song_name.equals("2") || song_name.equals("kilimanjaro"))
                {
                    String filePath = "songs\\Kilimanjaro.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //3.Aalaporan-Thamizhan

                else if(song_name.equals("3") || song_name.equals("aalaporan-thamizhan"))
                {
                    String filePath = "songs\\Aalaporan-Thamizhan.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //4.Nannare-Nannare 

                else if(song_name.equals("4") || song_name.equals("nannare-nannare"))
                {
                    String filePath = "songs\\Nannare-Nannare.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //5.Siva-Sivaya-Potri

                else if(song_name.equals("5") || song_name.equals("siva-sivaya-potri"))
                {
                    String filePath = "songs\\Siva-Sivaya-Potri.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //6.Lolita

                else if(song_name.equals("6") || song_name.equals("lolita"))
                {
                    String filePath = "songs\\Lolita.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }        
                
                //7.Kutti-Puli-Kootam

                else if(song_name.equals("7") || song_name.equals("kutti-puli-kootam"))
                {
                    String filePath = "songs\\Kutti-Puli-Kootam.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }    
                
                //8.Arabic-Kuthu

                else if(song_name.equals("8") || song_name.equals("arabic-kuthu"))
                {
                    String filePath = "songs\\Arabic-Kuthu.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }       
                
                //9.Ordinary-Person

                else if(song_name.equals("9") || song_name.equals("ordinary-person"))
                {
                    String filePath = "songs\\Ordinary-Person.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }          
                
                //10.Kaavaalaa

                else if(song_name.equals("10") || song_name.equals("kaavaalaa"))
                {
                    String filePath = "songs\\Kaavaalaa.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //11.Kannu-Rendum

                else if(song_name.equals("11") || song_name.equals("kannu-rendum"))
                {
                    String filePath = "songs\\Kannu-Rendum.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //12.Valayapatti

                else if(song_name.equals("12") || song_name.equals("valayapatti"))
                {
                    String filePath = "songs\\Valayapatti.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }                 

            });
    
            playThread.start();
            System.out.print("Do you want to (exit):");

            exit = input.nextLine().toLowerCase().strip();
        
            if(exit.equals("exit") || exit.equals("yes") || exit.equals("stop")) 
            {
                playThread.stop();
                variety_of_songs();
            }
            else
            {
                playThread.stop();
                Feel_Good_title();
            }
    
        }

    }

    static void Feel_Good_title()
    {
        while (true) 
        {
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t***Feel-Good***");


            File file_location = new File("src\\" + "Feel-Good.txt");
    
            if (file_location.exists()) 
            {
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println("\n\n\n\n");
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }

                    System.out.println();
                    feel_good_songs();
                    break;
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while reading the file.");
                }
            }

        }
    }

    //5.Vibe_Songs

    static void vibe_songs()
    {
        while (true)
        {
            System.out.print("\n\nSong Name: ");
            song_name = input.nextLine().toLowerCase().strip();
                         
            Thread playThread = new Thread(() ->
            {

                //1.Ringa Ringa

                if(song_name.equals("1") || song_name.equals("ringa ringa"))
                {
                    String filePath = "songs\\Ringa Ringa.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //2.Saree Ke Fall Sa

                else if(song_name.equals("2") || song_name.equals("saree ke fall sa"))
                {
                    String filePath = "songs\\Saree Ke Fall Sa.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //3.Jimikki Kammal

                else if(song_name.equals("3") || song_name.equals("jimikki kammal"))
                {
                    String filePath = "songs\\Jimikki Kammal.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //4.Chammak Challo 

                else if(song_name.equals("4") || song_name.equals("chammak challo"))
                {
                    String filePath = "songs\\Chammak Challo.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //5.Lungi Dance

                else if(song_name.equals("5") || song_name.equals("lungi dance"))
                {
                    String filePath = "songs\\Lungi Dance.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }

                //6.Tauba Tauba

                else if(song_name.equals("6") || song_name.equals("tauba tauba"))
                {
                    String filePath = "songs\\Tauba Tauba.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }        
                
                //7.Illuminati

                else if(song_name.equals("7") || song_name.equals("illuminati"))
                {
                    String filePath = "songs\\illuminati.mp3"; 
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }    
                
                //8.On The Floor

                else if(song_name.equals("8") || song_name.equals("on the floor"))
                {
                    String filePath = "songs\\On The Floor.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }       
                
                //9.Go Down

                else if(song_name.equals("9") || song_name.equals("fo down"))
                {
                    String filePath = "songs\\Go Down.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }          
                
                //10.Hanumankind

                else if(song_name.equals("10") || song_name.equals("hanumankind"))
                {
                    String filePath = "songs\\Hanumankind.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //11.Pyar ki pungi

                else if(song_name.equals("11") || song_name.equals("pyar ki pungi"))
                {
                    String filePath = "songs\\Pyar ki pungi.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                } 
                
                //12.Bye-Bye-Bye

                else if(song_name.equals("12") || song_name.equals("bye-bye-bye"))
                {
                    String filePath = "songs\\Bye-Bye-Bye.mp3";
                    
                    try (FileInputStream fileInputStream = new FileInputStream(filePath)) 
                    {

                        Player player = new Player(fileInputStream);
                        player.play();

                    } 
                    catch (JavaLayerException | IOException e) 
                    {
                        System.out.println("Error playing the MP3 file: " + e.getMessage());
                    }  
                }                 

            });
    
            playThread.start();
            System.out.print("Do you want to (exit):");

            exit = input.nextLine().toLowerCase().strip();
        
            if(exit.equals("exit") || exit.equals("yes") || exit.equals("stop")) 
            {
                playThread.stop();
                variety_of_songs();
            }
            else
            {
                playThread.stop();
                Vibe_title();
            }
    
        }

    }

    static void Vibe_title()
    {
        while (true) 
        {
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t***Vibe***");


            File file_location = new File("src\\" + "Vibe songs.txt");
    
            if (file_location.exists()) 
            {
                try (Scanner read = new Scanner(file_location)) 
                {
                    System.out.println("\n\n\n\n");
                    while (read.hasNextLine()) 
                    {
                        System.out.println(read.nextLine());
                    }

                    System.out.println();
                    vibe_songs();
                    break;
                } 
                catch (IOException e) 
                {
                    System.out.println("Error occurred while reading the file.");
                }
            }

        }
    }
    
    static void variety_of_songs()
    {
        while (true) 
        {
            System.out.println("\n\n-----------------------------------------------------------------------------  MusicPlayer  --------------------------------------------------------------------------------------");
            System.out.println("\n\n1.Motivation\n\n2.Romantic\n\n3.Energetic\n\n4.Feel-Good\n\n5.Vibe-songs");
            System.out.print("\nEnter Category(exit): ");
            song_category = input.nextLine().toLowerCase().strip();
    
            switch (song_category) 
            {
                case "1":
                case "motivation":
                case "1.motivation":

                    Motivation_title();
                    break;
                
                case "2":
                case "romantic":
                case "2.romantic":

                    Romantic_title();
                    break;

                case "3":
                case "energetic":
                case "3.energetic":
                    
                    Energetic_title();
                    break;

                case "4":
                case "feel-good":
                case "feelgood":
                case "4.feel-good":

                    Feel_Good_title();
                    break;
                
                case "5":
                case "vibe-songs":
                case "5.vibe-songs":
                     
                    Vibe_title();
                    break;
                
                case "exit":
                    Mini_disktop_Application.main(null);
                    break;
            
                default:
                    System.out.println("\n!Please Enter Correctly");
                    break;
            }
        }

    }
}



public class Mini_disktop_Application 

{

    static Scanner input = new Scanner(System.in);

    // Main Function 
    public static void main(String[] args) 
    {
        do {

            System.out.println("\n\n\n\n\t\t\t\t\t\t\t\t Mini Desktop Application \n\n\n\n");
            System.out.println("1.NotePad \t\t 2.Printer \t\t 3.MusicPlayer \n\n");

            System.out.print("Enter What You Want to do ? : ");
            String user_selection = input.nextLine().strip();

            if (user_selection.equals("1") || user_selection.equalsIgnoreCase("notepad")) 
            {
                NotePad.notepad();
            } 

            else if (user_selection.equals("2") || user_selection.equalsIgnoreCase("printer")) 
            {
                //Printer obj_printer = new Printer();
                Printer.printer();
            }

            else if(user_selection.equals("3") || user_selection.equalsIgnoreCase("musicplayer"))
            {
                MusicPlayer.variety_of_songs();
            }

            else 
            {
                System.out.println("\n!Please Enter Correctly");
                continue;
            }

        } while (true);

    }
}
