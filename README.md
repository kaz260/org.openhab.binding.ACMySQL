# org.openhab.binding.ACMySQL

The MySQL binding allows openHAB to act as an MySQL client, so that openHAB items can store and retrieve in/from an MySQL. To install, place this bundle in the folder ${openhab_home}/addons and add binding information to your configuration. See the following sections on how to do this.

# Binding Configuration
acmysql:server1.url=jdbc:mysql://192.168.8.1/database_name
acmysql:server1.user=user_name
acmysql:server1.password=password

# Items Configuration 
Number DATA1 {acmysql="<[server1:SELECT value FROM table WHERE name='temp']"}
Number DATA2 {acmysql=">[server1:UPDATE table SET value=? WHERE name='temp']"}
Nuymber DATA3 {acmysql=">>[server1:INSERT INTO table (name, value) VALUES ('temp', ?)]"}

# Sitemap Configuration
Text item=DATA1

Setpoint item=DATA2 minValue=100 maxValue=200 step=10

Setpoint item=DATA3 minValue=100 maxValue=200 step=10
