#!/bin/sh

set -e -u

declare -a array=("abi", "codegen", "core", "crypto", "samples", "tuples", "utils", "src")


for file in `ls .`; do

    if [ -d $file ]
    then
        rm -rf $file/out
    else
        echo "$file ignored"
    fi
done

rm -rf generated