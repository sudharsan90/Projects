from tkinter import*
import tkinter as tk
from PIL import ImageTk, Image
from tkinter.font import Font
from tkinter import messagebox
import pygame
import os
import pymysql as mysql
import re
import time as t

#Functions
def page1_to_page2():
    frame_of_page1.pack_forget()
    frame_of_page2.pack(fill=BOTH, expand=TRUE)

def login_to_signup():
    frame_of_page1.pack_forget()
    frame_of_sigup.pack(fill=BOTH, expand=True)

def sign_up_to_login():
    frame_of_sigup.pack_forget()
    frame_of_page1.pack(fill=BOTH, expand=True)

def sinup_to_page2():
    frame_of_sigup.pack_forget()
    frame_of_page2.pack(fill=BOTH, expand=True)

def page2_to_page1():
    frame_of_page2.pack_forget()
    frame_of_page1.pack(fill=BOTH, expand=True)

def page2_to_page3():
    frame_of_page2.pack_forget()
    frame_of_page3.pack(fill=BOTH, expand=True)

def page3_to_page2():
    frame_of_page3.pack_forget()
    frame_of_page2.pack(fill=BOTH, expand=True)


def kalki():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\- Kalki 2898 AD (2024) [Tamil - 1080p HQ HDRip - x264 - [DD.mkv")

def Dune():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Dune Part Two (2024) English HQ HDRip - 1080p - x264 - (.mkv")

def Dont_breathe():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\ECT Dont Breathe (2016) HD.mkv")

def top_gun_maverick():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Top Gun  Maverick (2022) [720p IMAX HQ HDRip - x264 - [Tamil + Telugu + Hindi + Eng] - DD5.1 (192 Kbps) - 1.4GB - ESub].mkv")

def Avengers_age_of_ultron():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Avengers Age of Ultron (2015)[720p - BDRip - Original Auds [Tamil + Telugu + Hindi + Eng] - x264 - 1.2GB - ESubs].mkv")

def If():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\IF.2024.1080p.10bit.WEBRip.6CH.x265.HEVC-PSA.mkv")

def world_war_z():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\ECT World War Z (2013) HD.mkv")

def jhonny_english_reborn():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Johnny English Reborn (2011)[720p BDRip - [Tamil + Hindi + Eng] - x264 - 900MB - ESubs].mkv")

def despicable_me_4():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Despicable Me 4 (2024) [720p HQ HDRip - x264 - [Tam + Tel + Hin + Eng] - AAC - 950MB - ESub].mkv")

def saveing_bikini_bottom():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\www.TamilYogi.blog_-_Saving_Bikini_Bottom_The_Sandy_Cheeks_Movie_(2024)_WEB_DL_1080p_AVC_(DD+5_1_640Kbps)_[Tam_+_Tel_+_Hin_+_Eng]_(1)_HD_720p (1).mp4")

def the_garfield():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\www.TamilYogi.show_-_The_Garfield_Movie_(2024)_HQ_HDRip_1080p_(DD+5_1_640Kbps)_[Tamil_+_Hindi_+_Eng]_(1)_HD_720p.mp4")

def kungfu_panda_4():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Kung.Fu.Panda.4.2024.1080p.10bit.WEBRip.6CH.x265.HEVC-PSA.mkv")

def shang_chi():
    pygame.mixer.music.stop()
    t.sleep(1.50)
    play = os.startfile("Movies\\Shang-Chi (2021) Blu-Ray ESub.mkv")


pygame.mixer.init()

def stop_music():
    pygame.mixer.music.stop()

def bye_bye_bye_audio():
    music_file = "English songs\\Bye-Bye-Bye-Deadpool(Pagal-World.Com.In) (1).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def bye_bye_bye_video():
    stop_music()
    video = os.startfile("English songs\\_NSYNC - Bye Bye Bye (Official Video from Deadpool and Wolverine).mp4")

def bones_audio():
    music_file = "English songs\\Bones Imagine-(PagalSongs.Com.IN).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def bones_video():
    stop_music()
    video = os.startfile("English songs\\Imagine Dragons - Bones (Official Music Video).mp4")

def they_dont_care_about_us_audio():
    music_file = "English songs\\01 They Don't Care About Us.mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def they_dont_care_about_us_video():
    stop_music()
    video = os.startfile("English songs\\Michael Jackson - They Don t Care About Us - Live Munich 1997 - Widescreen HD.mp4")

def smooth_criminal_audio():
    music_file = "English songs\\08 Smooth Criminal.mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def smooth_criminal_video():
    stop_music()
    video = os.startfile("English songs\\Michael Jackson _ SMOOTH CRIMINAL 4_3 _ 4K.mp4")

def another_dream_faded_audio():
    music_file = "English songs\\Another Dream Faded x Alone-(PagalSongs.Com.IN).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def another_dream_fraded_video():
    stop_music()
    video = os.startfile("English songs\\Alan Walker Mashup lofi  _ Naresh Parmar _ ALONE X FADED _ Best of Alan Walker __ instagram trend __.mp4")

def jb_baby_audio():
    music_file = "English songs\\Baby - Justin Bieber-(PagalSongs.Com.IN).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def jb_baby_video():
    stop_music()
    video = os.startfile("English songs\\Justin Bieber - Baby ft. Ludacris.mp4")

def gangnam_style_audio():
    music_file = "English songs\\Gangnam Style-(PagalWorld).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def gangnam_style_video():
    stop_music()
    video = os.startfile("English songs\\PSY - GANGNAM STYLE(강남스타일) M_V.mp4")

def shape_of_you_audio():
    music_file = "English songs\\Shape of You-(PagalSongs.Com.IN).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def shape_of_you_video():
    stop_music()
    video = os.startfile("English songs\\Ed Sheeran - Shape of You (Official Music Video).mp4")

def bloody_mary_audio():
    music_file = "English songs\\Bloody Mary_320(PagalWorld.com.so).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def bloody_mary_video():
    stop_music()
    video = os.startfile("English songs\\Wednesday Dance - Lady Gaga - Bloody Mary.mp4")

def unstoppable_audio():
    music_file = "English songs\\Sia_-_Unstoppable_CeeNaija.com_.mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def unstoppable_video():
    stop_music()
    video = os.startfile("English songs\\Sia - Unstoppable (Official Video - Live from the Nostalgic For The Present Tour).mp4")

def let_me_down_slowly_audio():
    music_file = "English songs\\Let Me Down Slowly-(PagalSongs.Com.IN).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def let_me_down_slowy_video():
    stop_music()
    video = os.startfile("English songs\\Alec Benjamin - Let Me Down Slowly [Official Music Video].mp4")
    
def beleiver_audio():
    music_file = "English songs\\Believer-(PagalSongs.Com.IN).mp3"
    pygame.mixer.music.load(music_file)
    pygame.mixer.music.play()

def beleiver_video():
    stop_music()
    video = os.startfile("English songs\\Imagine Dragons - Believer (Official Music Video).mp4")


def login():

    if user_name_login.get() == '' or user_password_login.get() == '':
        messagebox.showerror("!","Please fill the details")

    else:
        try:
            con=mysql.connect(host='localhost',user='root',password="123456", database="ott_user_details")
            mycursor=con.cursor()
        except:
            messagebox.showerror('Error','Connection is not estabished try again')
            return
        
        query='select * from signin where name=%s and password=%s'
        mycursor.execute(query,(user_name_login.get(), user_password_login.get()))
        row= mycursor.fetchone()

        if row==None:
            messagebox.showerror('Error','Invalid username or Password')

        else:
            messagebox.showinfo('Congrats','Login is Successful')
            t.sleep(2)
            page1_to_page2()

def signin():

  name = user_name.get()
  email = user_email.get()
  password = user_password.get() 
  phone_number = user_phone_number.get()
  
  if name =="" or email== "" or password == "" or phone_number == "":
    messagebox.showerror("!","Please fill the details")

  else:
    
    while True:
      
          if re.match(r"^[a-zA-Z.\s]+$", name) and re.match(r"^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$", email) and re.match("^[a-zA-Z0-9]{6,15}$", password) and re.match(r"^\d{10}$", phone_number):
                
                db = mysql.connect(host="localhost", user="root", password="123456", database="ott_user_details")
                cur = db.cursor()
                cur.execute("insert into signin values('" + name + "','" + email + "','" + password + "','" + phone_number + "')")
                db.commit()

                messagebox.showinfo("Sing in", "Singn in Successfully")
                #t.sleep(2)
                sinup_to_page2()
                clear()
                break

          else:

                messagebox.showerror("invalid details","Try Again")
                break





window = Tk()
window.title("PyFlix")
window.geometry("1920x1080")
window.iconbitmap("posters\\icon.ico")
#window.attributes('-fullscreen', True)

#Frame1 Starts------------------------------------------------------------------------------------------------------------------------------------

frame_of_page1 = Frame(window, bg="black")

#BackgroundImage for Login
file_name = "posters\\login.png"

opening_the_file = Image.open(file_name)
opening_the_file = opening_the_file.resize((1530, 780),Image.Resampling.LANCZOS)

back_ground_image = ImageTk.PhotoImage(opening_the_file)

label_for_image = Label(frame_of_page1, image=back_ground_image)
label_for_image.image = back_ground_image
label_for_image.place(x=0, y=0)


#Lable
#welcome = tk.Label(frame_of_page1,text="Welcome", bg="black", font=("klein", 20), fg='white',padx=100)
#welcome.place(x= 600, y= 75)



user_name_login = Entry(frame_of_page1, width=20, font=("",18,"bold"))
user_name_login.place(x=680, y=300,height=30)

user_password_login = Entry(frame_of_page1, show="*", width=20, font=("",18,"bold"))
user_password_login.place(x=680, y=405,height=30)


button1=Button(frame_of_page1,text= "LOGIN",bg="black", fg="white", font=("",12,"bold"),padx=25, pady=2, command=lambda:[login()])#page1_to_page2()
button1.place(x=600, y= 650)

button1=Button(frame_of_page1,text= "SIGN UP",bg="black", fg="white", font=("",12,"bold"),padx=25, pady=2, command=lambda:[login_to_signup(),t.sleep(0.30)])
button1.place(x=800, y= 650)

frame_of_page1.pack(fill=BOTH, expand=True)


frame_of_sigup = Frame(window, bg="black")

#BackgroundImage for Sign up
#file_name = "sign in (2).png"
#opening_the_file = Image.open(file_name)
#back_ground_image = ImageTk.PhotoImage(opening_the_file)
#label_for_image= tk.Label(frame_of_sigup, image= back_ground_image)
#label_for_image.opening_the_file = back_ground_image
#label_for_image.place(x=125, y=32.5)

#BackgroundImage for Sign up
file_name = "posters\\sign up.png"

opening_the_file = Image.open(file_name)
opening_the_file = opening_the_file.resize((1530, 780),Image.Resampling.LANCZOS)

back_ground_image = ImageTk.PhotoImage(opening_the_file)

label_for_image = Label(frame_of_sigup, image=back_ground_image)
label_for_image.image = back_ground_image
label_for_image.place(x=0, y=0)

user_name = Entry(frame_of_sigup, width=20, font=("",14,"bold"))
user_name.place(x=400, y=110,height=30)

user_email = Entry(frame_of_sigup, width=20, font=("",14,"bold"))
user_email.place(x=400, y=225,height=30)

user_phone_number = Entry(frame_of_sigup, show="*", width=20, font=("",14,"bold"))
user_phone_number.place(x=400, y=480,height=30)


user_password = Entry(frame_of_sigup, width=20, font=("",14,"bold"))
user_password.place(x=400, y=350,height=30)



def clear():
  
  name = user_name.delete(0,END)
  email = user_email.delete(0,END)
  password = user_password.delete(0,END)
  phone_number = user_phone_number.delete(0,END)



button1=Button(frame_of_sigup,text= "LOGIN",bg="white", fg="black", font=("",12,"bold"),padx=25, pady=2, command=lambda:[sign_up_to_login()])
button1.place(x=600, y= 650)

button1=Button(frame_of_sigup,text= "SIGN UP",bg="white", fg="black", font=("",12,"bold"),padx=25, pady=2, command=lambda:[signin()])
button1.place(x=800, y= 650)

#Frame1 Ends--------------------------------------------------------------------------------------------------------------------------------------




#Frame2 Start-------------------------------------------------------------------------------------------------------------------------------------

frame_of_page2 = Frame(window, bg="black")
file_name = "posters\\movie_background.png"


opening_the_file = Image.open(file_name)
opening_the_file = opening_the_file.resize((1530, 780),Image.Resampling.LANCZOS)

back_ground_image = ImageTk.PhotoImage(opening_the_file)

label_for_image = Label(frame_of_page2, image=back_ground_image)
label_for_image.image = back_ground_image
label_for_image.place(x=0, y=0)

#welcome = tk.Label(frame_of_page2,text="Cine World", bg="black", font=("klein", 20), fg='white',padx=100)
#welcome.place(x= 590, y= 10)

#1.Kalki
def KALKI():
    title_of_the_move = tk.Label(frame_of_page2,text="Kalki", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 35, y= 50)
    
    file_name = "posters\\kalki.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=35, y=100)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[kalki()])
    button2.place(x=45, y= 325)

KALKI()


#2.Dune
def DUNE():

    title_of_the_move = tk.Label(frame_of_page2,text="Dune", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 300, y= 50)
    
    file_name = "posters\\Dune.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=300, y=100,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[Dune()])
    button2.place(x=315, y= 325)

DUNE()


#3.Don't Breathe
def DONT_BREATHE():

    title_of_the_move = tk.Label(frame_of_page2,text="Don't Breathe", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 565, y= 50)
    
    file_name = "posters\\Don't breathe.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=565, y=100,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[Dont_breathe()])
    button2.place(x=580, y= 325)

DONT_BREATHE()


#4.Top Gun Maverick
def TOP_GUN_MAVERICK():

    title_of_the_move = tk.Label(frame_of_page2,text="Top Gun", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 830, y= 50)
    
    file_name = "posters\\top gun maverick.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=830, y=100,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[top_gun_maverick()])
    button2.place(x=845, y= 325)

TOP_GUN_MAVERICK()


#5.Avengers Age Of Ultron
def AVENGERS_AGE_OF_ULTRON():

    title_of_the_move = tk.Label(frame_of_page2,text="Avengers", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1095, y= 50)
    
    file_name = "posters\\Avengers age of ultron.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1095, y=100,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[Avengers_age_of_ultron()])
    button2.place(x=1110, y= 325)

AVENGERS_AGE_OF_ULTRON()


#6. IF
def IF():

    title_of_the_move = tk.Label(frame_of_page2,text="IF", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1360, y= 50)
    
    file_name = "posters\\if.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1360, y=100,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[If()])
    button2.place(x=1375, y= 325)

IF()


#7.World War Z
def World_War_Z():
    title_of_the_move = tk.Label(frame_of_page2,text="World War Z", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 22, y= 400)
    
    file_name = "posters\\world-war-z.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=25, y=450,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[world_war_z()])
    button2.place(x=35, y= 675)
    
World_War_Z()


#8.Despicable me 4
def Despicable_Me_4():

    title_of_the_move = tk.Label(frame_of_page2,text="Despicable Me 4", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 300, y= 400)
    
    file_name = "posters\\despicable me 4.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=300, y=450,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[despicable_me_4()])
    button2.place(x=315, y= 675)

Despicable_Me_4()


#9. Saving the Bikini Bottom
def Saving_Bikini_Bottom():

    title_of_the_move = tk.Label(frame_of_page2,text="Sponch bob", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x=565, y= 400)
    
    file_name = "posters\\saving bikini bottom.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=565, y=450,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[saveing_bikini_bottom()])
    button2.place(x=580, y= 675)

Saving_Bikini_Bottom()


#10.The Garfield
def The_Garfield():

    title_of_the_move = tk.Label(frame_of_page2,text="The Garfield", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 830, y= 400)
    
    file_name = "posters\\the garfield.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=830, y=450,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[the_garfield()])
    button2.place(x=840, y= 675)

The_Garfield()


#11.Kungfu panda 4
def Kungfu_Panda_4():

    title_of_the_move = tk.Label(frame_of_page2,text="Kungfu Panda 4", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1095, y= 400)
    
    file_name = "posters\\kungfu panda 4.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1095, y=450,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[kungfu_panda_4()])
    button2.place(x=1105, y= 675)

Kungfu_Panda_4()


#12.Dune
def Shang_Chi():

    title_of_the_move = tk.Label(frame_of_page2,text="Shang Chi", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1365, y= 400)
    
    file_name = "posters\\shang-chi.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page2, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1360, y=450,)
    
    button2=Button(frame_of_page2,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=25, command=lambda:[shang_chi()])
    button2.place(x=1375, y= 675)

Shang_Chi()

#Next Button
button2 = Button(frame_of_page2, text="Back",bg="black",fg="white", command=page2_to_page1, padx=30, font=("leelawadee",12,"bold"))
button2.place(x=580, y=730)    

#Back Button
button2 = Button(frame_of_page2, text="Next",bg="black",fg="white", command=page2_to_page3, padx=30, font=("leelawadee",12,"bold"))
button2.place(x=840, y=730)

    
#Frame 2 Ends--------------------------------------------------------------------------------------------------------------------------------------

#Frame3 Start--------------------------------------------------------------------------------------------------------------------------------------

frame_of_page3 = Frame(window, bg="black")
file_name = "posters\\music_background.png"


opening_the_file = Image.open(file_name)
opening_the_file = opening_the_file.resize((1540, 800),Image.Resampling.LANCZOS)

back_ground_image = ImageTk.PhotoImage(opening_the_file)

label_for_image = Label(frame_of_page3, image=back_ground_image)
label_for_image.image = back_ground_image
label_for_image.place(x=0, y=0)

#welcome = tk.Label(frame_of_page3,text="Cine World", bg="black", font=("klein", 20), fg='white',padx=100)
#welcome.place(x= 590, y= 10)

#1.bye-bye-bye
def bye_bye_bye():
    title_of_the_move = tk.Label(frame_of_page3,text="Bye-Bye-Bye", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 35, y= 50)
    
    file_name = "posters\\bye-bye-bye.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=35, y=95, )#
    
    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[bye_bye_bye_audio()])
    button2.place(x=63, y= 317)

    button3=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[bye_bye_bye_video()])
    button3.place(x=63, y= 357)
bye_bye_bye()


#2.Bones
def BONES():

    title_of_the_move = tk.Label(frame_of_page3,text="Bones", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 300, y= 50)
    
    file_name = "posters\\bones.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=300, y=95,)

        
    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[bones_audio()])
    button2.place(x=323, y= 317)

    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[bones_video()])
    button2.place(x=323, y= 357)

BONES()


#3.They don't care about us
def They_Dont_Care_About_Us():

    title_of_the_move = tk.Label(frame_of_page3,text="They Don't Care", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 565, y= 50)
    
    file_name = "posters\\they dont care about us.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=565, y=95,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[they_dont_care_about_us_audio()])
    button2.place(x=600, y= 317)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[they_dont_care_about_us_video()])
    button2.place(x=600, y= 357)

They_Dont_Care_About_Us()


#4.Smooth Criminal
def Smooth_Criminal():

    title_of_the_move = tk.Label(frame_of_page3,text="Smooth Criminal", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 830, y= 50)
    
    file_name = "posters\\smooth criminal.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=830, y=95,)
    
    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[smooth_criminal_audio()])
    button2.place(x=855, y= 317)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[smooth_criminal_video()])
    button2.place(x=855, y= 357)

Smooth_Criminal()


#5.Alan Dream Faded
def Alan_Dream_Faded():

    title_of_the_move = tk.Label(frame_of_page3,text="ADF", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1095, y= 50)
    
    file_name = "posters\\alan walker mashup.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1095, y=95,)
 
    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[another_dream_faded_audio()])
    button2.place(x=1130, y= 317)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[another_dream_fraded_video()])
    button2.place(x=1130, y= 357)

Alan_Dream_Faded()


#6. Justin Bieber Baby
def Justin_Bieber_Baby():

    title_of_the_move = tk.Label(frame_of_page3,text="JB Baby", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1360, y= 50)
    
    file_name = "posters\\justin bieber baby.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1360, y=95,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[jb_baby_audio()])
    button2.place(x=1385, y= 317)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[jb_baby_video()])
    button2.place(x=1385, y= 357)

Justin_Bieber_Baby()


#7.Gangnam Style
def World_War_Z():
    title_of_the_move = tk.Label(frame_of_page3,text="Gangnam Style", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 22, y= 415)
    
    file_name = "posters\\Gangnam Style.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=25, y=465,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[gangnam_style_audio()])
    button2.place(x=55, y= 685)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[gangnam_style_video()])
    button2.place(x=55, y= 725)
    
World_War_Z()

#8. Shape of You
def Shpae_Of_You():

    title_of_the_move = tk.Label(frame_of_page3,text="Shape of You", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 300, y= 415)
    
    file_name = "posters\\shape of you.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=300, y=465,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[shape_of_you_audio()])
    button2.place(x=335, y= 685)

    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[shape_of_you_video()])
    button2.place(x=335, y= 725)

Shpae_Of_You()

#9. Bloody Mary
def Bloody_Mary():

    title_of_the_move = tk.Label(frame_of_page3,text="Bloody Mary", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x=565, y= 415)
    
    file_name = "posters\\Bloody Mary.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=565, y=465,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[bloody_mary_audio()])
    button2.place(x=600, y= 685)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[bloody_mary_video()])
    button2.place(x=600, y= 725)

Bloody_Mary()


#10.Unstoppable
def Unstoppable():

    title_of_the_move = tk.Label(frame_of_page3,text="Unstoppable", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 830, y= 415)
    
    file_name = "posters\\unstoppable.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=830, y=465,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[unstoppable_audio()])
    button2.place(x=860, y= 685)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[unstoppable_video()])
    button2.place(x=860, y= 725)

Unstoppable()


#11.Let Me Down Slowly 
def Let_Me_Down_Slowly():

    title_of_the_move = tk.Label(frame_of_page3,text="Let Me Down", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1095, y= 415)
    
    file_name = "posters\\let me down slowly.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1095, y=465,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[let_me_down_slowly_audio()])
    button2.place(x=1125, y= 685)
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[let_me_down_slowy_video()])
    button2.place(x=1125, y= 725)

Let_Me_Down_Slowly()


#12.Believer
def Believer():

    title_of_the_move = tk.Label(frame_of_page3,text="Believer", bg="black", font=("Arial Rounded Mt", 20,"bold"), fg='white')
    title_of_the_move.place(x= 1365, y= 415)
    
    file_name = "posters\\Believer.png"
    opening_the_file = Image.open(file_name)
    back_ground_image = ImageTk.PhotoImage(opening_the_file)
    label_for_image= tk.Label(frame_of_page3, image= back_ground_image)
    label_for_image.opening_the_file = back_ground_image
    label_for_image.place(x=1360, y=465,)

    button2=Button(frame_of_page3,text= "Play",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=23, command=lambda:[beleiver_audio()])
    button2.place(x=1390, y= 685)#1385 670
    
    button2=Button(frame_of_page3,text= "Watch",bg="white", fg="black", font=("leelawadee",12,"bold"),padx=15, command=lambda:[beleiver_video()])
    button2.place(x=1390, y= 725)

Believer()

#Stop button
stop_button=Button(frame_of_page3,text= "Stop",bg="black", fg="white", font=("leelawadee",12,"bold"),padx=25, command=lambda:[stop_music()])
stop_button.place(x=725, y= 700)

#Back Button
button2 = Button(frame_of_page3, text="Back",bg="black",fg="white", command=page3_to_page2, padx=25, font=("leelawadee",12,"bold"))
button2.place(x=725, y=740)

#Frame 3 Ends-------------------------------------------------------------------------------------------------------------------------------------

window.mainloop()
