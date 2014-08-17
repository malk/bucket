#!/bin/sh

# Q. We want to pass to our script arguments with options (like -f -v -D
# etc), we do not care the order of the options, some of them are optional,
# some of them are not, we still have normal arguments that are *not*
# options mixed in, how do we do that?

usage() {
	echo `basename $0`: ERROR: $* 1>&2
	echo usage: `basename $0` '[-[abc]] [-o file]' '[file ...]' 1>&2
	exit 65
}

a= b= c= o= 
while getopt "abco:" "$@"
do
        case "$1" in
        -a) a=1;;
        -b) b=1;;
        -c) c=1;;
        -o) shift; o="$1";;
        --) break;;
        esac
        shift
done
shift # get rid of --
# rest of script...
