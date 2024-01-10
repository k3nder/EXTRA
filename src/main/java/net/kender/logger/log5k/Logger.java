package net.kender.logger.log5k;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.kender.logger.log5k.Extras.Logs;
import net.kender.logger.log5k.conf.CustomLogger;
import net.kender.logger.log5k.conf.log5kConf;

public class Logger {
    public static log5kConf config = new log5kConf(null);
    private String name = "";
    private Class<?> r;
    /**
     * @param c class to log
     */
    public Logger(Class<?> c){
        r = c;
    }
    /**
     * @param msg message
     */
    public void warn(Object msg){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        
        if(config.__WARN_ONs__){
            System.out.print("\n" + config.__COLOR_WARN__ + hora + " [" + r.getSimpleName() + "." + Thread.currentThread().getName() + "] !WARN!: " + msg + "\u001B[0m");
        }
        if(config.__WARN_ONf__){
            try {
                
                t.registerLog("[" + hora + "] (" + r.getSimpleName() + "." + Thread.currentThread().getName() + ") !WARN!: " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 
     * @param msg message
     */
    public void info(Object msg){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        if(config.__INFO_ONs__){
            System.out.print("\n" + config.__COLOR_INFO__ + hora + " [" + r.getSimpleName() + "." + Thread.currentThread().getName() + "] INFO: " + msg + "\u001B[0m");
        }
        if(config.__INFO_ONf__){
            try {
                t.registerLog("[" + hora + "] (" + r.getSimpleName() + "." + Thread.currentThread().getName() + ") INFO: " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 
     * @param msg message
     */
    public void debug(Object msg){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        if(config.__DEBUG_ONs__){
            System.out.print( "\n" + config.__COLOR_DEBUG__ + hora + " [" + r.getSimpleName() + "." + Thread.currentThread().getName() + "] DEBUG: " + msg + "\u001B[0m");
        }
        if(config.__DEBUG_ONf__){
            try {
                t.registerLog("[" + hora + "] (" + r.getSimpleName() + "." + Thread.currentThread().getName() + ") DEBUG: " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 
     * @param msg message
     */
    public void error(Object msg){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        if(config.__ERROR_ONs__){
            System.out.print("\n" + config.__COLOR_ERROR__ + hora + " [" + name + "." + Thread.currentThread().getName() + "] ERROR: " + msg + "\u001B[0m");
        }
        if(config.__ERROR_ONf__){
            try {
                t.registerLog("[" + hora + "] (" + r.getSimpleName() + "." + Thread.currentThread().getName() + ") ERROR: " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 
     * @param msg message
     */
    public void fatal(Object msg){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        if(config.__FATAL_ONs__){
            System.out.print("\n" + config.__COLOR_FATAL__ + hora + " [" + name + "." + Thread.currentThread().getName() + "] FATAL: " + msg + "\u001B[0m");
        }
        if(config.__FATAL_ONf__){
            try {
                t.registerLog("[" + hora + "] (" + r.getSimpleName() + "." + Thread.currentThread().getName() + ") FATAL: " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 
     * @param key key to search the data
     * @param valor value to save
     */
    public void data(String key,Object valor){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        if(config.__DATA_ONs__){
            System.out.print("\n" +config.__COLOR_DATA__ + hora + " [" + name + "." + Thread.currentThread().getName() + "] DATA: " + valor + "\u001B[0m");
        }
        if(config.__DATA_ONdf__){
            try {
                t.registerData(key, valor);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * @param key key key to search the data
     * @param valor valor value to save
     * @param comment comment 
     */
    public void data(String key,Object valor,String comment){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        if(config.__DATA_ONs__){
            System.out.print("\n" + config.__COLOR_DATA__ + hora + " [" + name + "." + Thread.currentThread().getName() + "] DATA: " + valor + "\u001B[0m");
        }
        if(config.__DATA_ONdf__){
            try {
                t.registerData(key, valor,comment);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 
     * @param msg message
     * @param a custom logger
     */
    public void log(Object msg,CustomLogger a){
        Date date = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); 
        String hora = formatoHora.format(date);
        Logs t = new Logs(config.__OUTPUT_S,config.__OUTPUT_D);
        if(config.__ONE_FILE__ != null){
            t = new Logs(new File(config.__OUTPUT_S + "\\" + config.__ONE_FILE__),new File(config.__OUTPUT_D + "\\" + config.__ONE_FILE__));
        }
        String mens = "";
        System.out.print("\n" + a.ansicolor_);
        if(a.dateOn_){
            System.out.print(hora + " ");
            mens += "[" + hora + "] ";
        }

        if(a.classComplete_){
            System.out.print("[" + r.getName());
            mens += "(" + r.getName();
        }else{
            System.out.print("[" + r.getSimpleName());
            mens += "(" + r.getSimpleName();

        }
        if(a.threadOn_){
            Thread hiloActual = Thread.currentThread();
            System.out.print("." + hiloActual.getName() + "] ");
            mens += "." + hiloActual.getName() + ") " + a.TypeMsg_ + ": " + msg;
        }
        if(a.registerOnFile_){
            try {
                t.registerLog(mens);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(a.RegisterOnDates_){
            try {
                t.registerData("variable", msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.print(a.TypeMsg_ + ": " + msg + "\u001B[0m\n");
    }
    /**
     * @param c set file configuration
     */
    public void setConfig(log5kConf c){
        config = c;
    }
}
