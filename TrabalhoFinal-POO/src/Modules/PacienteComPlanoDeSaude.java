package Modules;

import java.io.Serializable;
import java.util.Date;

public class PacienteComPlanoDeSaude extends Pacientes {
    private PlanoDeSaude planoDeSaude;
    private String numeroCarteirinha, periodoDeCarencia;
    private Date dataIngrecoNoPlano;


    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public boolean setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
        return true;
    }

    public String getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public boolean setNumeroCarteirinha(String numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
        return true;
    }

    public String getPeriodoDeCarencia() {
        return periodoDeCarencia;
    }

    public boolean setPeriodoDeCarencia(String periodoDeCarencia) {
        this.periodoDeCarencia = periodoDeCarencia;
        return true;
    }

    public Date getDataIngrecoNoPlano() {
        return dataIngrecoNoPlano;
    }

    public boolean setDataIngreco(Date dataIngreco) {
        this.dataIngrecoNoPlano = dataIngreco;
        return true;
    }

    public PacienteComPlanoDeSaude(String nome, String cpf, String rg, String estadoCivil,Endereco endereco,
                                   String sexo, Date dateNascimento, Date dataCadastro, PlanoDeSaude planoDeSaude, String numeroCarteirinha,
                                   String periodoDeCarencia, Date dataIngrecoNoPlano) {
        super(nome, cpf, rg, estadoCivil,endereco, sexo, dateNascimento, dataCadastro);
        setPlanoDeSaude(planoDeSaude);
        setNumeroCarteirinha(numeroCarteirinha);
        setPeriodoDeCarencia(periodoDeCarencia);
        setDataIngreco(dataIngrecoNoPlano);
    }



    @Override
    public String toString() {
        return super.toString()+"PacienteComPlanoDeSaude{" +
                "planoDeSaude=" + planoDeSaude +
                ", numeroCarteirinha='" + numeroCarteirinha + '\'' +
                ", periodoDeCarencia='" + periodoDeCarencia + '\'' +
                ", dataIngrecoNoPlano=" + dataIngrecoNoPlano +
                '}';
    }
}
