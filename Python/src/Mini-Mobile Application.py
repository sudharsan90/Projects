import random
import pygame as pg
import time as t
pg.init()

#1.Simple Calculator
def simple_calculator():
    while True:
        print("\n\n----------------------------------------------------------------------Simple Calculator----------------------------------------------------------------------")
        print("\n1. Addition: +")
        print("\n2. Subtraction: -")
        print("\n3. Multiplication: *")
        print("\n4. Division: /")
        print("\n5. Exit")

        def verifying():
            global symbol
            symbol = input("\nEnter a symbol or number (1-5): ").strip()
            valid_symbols = ["+", "-", "*", "/", "1", "2", "3", "4","5"]
            
            if symbol not in valid_symbols:
                print("Please enter symbol or number (1-5)")
                simple_calculator()
        verifying()

        
        def calculation():
            num1 = int(input("\nEnter the first number: "))
            num2 = int(input("Enter the second number: "))
                            
            if symbol == "+" or symbol == "1":
                print("\nThe answer of", num1, "+", num2, "is:", num1 + num2)
                
            elif symbol == "-" or symbol == "2":
                print("\nThe answer of", num1, "-", num2, "is:", num1 - num2)
                
            elif symbol == "*" or symbol == "3":
                print("\nThe answer of", num1, "*", num2, "is:", num1 * num2)
                
            elif symbol == "/" or symbol == "4":
                print("\nThe answer of", num1, "/", num2, "is:", num1 / num2)

         #exit method 1   
        if symbol == "5":
            start()
        #exit method 2
            """def y_r_n():
                y_n = input("Do you want to continue calculation? Yes or No:" ).strip().lower()
                
                if y_n == "yes":
                    simple_calculator()
                elif y_n == "no":
                    start()
                else:
                    print("***Enter Yes or No only***")
                    y_r_n()
            y_r_n()"""
        calculation()
        
    
#2. Contact Book  
def contact_book():
    contacts = {}
    def add_contact():
        name = input("\nEnter the contact name: ").strip()
        phone = input("Enter the contact phone number: ").strip()
        contacts[name] = phone
        print("\nContact",name,"added successfully!")
    
    def view_contacts():
        if not contacts:
            print("\nNo contacts available.")
        else:
            print("\n\nContacts:\n")
            for name, phone in contacts.items():
                print("Name",name,"Phone:",phone)
    
    def search_contact():
        name = input("\nEnter the contact name to search: ").strip()
        if name in contacts:
            print("\n\nName:",name, "Phone:",contacts[name])
        else:
            print("Contact",name,"not found.")
    
    def delete_contact():
        name = input("\nEnter the contact name to delete: ").strip()
        if name in contacts:
            del contacts[name]
            print("\nContact",name,"deleted successfully!")
        else:
            print("\nContact",name,"not found.")

    while True:
        print("\n\n----------------------------------------------------------------------Contact Book Menu----------------------------------------------------------------------")
        print("\n1. Add Contact")
        print("\n2. View Contact")
        print("\n3. Search Contact")
        print("\n4. Delete Contact")
        print("\n5. Exit")
        choice = input("\nEnter your choice (1-5): ").strip().lower()

        if choice == "1" or choice == "add contact" or choice == "1. add contact":
            add_contact()
        elif choice == "2" or choice == "view contact" or choice == "2. view contact":
            view_contacts()
        elif choice == "3" or choice == "search contact" or choice == "3. search contact":
            search_contact()
        elif choice == "4" or choice == "delete contact" or choice == "4. Delete contact":
            delete_contact()
        elif choice == "5" or choice == "exit" or choice == "5. exit":
            print("Exiting Contact Book. Goodbye!")
            break
        else:
            print("\nInvalid choice, please enter a number from 1 to 5.")
    start()


#3.Rock Paper Scissor
def rock_paper_scissor():
    print("\n\n----------------------------------------------------------------------Rock Paper Scissor----------------------------------------------------------------------")       
    verify = ['rock', 'paper', 'scissor']
    user_choice = input("\n\n\nEnter your choice (Rock, Paper, Scissor): ").lower()
    def user_value():
        
        if user_choice not in verify:
            print("\n***Please enter Rock or Paper or Scissor only***")
            rock_paper_scissor()
        else:
            print(f"\nYour choice: {user_choice}")
            
    def computer_choice():
        
        global system_choice
        system_choice=random.choice(verify)
        print(f"\nComputer choice: {system_choice}")
        
    def checking():
        
        if user_choice == system_choice:
            print("\nIt's a tie!")
        
        elif user_choice == "rock" and system_choice == "scissor" or   user_choice == "scissor" and system_choice == "paper" or  user_choice == "paper" and system_choice == "rock":
            
            print('\nResult: You "Win"')
        else:
            print('\nResult: You "lose"')
    
    global exit

    def exit():
        quit=input("\nDo you whant to 'Exit' (yes/no):").lower()
        if quit == "yes":
            start()
        else:
            rock_paper_scissor()
    user_value()
    computer_choice()
    checking()
    exit()


#4. Number Guessing Game
def number_guessing_game():
    
    print("\n\n----------------------------------------------------------------------Number Guessing Game----------------------------------------------------------------------")
    lower_num=int(input("\n\n\nEnter a start number(1-1000):"))
    higher_num=int(input("Enter a end number(1-1000):"))
    
    #verfing the lower_num and higher num
    if lower_num < 1 or lower_num > 1000 or\
       higher_num < 1 or higher_num > 1000 or\
       lower_num > higher_num or\
       lower_num == higher_num:
       
        print("\n***Note start and end numbers must 1 to 1000***")
        print("   start number not greater then end number")
        print("   end number not lesser then start number")
        print("   start number and end number not be same")
        number_guessing_game()
        
    ran_number=random.randint(lower_num,higher_num)
    
    def guess_the_number():
        guess_number=int(input("\nEnter The Guessing Number:"))
        if guess_number == ran_number:
            print("Your Guess is Correct")
        elif guess_number < ran_number:
            print("Too low try again")
            guess_the_number()
        elif guess_number > ran_number:
            print("Too heigh try again")
            guess_the_number()
            #ues_number
    guess_the_number()
    
    def exit():
        quit=input("\nDo you whant to 'Exit'(yes/no):").lower()
        if quit == "yes":
            start()
        else:
            number_guessing_game()
    exit()


#5. Disable The Bomb
def disable_the_bomb():

    print("\n\n----------------------------------------------------------------------Disable the Bomb----------------------------------------------------------------------")
    print("""\n\nNOTE:\n\nThe Terriorists Hijacked the plane 
But don't worry by luck there is the x-soldier(you) in the flight 
You murdered the Terriorists but they fixed Bomb still active now you going disable it!
'Remember' you have only one change to cut the wire
And there is another way to save the people take the bomb with you
and jump out of the plane
""")
    
    bomb = input("\nCut the wire (Black,White,Purple) or Suicied: ").lower()
    verify = ['black','white','purple']
    towin = ['black ','white ','purple ']
    ran = random.choice(verify)
        
    if bomb in ran or bomb in towin:
        print("\nCongratulations you Sucessfully 'Disabled' the Bomb")
        print("\n*This Song Way Dedicated By You Saved Peoples*")
        pg.mixer_music.load("D:\\Python\\English songs\\Kayilae-Aagasam-MassTamilan.io.mp3")
        pg.mixer_music.play()
        t.sleep(2)#196


    elif bomb == 'suicied':
        print("\nCongratulations you saved the peoples But your 'Dead'")
        print("\n*This Song Way Dedicated By You Saved Peoples*")
        pg.mixer_music.load("D:\\Python\\English songs\\Nee-Yaaro.mp3")
        pg.mixer_music.play()
        t.sleep(2)#231

    else:
        print('\nCongratulations you "Murder" the Peoples')
        print("\nSituation Song")
        pg.mixer_music.load("D:\\Python\\English songs\\Govinda_Govinda_Venkataramana_Govinda_Ringtone_(by Fringster.com).mp3")
        pg.mixer_music.play()
        t.sleep(2) 

    quit=input("\nDo you whant to 'Exit'(yes/no):").lower()
    
    if quit == "yes":
        music.stop()
        start()
    else:
        disable_the_bomb()

    
#6. Music

def music():
    def english():
        while True:
            print("\n\n----------------------------------------------------------------------Songs----------------------------------------------------------------------")
            songs_list = ['\n\n\n1. Bye-Bye-Bye-Deadpool',"2. They Don't Care About Us",'3. Smooth Criminal',
                          '4. Another Dream Faded x Alone','5. Baby - Justin Bieber','6. Believer',
                          '7. Bloody Mary','8. Bones Imagine','9. Gangnam Style',
                          '10. Hymn For The Weekend','11. I Am a Rider','12. Kantik Kul',
                          '13. Let Me Down Slowly','14. Shape of You','15. Unstoppable']
    
            for i in songs_list: 
                print(i+"\n")
    
            uss = input("\nEnter a Song name to Play:").lower().strip()

            def exit():
                q = input("Do you want to 'Exit'(yes/no): ").lower().strip()
                if  q == 'yes':
                    pg.mixer.music.stop()
                    start()
                else:
                    english()
    
            #1. Bye-Bye-Bye-Deadpool
            if uss == '1' or uss == '1. bye-bye-bye-deadpool' or uss == 'bye-bye-bye-deadpool':
                pg.mixer.music.load(r"English songs\\Bye-Bye-Bye-Deadpool(Pagal-World.Com.In) (1).mp3")
                pg.mixer.music.play()
                t.sleep(2)#205
                exit()
        
            #2. They Don't Care About Us
            elif uss == "2" or uss == "2. they don't care about us" or uss == "they don't care about us":
                pg.mixer.music.load(r"English songs\\01 They Don't Care About Us.mp3")
                pg.mixer.music.play()
                t.sleep(2)#284
                exit()
    
            #3. Smooth Criminal
            elif uss == '3' or uss == '3. smooth criminal' or uss == 'smooth criminal':
                pg.mixer.music.load(r"English songs\\08 Smooth Criminal.mp3")
                pg.mixer.music.play()
                t.sleep(2)#257
                exit()
    
            #4. Another Dream Faded x Alone
            elif uss == '4' or uss == '4. another dream faded x alone' or uss == 'another dream faded x alone':
                pg.mixer.music.load(r"English songs\\Another Dream Faded x Alone-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#244
                exit()
    
            #5. Baby - Justin Bieber
            elif uss == '5' or uss == '5. baby - justin bieber' or uss == 'baby - justin bieber':
                pg.mixer.music.load(r"English songs\\Baby - Justin Bieber-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#219
                exit()
        
            #6. Believer
            elif uss == '6' or uss == '6.believer' or uss == 'believer':
                pg.mixer.music.load(r"English songs\\Believer-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#216
                exit()
        
            #7. Bloody Mary
            elif uss == '7' or uss == '7. bloody mary' or uss == 'bloddy mary':
                pg.mixer.music.load(r"English songs\\Bloody Mary_320(PagalWorld.com.so).mp3")
                pg.mixer.music.play()
                t.sleep(2)#191
                exit()
        
            #8. Bones Imagine
            elif uss == '8' or uss == '8. bones imagine' or uss == 'bones imagine':
                pg.mixer.music.load(r"English songs\\Bones Imagine-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#165
                exit()
        
            #9. Gangnam Style
            elif uss == '9' or uss == '9. gangnam style' or uss == 'gangnam style':
                pg.mixer.music.load(r"English songs\\Gangnam Style-(PagalWorld).mp3")
                pg.mixer.music.play()
                t.sleep(2)#219
                exit()
        
            #10. Hymn For The Weekend
            elif uss == '10' or uss == '10. hymn for the weekend' or uss == "hymn for the weekend":
                pg.mixer.music.load(r"English songs\\Hymn For The Weekend-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#212)
                exit()
        
            #11. I Am a Rider
            elif uss ==  '11' or uss == "11. i am a rider" or uss == "i am a rider":
                pg.mixer.music.load(r"English songs\\I Am a Rider_320(PagalWorld.com.so).mp3")
                pg.mixer.music.play()
                t.sleep(2)#215)
                exit()
        
            #12. Kantik Kul
            elif uss == '12' or uss == '12. Kantik kul' or uss == 'kantik kul':
                pg.mixer.music.load(r"English songs\\Kantik Kul-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#162)
                exit()
        
            #13. Let Me Down Slowly
            elif uss == '13' or uss == '13. let me down slowly' or uss == 'let me down slowly':
                pg.mixer.music.load(r"English songs\\Let Me Down Slowly-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#169)
                exit()
        
            #14. Shape of You
            elif uss == '14' or uss == '14. shape of you' or uss == 'shape of you':
                pg.mixer.music.load(r"English songs\\Shape of You-(PagalSongs.Com.IN).mp3")
                pg.mixer.music.play()
                t.sleep(2)#233)
                exit()
        
            #15. Unstoppable
            elif uss == '15' or uss == '15. unstoppable' or uss == 'unstoppable':
                pg.mixer.music.load(r"English songs\\Sia_-_Unstoppable_CeeNaija.com_.mp3")
                pg.mixer.music.play()
                t.sleep(2)#213)
                exit()
    english()



    

#Calling the all the functions    
def start():
    print("\n\n----------------------------------------------------------------------Mini Mobile Applications----------------------------------------------------------------------")

    print('\n\n\n\n1. Simple Calculator',
    '\t\t\t\t\t2. Contact Book',
    '\t\t\t\t\t3. Rock Paper Scissor',
    '\n\n\n4. Number Guessing Game',
    '\t\t\t\t5. Disable The Bomb',
    '\t\t\t\t\t6. Songs\n\n')

    ui = input("Enter a number or name of the application: ").strip().lower()
    
    if ui == "1" or ui == "simple calculator" or ui == "1. simple calculator":
        simple_calculator()
    elif ui == "2" or ui == "contact book" or ui == "2. contact book":
        contact_book()
    elif ui == "3" or ui == "rock paper scissor" or ui == "3. rock paper scissor":
        rock_paper_scissor()
    elif ui == "4" or ui == "number guessing game" or ui == "4. number guessing game":
        number_guessing_game()
    elif ui == "5" or ui == "disable the bomb" or ui == "5. disable the bomb":
        disable_the_bomb()
    elif ui == "6" or ui == "music" or ui == "6. music":
        music()
    else:
        print("Please enter the number or copy and paste what you want from the list.")
        start()
start()
