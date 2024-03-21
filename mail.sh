#!/bin/bash

sudo apt install mailutils
recipient="$1"
subject="Greetings!"
body="Hello, World! This is a test email sent using 'mutt'."

echo $body | mail -s $subject $1