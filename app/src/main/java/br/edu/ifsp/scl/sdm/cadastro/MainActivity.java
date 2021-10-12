package br.edu.ifsp.scl.sdm.cadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private EditText nomeCompletoEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox ingressarCb;
    private RadioGroup sexoRg;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;
    private EditText cidadeEt;
    private Spinner ufSp;
    private Button limparBt;
    private Button salvarBt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    nomeCompletoEt = findViewById(R.id.nomeCompletoEt);
    telefoneEt = findViewById(R.id.telefoneEt) ;
    emailEt = findViewById(R.id.emailEt);
    ingressarCb = findViewById(R.id.ingressarCb);
    sexoRg = findViewById(R.id.sexoRg);
    masculinoRb = findViewById(R.id.masculinoRb);
    femininoRb = findViewById(R.id.femininoRb);
    cidadeEt = findViewById(R.id.cidadeEt);
    ufSp = findViewById(R.id.ufSp);
    limparBt = findViewById(R.id.limparBt);
    salvarBt = findViewById(R.id.salvarBt);

    }


    @Override
    public void onClick(View view) {

    }
}
