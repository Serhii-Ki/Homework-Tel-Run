#!/bin/bash
echo "Hello student!"
echo -n "Enter your name : "
read name
echo "Hello $name"
mkdir -p /temp/test
date +"%H%M%S" >> /temp/mydate.txt
echo "Сохранняем данные"
for count in {1..10}
do
echo $count
sleep 0.5
done
echo "Data saved. continue work"
df -h >> /temp/mydate.txt
cp /temp/mydate.txt /opt/newmydate.txt
for start in {1..5}
do
echo $start
sleep 1
done
echo "Well done Boss"
