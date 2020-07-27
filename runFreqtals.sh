#!/bin/bash

projectPath=$1
commit1=$2
commit2=$3
minsup=$4

#keep the root directory
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
#get project name and create directory
projectName=$(basename $projectPath)
inputDir=input/$projectName
if [ -d $inputDir ] 
	then
		rm -r $inputDir
fi
#count variable
i=1

#import ASTs
for commit in $commit1 $commit2
do
	#go to project directory
	cd $projectPath
	#checkout commit i
	git checkout $commit
	#go to root directory
	cd $DIR
	#run java-importer to create XMLs
	java -jar java-importer.jar import $projectPath/
	#create directory to store source files of the commit
	mkdir $inputDir
	mkdir $inputDir/$commit
	#copy all source files (java, xml) to input directory
	python3 copyFiles.py $projectPath/src $inputDir/$commit
	#change name of commit directory
	mv $inputDir/$commit $inputDir/commit$i
	i=$((i+1))
	#go to project repository directory
	cd $projectPath
	#remove xml files
	git clean -fd	
done

#run freqtals
cd $DIR
java -jar freqtals.jar conf/config.properties $minsup $projectName

