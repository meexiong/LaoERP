
package com.malimar.controllers;

import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.views.FrmDashboard;

public class DashBoardController {
    private final FrmDashboard view;
    String frm;
    public DashBoardController(FrmDashboard view){
        this.view = view;
        frm = this.view.getClass().getSimpleName();
        this.changeLabel();
    }
    private void changeLabel(){
        this.view.getLblTotalEmp().setText(hmapLang.get("lblTotalEmp".concat(frm).toUpperCase()) [LN]);
        this.view.getLblFemale().setText(hmapLang.get("lblFemale".concat(frm).toUpperCase()) [LN]);
        this.view.getLblMale().setText(hmapLang.get("lblMale".concat(frm).toUpperCase()) [LN]);
        this.view.getLblMOT().setText(hmapLang.get("lblMOT".concat(frm).toUpperCase()) [LN]);
        this.view.getLblMSBD().setText(hmapLang.get("lblMSBD".concat(frm).toUpperCase()) [LN]);
        this.view.getLblYSBM().setText(hmapLang.get("lblYSBM".concat(frm).toUpperCase()) [LN]);
    }
}
