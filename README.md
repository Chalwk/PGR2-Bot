# PGR2 Bot

The PGR2 Bot is a fun and engaging Discord Bot written in Java utilizing the JDA library. This bot is specifically
designed to enhance the gaming experience of Project Gotham Racing 2 fans by providing randomized game settings for
exciting and unique challenges.

# Features:

- `/pgr2 class`: Generates a random vehicle class to keep your gameplay fresh and exciting.
- `/pgr2 vehicle`: Provides a random vehicle from the selected class for you to master on the racetrack.
- `/pgr2 track`: Selects a random track from the PGR2 world, ensuring no two races are the same.
- `/pgr2 time`: Determines a random time of day setting, adding variety and a touch of realism to your races.
- `/pgr2 weather`: Randomizes the in-game weather conditions for an extra challenge and a more immersive experience.
- `/pgr2 all`: Generates a combination of random class, vehicle, track, time of day, and weather settings, for the
  ultimate randomized gaming experience.

## INSTALLATION AND SETUP:

Before installing the PGR2 Bot, ensure you have the following prerequisites:

1. Java 17 installed:

- Windows users: Download Java 17 from the Oracle website.
- Linux users: Run `sudo apt install openjdk-17-jre-headless` in your terminal.

2. Obtain a **bot token** from the [Discord Developer Portal](https://discord.com/developers/applications) by following
   these steps:

- Create a new application and provide a name for your bot.
- Navigate to the **Bot** tab on the left-hand menu and set your bot's username and profile picture.
- Reset your token, copy it, and paste it into the ./PGR2-Bot/auth.token file. Keep this token private.
- Enable **Presence Intent**, **Server Members Intent**, and **Message Content Intent** under **Privileged Gateway
  Intents**.
- Under the **OAuth2** tab, use the **OAuth2 URL Generator** with the **bot** scope and **Administrator** Bot
  Permissions to generate a URL.
- Paste the URL into your browser and select the server to which you want to add the bot.
- Complete the captcha and click **Authorize** to add the bot to your Discord server.

# Running the Bot:

To start using the PGR2 Bot on your server, follow the steps below:

- Windows users: Execute the run.bat file.
- Linux users: Run the run.sh file.

- Enjoy challenging yourself and other PGR2 fans with the randomized game settings provided by the PGR2 Bot!

Future commands:
/pgr2 submit-time [time] [track] [class]

Validation and Formatting:

Enforce a time format, like mm:ss.sss or hh:mm:ss, to make the entries consistent.
For easy filtering, each track and class could have preset names or codes to avoid typos (e.g., /pgr2 submit-time 02:
35.678 Tokyo Class-C).
Leaderboard Display:

Add /pgr2 leaderboard [track] [class] command to retrieve the top 10 times on a specific track and class. This way,
players can see who holds the current record.