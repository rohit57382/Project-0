class Alarm
{
private short aTime;
private boolean alarmState, alarmSound;
public short getATime()
{
return aTime;
}
public boolean getAlarmState()
{
return alarmState;
}
public boolean getAlarmSound()
{
return alarmSound;
}
public void setATime(short at)
{
aTime=at;
}
public void setAlarmState(boolean as)
{
alarmState=as;
}
public void setAlarmSound(boolean asnd)
{
alarmSound=asnd;
}
}
class Clock
{ private short cTime,cDay,cDate,cMonth,cYear;
private boolean clockState;
public short getCTime()
{
return cTime;
}
public short getCDay()
{
return cDay;
}
public short getCDate()
{
return cDate;
}
public short getCMonth()
{
return cMonth;
}
public short getCYear()
{
return cYear;
}
public boolean getClockState()
{
return clockState;
}
public void setCTime(short ct)
{
    cTime=ct;
}
public void setCDay(short cd)
{
    cDay=cd;
}
public void setCDate( short cdt)
{
cDate=cdt;
}
public void setCMonth(short cm)
{
cMonth=cm;
}
public void setCYear(short cy)
{
    cYear=cy;
}
public void setClockState(boolean cs)
{
   clockState=cs;
}

}
class Tester
{
public static void main(String[] args)
{

}
}
