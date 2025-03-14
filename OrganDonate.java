package coding;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class OrganDonate
{
   static Scanner sc = new Scanner(System.in);

   static                                       //This static block is executed once when the class is loaded.
   {
       System.out.println("'Care'");//donor
       System.out.println("THE ORGAN DONATING/FINDING SITE");//organ
       System.out.println("%%%%%%%%%%-WELCOME-%%%%%%%%%%");
   }

   public static  void main(String[] args)
{
       wantOrgan wo = new wantOrgan();//object of classes.
       wantBlood wb = new wantBlood();
       donateBlood db = new donateBlood();
       donateOrgan dor = new donateOrgan();

       System.out.println("Select the choice you want");
       System.out.println("1:-you want an organ to replace");
       System.out.println("2:-you want urgent blood");
       System.out.println("3:-You want to Donate an Organ");
       System.out.println("4:-you wanna be blood donor");

       int choice = sc.nextInt();
       switch (choice) 
	{
           case 1:
               wo.Want_organ();
               break;
           case 2:
               wb.Want_blood();
               break;
           case 3:
               dor.Donate_oragan();
               break;
           case 4:
               db.Donate_blood();
               break;
           default:
               System.out.println("Not an valid choice");
               System.exit(1);
       }

       Complaint feed = new Complaint();
       System.out.println("We would like to hear your feedback with us...\n" +
               "Press 1 to for complaint \n" +
               "Press 2 to exit without any complaint \n");
       int fb = sc.nextInt();
       if (fb == 1) 
	{
           feed.complaint();
       }
	else if (fb == 2)
           System.exit(0);
       else 
      System.out.println("wrong input. Exiting!");
    ShowComplaint showComplaint = new ShowComplaint();
    showComplaint.show();

   }


   static class wantOrgan 
     {
       Scanner sc = new Scanner(System.in);

       void Want_organ() 
	{
           System.out.println("please enter organ you want");
           String organ = sc.next();

           System.out.println("please give us some details");

           System.out.println("Enter patient's first name");
           String name1 = sc.next();

           System.out.println("Enter patient's last name");
           String lname1 = sc.next();

           System.out.println("Gender:-Male/Female");
           String Gen1 = sc.next();

           System.out.println("Enter patient's age");
           int age1 = sc.nextInt();

           System.out.println("Enter city");
           String city1 = sc.next();

           System.out.println("Enter state");
           String state1 = sc.next();

           System.out.println("Enter your blood grup");
           String blood1 = sc.next();

           System.out.println("Enter you contact details");
           Double con1 = sc.nextDouble();

           System.out.println("We will contact you if we found some good news for you");
           System.out.println("Till then please be safe and take care of patient");
       }

   }

   static class wantBlood 
	{

       void Want_blood() 
{
           System.out.println("please enter blood group you want");
           String blood2 = sc.next();

           System.out.println("please give us some details of patient");
           System.out.println("Enter patient's name ");
           String name2 = sc.next();

           System.out.println("Enter patient's last name ");
           String lname2 = sc.next();

           System.out.println("Enter patient's age ");
           int age2 = sc.nextInt();

           System.out.println("Gender:-Male/Female");
           String Gen_wb = sc.next();

           System.out.println("Enter City Name: ");
           String city2 = sc.next();

           System.out.println("Enter Near By hospital's Name\"");
           String hospi1 = sc.next();

           System.out.println("Enter contact no-");
           Double con2 = sc.nextDouble();

           System.out.println("You can also change blood in blood bank by giving eqaul amount of blood of another type ");
           System.out.println("press 1 for Blood  Excange in Blood Bank");
           System.out.println("press 2 for print and check details given by you");

           System.out.println("press 3 for exit");
           int ch2 = sc.nextInt();
           switch (ch2)//choice for blood exchange and details
           {
               case 1:
                   System.out.println("Enter choice ");
                   System.out.println("Press 1:-Indore");
                   System.out.println("Press 2:-Ujjain");
                   System.out.println("Press 3:-Bhopal");
                   System.out.println("Press 4:-Ratlam");
                   System.out.println("Press 5:-Gwalior");

                   int ch3 = sc.nextInt();
                   switch (ch3)//choice of city for hospital
                   {
                       case 1:
                           System.out.println("Here are some Details of hospitals in Indore,in  which you can Exchange blood");
                           System.out.println("1:-Arihant Hospital and Research Center");
                           System.out.println("2:-Shalby hospital");
                           System.out.println("3:-Apollo hospital");

                           System.out.println("Press the no among the hospital for more details");
                           int ch4 = sc.nextInt();//var for selecting hospitals in selected indore
                           switch (ch4) 
				{
                               case 1:
                                   System.out.println("Arihant hospital and Reseach center");
                                   System.out.println("Address:- 283-a,Gumasta Nagar,Scheme-71,Indore");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-0731-111111");
                                   break;
                               case 2:
                                   System.out.println("Shalby Hospital");
                                   System.out.println("Address:- 5,6 R S Bhandari Marg,Indore");
                                   System.out.println("Patient's Feedback Star-/");
                                   System.out.println("contact no:-0731-000000");
                                   break;
                               case 3:
                                   System.out.println("Apollo Hospital");
                                   System.out.println("Adress:-74-c,Vijay nagar,Indore");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-0731-123456");
                                   break;
                               default:
                                   System.out.println("Invalid choice");
                                   System.exit(1);
                           }
                           break;
                       case 2:
                           System.out.println("Here are some Details of Hospitals in Ujjain,in  which you can Exchange blood");
                           System.out.println("1:-R D Gardi Hospital ");
                           System.out.println("2:-Tejankar Hospital and Research center");
                           System.out.println("3:-Deshmukh hospital");

                           System.out.println("Press the no among the Hospital for more details");
                           int ch5 = sc.nextInt();//var for selecting hospitals in selected ujjain
                           switch (ch5) 
				{
                               case 1:
                                   System.out.println("Ruxmaniben Deepchand Gardi Hospital");
                                   System.out.println("Address:- Agar road, Ujjain");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-0734-111111");
                                   break;
                               case 2:
                                   System.out.println("Tejankar Hospital and Research center");
                                   System.out.println("Address:- 4,near Vishal Mega mart,Ujjain");
                                   System.out.println("Patient's Feedback Star-/");
                                   System.out.println("contact no:-0734-000000");
                                   break;
                               case 3:
                                   System.out.println("Deshmukh hospital");
                                   System.out.println("Adress:-43,Sanwer Road,Nana Kheda,Ujjain");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-0734-444444");
                                   break;
                               default:
                                   System.out.println("Invalid choice");
                                   System.exit(1);
                           }
                           break;
                       case 3:
                           System.out.println("Here are some Details of Hospitals in Bhopal,in  which you can Exchange blood");
                           System.out.println("1:-Bansal Hospital");
                           System.out.println("2:-Janki Hospital");
                           System.out.println("3:-Galaxy hospital");

                           System.out.println("Press the no among the Hospital for more details");
                           int ch6 = sc.nextInt();//var for selecting hospitals in selected Bhopal
                           switch (ch6) 
				{
                               case 1:
                                   System.out.println("Bansal Hospital");
                                   System.out.println("Address:- Chuna Bhatti Road, Bhopal");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-0755-4086000");
                                   break;
                               case 2:
                                   System.out.println("Janki Hospital");
                                   System.out.println("Address:- Gulmohar Colony,Bhopal");
                                   System.out.println("Patient's Feedback Star-/");
                                   System.out.println("contact no:-0755-7854637");
                                   break;
                               case 3:
                                   System.out.println("Galaxy Hospital");
                                   System.out.println("Adress:-25,Danish Kunj,Bhopal");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-0755-3545366");
                                   break;
                               default:
                                   System.out.println("Invalid choice");
                                   System.exit(1);
                           }
                           break;
                       case 4:
                           System.out.println("Here are some Details of Hospitals in Ratlam,in  which you can Exchange blood");
                           System.out.println("1:-Samarpan Hospital");
                           System.out.println("2:-Maa Gayatri Hospital");
                           System.out.println("3:-Janak hospital");

                           System.out.println("Press the no among the Hospital for more details");
                           int ch7 = sc.nextInt();//var for selecting hospitals in selected Ratlam

                           switch (ch7) 
				{
                               case 1:
                                   System.out.println("Samarpan Hospital");
                                   System.out.println("Address:- Opp. Ajanta Hotel,Ratlam");
                                   System.out.println("Patient's Feedback Star-/");
                                   System.out.println("contact no:-09302112234");
                                   break;
                               case 2:
                                   System.out.println("Janki Hospital");
                                   System.out.println("Address:- 80 Feet Road,Ratlam");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-07412264040");
                                   break;
                               case 3:
                                   System.out.println("Janak Hospital");
                                   System.out.println("Adress:-Shastri Nagar,Ratlam");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-9000661115");
                                   break;
                               default:
                                   System.out.println("Invalid choice");
                                   System.exit(1);
                           }
                           break;
                       case 5:
                           System.out.println("Here are some Details of Hospitals in Gwalior,in  which you can Exchange blood");
                           System.out.println("1:-Apollo Spectra Hospital");
                           System.out.println("2:-Prime Hospital");
                           System.out.println("3:-Kalyan hospital");

                           System.out.println("Press the no among the Hospital for more details");
                           int ch8 = sc.nextInt();//var for selecting hospitals in selected gwalour
                           switch (ch8) 
				{
                               case 1:
                                   System.out.println("Apollo Spectra Hospital");
                                   System.out.println("Address:- Vikas Nagar ,Gwalior");
                                   System.out.println("Patient's Feedback Star-/");
                                   System.out.println("contact no:-8448440991");
                                   break;
                               case 2:
                                   System.out.println("Prime Hospital");
                                   System.out.println("Address:- City Center,Gwalior");
                                   System.out.println("Patient's Feedback Star-/*");
                                   System.out.println("contact no:-7514048499");
                                   break;
                               case 3:
                                   System.out.println("Kalyan Hospital");
                                   System.out.println("Adress:-Laxmi Bai Colony,Gwalior");
                                   System.out.println("Patient's Feedback Star-/");
                                   System.out.println("contact no:-07514087244");
                                   break;
                               default:
                                   System.out.println("Invalid choice");
                                   System.exit(1);
                           }
                           break;
                       default:
                           System.out.println("Invalid Choice or We Dont Have Details of Other City at this time");
                           System.out.println("SOORY FOR INCONVINANCE");
                           System.exit(1);
                   }
               case 2:
                   System.out.println("The given details are ");
                   System.out.println("blood group you want " + blood2);
                   System.out.println("Patient's name:-" + name2 + " " + lname2);
                   System.out.println("Patient's Age:-" + age2);
                   System.out.println("Gender:-" + Gen_wb);
                   System.out.println("City:-" + city2);
                   System.out.println("Hospital:-" + hospi1);
                   System.out.println("Contact Number:-" + con2);
                   System.out.println("We will contact you if we found some good news for you");
                   System.out.println("Till then please be safe and take care of patient");
                   break;
               case 3:
                   System.exit(1);
                   break;
               default:
                   System.exit(1);
                   break;
           }
       }
//System.exit(1);
   }

   static class donateOrgan 
	{
        donateBlood db = new donateBlood();


       void Donate_oragan() 
	  {
           System.out.println("You'r Doing Great Thing");
           System.out.println("Please Give Us Few Details");

           System.out.println("Enter Donor's  First Name ");
           String Firstn3 = sc.next();

           System.out.println("Enter Donor's Last Name");
           String lastn3 = sc.next();

           System.out.println("Gender:-Male/female");
           String Gen_d = sc.next();

           System.out.println("Enter Donor's Age");
           int Age3 = sc.nextInt();

           if (Age3 <= 50) 
		{
               System.out.println("We Encourage Your Courage");
               System.out.println("But your Age Is not Accetable for donating Organ ");
               System.out.println("Perhaps You can also Donate blood ");
               System.out.println("Press 1 For Go to donate blood ");

               int Choice9 = sc.nextInt();
               if (Choice9 == 1) 
		{
                   db.Donate_blood();
               } 
		else 
		{
                   System.out.println("Thankyou for Visiting us");
                   System.exit(1);
               }
           }
	    System.out.println("If He/She Have Any Serious Diseas,Press One");
           Scanner sc=new Scanner(System.in);
           int Choice_d = sc.nextInt();
           if (Choice_d == 1) 
		{
               System.out.println("Sorry the Donor Cannot Donate Oragan For self  And Other's Health Issue");
               System.exit(1);
           } 
	    else
		{
               System.out.println("Enter Organ");
               String Organ_d = sc.next();

               System.out.println("Enter Blood Group");
               String Blood_d = sc.next();

               System.out.println("Enter City");
               String City_d = sc.next();

               System.out.println("Enter State");
               String State_d = sc.next();

               System.out.println("Enter Your Contact no");
               Double Con_d = sc.nextDouble();

               System.out.println("If We Found Anything Related To you ,We Will contact You");
               System.out.println("Till Then,please Be Safe....................");
               System.out.println("Thank-you*");
           }
       }

   }

   static class donateBlood 
    {


       void Donate_blood() 
	{
           System.out.println("Thank-you for Saving Some Precious Life");
           System.out.println("Please Give Us Some details Of Donor");

           System.out.println("Enter Donor's Name");
           String Name_db = sc.next();

           System.out.println("Enter Donor's Last name");
           String Lname_db = sc.next();

           System.out.println("Gender:-Male/Female");
           String Gen_db = sc.next();

           System.out.println("Donor's Age");
           int Age_db = sc.nextInt();

           if (Age_db <=17 || Age_db>=60)
	     {
               System.out.println("We Encourage Your Courage");
               System.out.println("But your Age Is not Accetable for donating Blood ");
           } 
	    else 
	     {
               System.out.println("Is Donor having Any  Serious Diseases");
               System.out.println("Like Cancer,Daibities etc");

               System.out.println("Press 1:- IF he/she is Suffering from them. \n" +
               "Press 2:- For not Having any type of serious diseas. ");
		System.out.println("Entering number other then 1&2 will close the plateform.\n" +
		"Thankyou");

               int Ch_db = sc.nextInt();
               if (Ch_db == 1) 
	     {
                   System.out.println("Sorry the Donor Cannot Donate Oragan For self  And Other's Health Issue");
                   System.exit(1);
             } 
	   else if(Ch_db == 2)
	     {
                   System.out.println("Enter Blood Group");
                   String Blood_db = sc.next();

                   System.out.println("Enter City");
                   String City_db = sc.next();

                   System.out.println("Enter State");
                   String State_db = sc.next();

                   System.out.println("Enter Your Contact no");
                   Double Con_db = sc.nextDouble();

                   System.out.println("If We Found Anything Related To you ,We Will contact You");
                   System.out.println("Till Then,please Be Safe.......................");
                   System.out.println("*Thank-you");
               }
	    else 
		System.exit(0);
           }
       }
   }

  static class Complaint 
	{
       void complaint() 
	{

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter your name");
           String fname = sc.next();
           try 
	      {
               FileOutputStream fout = new FileOutputStream(fname + ".txt");
               System.out.println("Please write your complaint is about how a hospital has treated you................");
               String s = sc.next();
               byte b[] = s.getBytes();//converting string into byte array
               fout.write(b);//storing content in file
               fout.close();//file close
               System.out.println("Thank you for your visit. \n");
           } 
	    catch (Exception e) 
	    {
               System.out.println(e);
           }
       }
   }

   static class ShowComplaint
   {
       void show()
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter your name to open complaint");
           String fname = sc.next();
           try 
	    {
               FileInputStream fin = new FileInputStream(fname + ".txt");//read file 
               int i = 0;
               while ((i = fin.read()) != -1) //file searching keyword
		{
                   System.out.print((char) i);
               }
               fin.close();
           } 
	   catch (Exception e) 
	     {
               System.out.println("File not found");
           }

       }
   }
}
