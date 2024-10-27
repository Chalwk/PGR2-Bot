**PGR2 Bot** is a fun and interactive Discord bot written in Java with the JDA library, designed to elevate the gaming
experience of *Project Gotham Racing 2* fans. This bot offers randomized game settings, bringing new challenges and
excitement to each race.

---

## 🚗 Key Features

- **`/pgr2 class`**: Randomly generates a vehicle class, introducing variety and unpredictability to gameplay.
- **`/pgr2 vehicle`**: Selects a specific vehicle within a class, giving players a fresh challenge to conquer.
- **`/pgr2 track`**: Picks a random track from the PGR2 world, ensuring a unique experience every time.
- **`/pgr2 time`**: Sets a random time of day, adding dynamic lighting and ambiance to your races.
- **`/pgr2 weather`**: Changes the in-game weather, introducing an extra layer of difficulty for immersive play.
- **`/pgr2 all`**: Randomizes class, vehicle, track, time of day, and weather for the ultimate game setup.

---

## 🛠 Installation and Setup

### Prerequisites

Before setting up the **PGR2 Bot**, make sure the following prerequisites are met:

1. **Java 17**:
    - *Windows*: [Download Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) from the
      Oracle website.
    - *Linux*: Run `sudo apt install openjdk-17-jre-headless` in your terminal.

2. **Bot Token**:
    - Obtain a **bot token** from the [Discord Developer Portal](https://discord.com/developers/applications) by
      following these steps:
        - Create a new application and assign it a name.
        - In the **Bot** tab, configure your bot’s username and profile picture.
        - Generate a token, then copy and paste it into `./PGR2-Bot/auth.token`. **Keep this token secure.**
        - Enable **Presence Intent**, **Server Members Intent**, and **Message Content Intent** under **Privileged
          Gateway Intents**.
        - Under the **OAuth2** tab, use the **OAuth2 URL Generator** with the **bot** scope and **Administrator**
          permissions to generate an invite URL.
        - Paste this URL in your browser to invite the bot to your server. Complete the captcha and click **Authorize**.

---

## ▶️ Running the Bot

To launch **PGR2 Bot** on your Discord server:

- **Windows**: Double-click the `run.bat` file.
- **Linux**: Execute the `run.sh` file in your terminal.

Enjoy creating unique racing challenges for yourself and other *Project Gotham Racing 2* fans with the **PGR2 Bot**!

--- 

Feel free to reach out or create an issue in this repository if you encounter any questions or bugs. Happy racing!