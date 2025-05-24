# Budget-Planner-Application

🧹 DOHN Cleaning Service System
Welcome to the DOHN Cleaning Service System — a console-based Java application that allows users to book house cleaning services with flexible options and real-time availability checks.

📌 Features
📅 Check cleaner availability based on day and time

🧼 Choose type of service (set or full)

👥 Select service category (individual, pair, or group)

⏱️ Set service duration (daily, weekly, monthly)

🧾 Auto-generate a receipt and save it to a file (receipt.text)

📁 Project Structure
bash
Copy
Edit
project/
│
├── CleaningSystem.java       # Main class handling user flow and receipt
├── Price.java                # Service option selection and price calculation
├── Schedule.java             # Weekly cleaner availability matrix
└── receipt.text              # File where customer receipts are saved
▶️ How to Run
Clone the repository

bash
Copy
Edit
git clone https://github.com/your-username/cleaning-system.git
cd cleaning-system
Compile the code

bash
Copy
Edit
javac project/*.java
Run the program

bash
Copy
Edit
java project.CleaningSystem
🧮 Pricing Logic
Type	Category	Base Price (RM)
Set	Individual	150
Set	Pair	250
Set	Group	375
Full	Individual	200
Full	Pair	300
Full	Group	450

Daily: Price × 20

Weekly: Price × 4

Monthly: Base price

📌 Sample Output
text
Copy
Edit
╔------------------------------------╗
| WELCOME TO DOHN CLEANING SERVICES |
╚------------------------------------╝
...
Saved as receipt.text
THANK YOU FOR CHOOSING DOHN CLEANING SERVICES :)
📃 License
This project is for academic and demonstration purposes. You can freely use and modify it for learning.
