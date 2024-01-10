package net.kender.logger.log5k.conf;

public class CustomLogger {
    public String ansicolor_;
    public String TypeMsg_;
    public Boolean dateOn_;
    public Boolean classComplete_;
    public Boolean registerOnFile_;
    public Boolean RegisterOnDates_;
    public Boolean threadOn_;
    /**
     * 
     * @param ANSIColor color fo the text
     * @param TypeMsg Type of message
     * @param dateOn log data
     * @param classComplete whether to complete the entire class package
     * @param threadOn put the thread in print
     * @param registerOnFile whether to record the logs in the file
     * @param RegisterOnDates whether to record the data in the file
     */
    public CustomLogger(String ANSIColor,String TypeMsg,Boolean dateOn,Boolean classComplete,Boolean threadOn,Boolean registerOnFile,Boolean RegisterOnDates){
        ansicolor_ = ANSIColor;
        TypeMsg_ = TypeMsg;
        dateOn_ = dateOn;
        classComplete_ = classComplete;
        threadOn_ = threadOn;
        registerOnFile_ = registerOnFile;
        RegisterOnDates_ = RegisterOnDates;
    }
}
