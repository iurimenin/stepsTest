package br.com.iurimenin.steptest;

import android.content.Intent;
import android.os.Bundle;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.DotStepper;

public class DotsSample extends DotStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setErrorTimeout(1500);
        setTitle("Dots Stepper");

        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));

        super.onCreate(savedInstanceState);
    }

    private AbstractStep createFragment(AbstractStep fragment) {
        Bundle b = new Bundle();
        b.putInt("position", i++);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onComplete() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
