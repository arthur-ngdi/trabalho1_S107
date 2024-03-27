#!/bin/bash

sudo apt install mailutils
recipient="$1"
subject="Tests Status"
body="Tests Passed"

echo $body | mail -s $subject $1