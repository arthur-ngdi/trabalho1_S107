#!/bin/bash

sudo apt install mailutils
recipient="$1"
subject="Build Status"
body="Build Passed"

echo $body | mail -s $subject $1