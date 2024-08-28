#!/bin/bash
# Create log file
echo "==========================" >> run.log
echo "Starting bot..." >> run.log
date "+%Y-%m-%d %T" >> run.log
echo "==========================" >> run.log

# Run Java JAR file
java -jar PGR2.jar 2>> run.log

# Check for errors
if [ $? -ne 0 ]; then
echo "==========================" >> run.log
    echo "Error: Failed to start bot!" >> run.log
    echo "==========================" >> run.log
    exit 1
fi
# Write success message to log file
echo "==========================" >> run.log
echo "Bot started successfully!" >> run.log
echo "==========================" >> run.log
