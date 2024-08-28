@echo off

:: Set current directory to the batch file's directory
cd "%~dp0"

:: Create log file
echo ===========================>> run.log
echo Starting bot...>> run.log
date /t >> run.log
time /t >> run.log
echo ===========================>> run.log

:: Run Java JAR file
start "PGR2" java -jar bot.jar 2>> run.log

:: Check for errors
if %ERRORLEVEL% NEQ 0 (
    echo ===========================>> run.log
    echo Error: Failed to start bot!>> run.log
    echo ===========================>> run.log
    pause
    exit /b 1
)

echo ===========================>> run.log
echo Bot started successfully!>> run.log
echo ===========================>> run.log
