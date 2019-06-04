package e.evera.u5_prctica1_sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.TextView;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    public  Receiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("aqui");
        Bundle extras=intent.getExtras();
        Object[] pdus = (Object[]) extras.get("pdus");
        SmsMessage mensaje=SmsMessage.createFromPdu((byte[])pdus[0]);

        String contenido=mensaje.getMessageBody();
        if(contenido.startsWith("TACO")){
            String[] _argumentos=contenido.split(" ");
            if(_argumentos.length==2){
                String argumentos=_argumentos[1];
                String[] __argumentos=argumentos.split(",");
                if(__argumentos.length==1){
                    String signo= __argumentos[0];


                    SQLiteDatabase db=MainActivity.getInstance().bd.getReadableDatabase();
                    String query="select from respuestas where signo='"+signo+"'";
                    Cursor c=db.rawQuery(query,null);
                    if(!c.moveToFirst()){
                        MainActivity.getInstance().mensaje("Signo no encontrado");
                        return;
                    }
                    MainActivity.getInstance().respuesta.setText(c.getString(0));

                }else{
                    MainActivity.getInstance().mensaje("formato no valido");
                }
            }else{
                MainActivity.getInstance().mensaje("Revisa el formato.");
            }
        }
    }
}