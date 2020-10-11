public  class ClockDisplay
{
        private NumberDisplay hours;
        private NumberDisplay minutes;
        public String displayString;
   
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public void timeTick()
        {
        minutes.increment();
        if(minutes.getValue() == 0)
        {
            hours.increment();
        }
        updateDisplay();
        }

    public String getTime()
    {
        return displayString;
    }

}
