package br.com.iurimenin.steptest;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TextStepper;

public class TextStep extends TextStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setErrorTimeout(1000);
        setTitle("Text Stepper");

        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));

        super.onCreate(savedInstanceState);

        this.mCounter.setGravity(Gravity.CENTER_HORIZONTAL);
    }

    private AbstractStep createFragment(AbstractStep fragment) {
        Bundle b = new Bundle();
        b.putInt("position", i++);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onComplete() {
        super.onComplete();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
