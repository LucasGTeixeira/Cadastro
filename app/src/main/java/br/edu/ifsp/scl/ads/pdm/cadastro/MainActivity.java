package br.edu.ifsp.scl.ads.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        Formulario pessoaCadastrada = new Formulario();


        amb.nomeCompletoEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nome = charSequence.toString();
                pessoaCadastrada.setNomeCompleto(nome);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        amb.telefoneEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String telefone = charSequence.toString();
                pessoaCadastrada.setTelefone(telefone);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        amb.emailEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String email = charSequence.toString();
                pessoaCadastrada.setEmail(email);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        amb.ingressarCb.setOnClickListener((view -> pessoaCadastrada.setIngressarListEmail(amb.ingressarCb.isChecked())));

        if(amb.masculinoRg.isChecked())
            pessoaCadastrada.setSexo("masculino");
        amb.masculinoRg.setOnClickListener((view -> pessoaCadastrada.setSexo("masculino")));
        amb.femininoRg.setOnClickListener((view -> pessoaCadastrada.setSexo("feminino")));

        amb.cidadeEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String cidade = charSequence.toString();
                pessoaCadastrada.setCidade(cidade);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        amb.estadosSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                pessoaCadastrada.setEstado(Estados.values()[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        amb.limparBt.setOnClickListener(view -> {
            amb.nomeCompletoEt.setText("");
            amb.telefoneEt.setText("");
            amb.emailEt.setText("");
            amb.cidadeEt.setText("");
            if(amb.masculinoRg.isChecked())
                amb.masculinoRg.toggle();
            else if(amb.femininoRg.isChecked()){
                amb.femininoRg.toggle();
            }
        });

        amb.salvarBt.setOnClickListener(view -> {
            String pessoa  = pessoaCadastrada.toString();
            Toast.makeText(this, pessoa, Toast.LENGTH_SHORT).show();
        });




    }
}