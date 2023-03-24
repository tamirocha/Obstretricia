package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

    private Date dataUltimoPeriodoMenstrual;


    // construtor
    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }


    // método de conversão do tipo Date para Calendar
    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    // métodos lógicos

    public Date calcularDataEstimadaConcepcao() {
        Calendar dataEstimadaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        dataEstimadaConcepcao.add(Calendar.WEEK_OF_YEAR,2);

        return dataEstimadaConcepcao.getTime();
    }

    public Date calcularDataEstimadaParto() {
        Calendar dataEstimadaParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);

        return dataEstimadaParto.getTime();

    }
}
