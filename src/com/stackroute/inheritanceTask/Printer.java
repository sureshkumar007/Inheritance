//I DONE TWO PROGRAMS


package com.stackroute.inheritanceTask;

class PrinterDemo
{
    //
    //creating all variable with private access modifer;
    //


    private int tonerLevel;
    private int noOfPages;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }


    }

class Printer
{
    public static void main(String args[])
    {
        PrinterDemo printerDemo=new PrinterDemo();
        printerDemo.setTonerLevel(55);
        printerDemo.getTonerLevel();
        printerDemo.setNoOfPages(22);
        printerDemo.getNoOfPages();
        printerDemo.setDuplex(true);
        printerDemo.getDuplex();
        printerDemo.toString();
    }
}

