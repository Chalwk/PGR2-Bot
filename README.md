# PGR2 Bot

A Discord Bot written in Java using the [JDA](https://github.com/discord-jda/JDA) library.

PGR2 Bot is a game night settings randomizer for **Game Project Gotham Racing 2**.

## Commands:

- `/pgr2` `class`
  - Generates a random class.
- `/pgr2` `vehicle`
  - Generates a random vehicle.
- `/pgr2` `track`
  - Generates a random track.
- `/pgr2` `time`
  - Generates a random time of day.
- `/pgr2` `weather`
  - Generates a random weather.
- `/pgr2` `all`
  - Generates a random class, vehicle and track, time of day and weather.

## INSTALLATION AND SETUP:

Prerequisites:

- Must have Java 17 installed.
- For Windows users, you can download Java 17
  from [here](https://www.oracle.com/java/technologies/downloads/#jdk17-windows).
- For Linux users, run this command in your terminal: `sudo apt install openjdk-17-jre-headless`

Register an application on the [Discord Developer Portal](https://discord.com/developers/applications) and obtain a *
*bot token**.
A Discord bot token is a short phrase (represented as a jumble of letters and numbers) that acts as a key to controlling
a Bot.

There are many tutorials online to help you learn how to create a Discord Application, however, as a general guide,
follow these steps:

- Click **New Application**.
  Provide a name for your bot and click **create**.
- Click the **Bot** tab on the left-hand side menu.
  Set the bot's username and profile picture.
- Click **Reset Token** and then **Yes, do it!**.
- Copy and paste the token into the *./PGR2-Bot/auth.token* file. (never share this token with anyone).
- On the same page, scroll down to **Privileged Gateway Intents**.
- Enable **Presence Intent**, **Server Members Intent** and **Message Content Intent**.
- Click the **OAuth2** tab on the left-hand side menu.
  Click the sub-menu **OAuth2 URL Generator**.
  Under **Scopes**, select **bot**.
  Under **Bot Permissions**, select **Administrator**
  Copy the URL that gets generated and paste it into your browser.
- Select the server you want to add the bot to and click **Continue**.
  Click **Authorize**.
  Complete the captcha and click **Authorize**.
  The bot should now be on your Discord server.

## RUNNING THE BOT:

For window's users, run the *run.bat* file.
For Linux users, run the *run.sh* file.