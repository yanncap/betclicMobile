package betclic.m2i.com.betclicmobile;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Apropos extends AppCompatActivity {

    @BindView(R.id.textView1)
    TextView textView1;
    @BindView(R.id.textlien)
    TextView textlien;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);
        ButterKnife.bind(this);

        String apropos =
                "        <p>\n" +
                "            <strong> Notre mission :</strong> C'est plutôt simple. Nous sommes une grande famille heureuse et nous nous concentrons sur ce que nous aimons faire.\n" +
                "            Un pari sportif consiste à miser de l'argent sur un évènement lors d'une rencontre sportive.\n" +
                "            Il existe de nombreux types de paris, dont les plus simples consistent à parier sur la victoire d'une équipe précise. Chaque pari a une cote et\n" +
                "            c'est elle qui permet de connaître à l'avance, en fonction de la somme misée, le montant gagné si l'évènement se produit.\n" +
                "        </p>\n" +
                "\n" +
                "        <p>\n" +
                "            En notation décimale, si l'on mise 10 € sur l'équipe A dont la cote est de 1,6 par exemple :\n" +
                "            Si A gagne, la somme récupérée est de 16€, soit un gain de + 60 % ; \n" +
                "            Si A ne gagne pas, la somme misée est perdue, soit 10€.\n" +
                "\n" +
                "        </p>\n" +
                "\n" +
                "        <p align=\\\"justify\\\">\n" +
                "            Les paris se font en général chez des bookmakers qui sont des organismes autorisés à proposer aux joueurs de parier. Les paris sportifs étaient interdits en France jusqu'au 10 juin 2010, la veille de l'ouverture de la Coupe du monde de football.\n" +
                "            À compter de cette date, l'ARJEL (Autorité de Régulation des Jeux En Ligne) a été créée à la suite de la loi relative à l'ouverture à la concurrence des jeux d'argent et de hasard en ligne1. Elle est chargée de réguler le marché et distribue des agréments officiels aux opérateurs2.\n" +
                "            Pour plus d'informations voir ce <a href=\"https://fr.wikipedia.org/wiki/Pari_sportif\" alt=\"lien wikipedia\"> lien </a>.\n" +
                "        </p>";

        textlien.setText(fromHtml(apropos));

    }

    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html){
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}
