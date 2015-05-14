#!/bin/bash

if [ ! -n "$1" ]; then
	echo "Usage: deleteBranch your_branch_prefix"
	echo "Example: deleteBranch cgj"
	exit 1
fi

echo "Are you $1? Please answer yes[y] or no[n]"
read YES_OR_NO
UPPERCASE_YES_OR_NO=`echo $YES_OR_NO | tr '[a-z]' '[A-Z]'`
if [ $UPPERCASE_YES_OR_NO = "YES" -o $UPPERCASE_YES_OR_NO = "Y" ]; then
        echo "The local git branches you are going to delete are:"
	echo "----------------------------------------------------"
	git branch | grep $1
	echo "----------------------------------------------------"
	echo "Do you really want to delete these local git branches? Please answer yes[y] or no[n]"
        read YES_OR_NO
        UPPERCASE_YES_OR_NO=`echo $YES_OR_NO | tr '[a-z]' '[A-Z]'`
        if [ $UPPERCASE_YES_OR_NO = "YES" -o $UPPERCASE_YES_OR_NO = "Y" ]; then
		git branch | grep $1 | xargs git branch -D 
        else
  		exit 1
	fi
else
	exit 1
fi
