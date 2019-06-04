package e.evera.u5_prctica1_sms;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos(Context c){
        super(c,"respuestas",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase p1){
        String c1="create table respuestas(signo varchar,tipo varchar)";
        p1.execSQL(c1);
        p1.execSQL("insert into respuestas values('aries','Tacos de Canasta: Eres valiente determinado y seguro, te gusta ahorrar dinero para ocasiones verdaderamente especiales, te gusta tomar baños al vapor, eres exigente con las salsas y no tienes problema en comer solo.')");
        p1.execSQL("insert into respuestas values('tauro','Tacos Dorados: Sueles ser paciente, práctico y a veces muy duro contigo mismo. Disfrutas probar diferentes guisados, siempre y cuando haya una buena tortilla que los acompañen, eres propenso a comer mucha grasa y te encanta que la comida cruja dentro de tu boca.')");
        p1.execSQL("insert into respuestas values('geminis','Tacos de Carnitas:  Eres una persona muy curiosa y adaptable, también te defines por ser arriesgado e intrépido, por lo mismo te encanta visitar lugares nuevos hasta encontrar los tacos perfectos, pero lo tuyo lo tuyo son los de carnitas, consideras que el cerdo es la mejor carne y solían decirte.')");
        p1.execSQL("insert into respuestas values('cancer','Tacos al Pastor: Entre tus fortalezas están el ser tenaz, persuasivo y simpático, eres muy bueno haciendo amigos en las taquerías, muy difícilmente te convencen de comer otros tacos que no sean al pastor, ya que tu hit es la carne a la brazas, y la combinación dulce con salado de la piña y la carne.')");
        p1.execSQL("insert into respuestas values('leo','Tacos de Suadero: Eres muy creativo y apasionado, más si se trata de tacos, podrás pedir de pastor, carnitas o surtido, pero nunca dejarás de pedir de suadero, los amas, y eso te define que al escoger pareja siembre buscas a alguien que tenga bastante carne en los huesos.')");
        p1.execSQL("insert into respuestas values('virgo','Tacos de Cecina:  Tienes gran capacidad analítica para hacer las cosas muy prácticas, lo tuyo es la onda norteña, con climas cálidos secos, prefieres acompañar tus tacos con cerveza más que con refresco o boing, soportas la comida salada y sueles ponerle sal a los tacos antes de probarlos.')");
        p1.execSQL("insert into respuestas values('libra','Tacos de Arrachera:  Lo que más disfrutas en la vida es pasar tiempo en familia y amigos, en especial si se organizan taquizas. Te gusta cooperar con la preparación de los tacos para ser el que escoja la carne más dorada y si llegan a faltar cebollitas, nopales o papas te enojas muchísimo.')");
        p1.execSQL("insert into respuestas values('escorpio','Tacos de Cochinita Pipil:  Eres muy valiente y apasionado, he ahí la razón por la que aguantas la salsa habanero en tus tacos de cochinita, te gusta visitar las playas, en especial las de Cancún, de donde provienen tus tacos favoritos y disfrutas los aromas fuertes y condimentados en tus comidas.')");
        p1.execSQL("insert into respuestas values('sagitario','Tacos Placeros:  Te caracterizas por ser una persona muy generosa e idealista, pero si hay algo que te enoja es tener hambre, por eso la mayor parte de tu quincena se va en comer tacos, siempre les pones limón y no te llenas muy rápido.')");
        p1.execSQL("insert into respuestas values('capricornio','Tacos de Barbacoa:  Sueles tener mucho autocontrol, pero cuando se trata de tacos eres un verdadero campeón. Pruebas de diversas carnes y crees que no hay mejor cura para la cruda que unos ricos tacos de barbacoa con su consomé a lado.')");
        p1.execSQL("insert into respuestas values('acuario','Tacos de Mixiote:  Eres una persona original e independiente. Eres el buen amigo que siempre invita los tacos, pero siempre y cuando sean de mixiotes. También eres exigente con las salsas ya que crees que es el punto clave de un buen taco y te gusta comer acompañado.')");
        p1.execSQL("insert into respuestas values('picis','Tacos de Chicharron:  Una de tus mayores pasiones es la comida, la mayoría de las personas que te conocen siempre te consultan dónde ir por los mejores tacos. Tanto es tu pasión por los tacos que tú mismo te los preparas cada que se te antoja siendo tu especialidad los de chicharrón.')");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
