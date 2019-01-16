package Entidade;

import java.util.Calendar;
import java.util.Date;

import Servico.Taxa;

public class Contrato {
	private Integer numeroContrato;
	private Date dataContrato;
	private Double valorContrato;
	
	private Taxa taxa;

	public Contrato(Integer numeroContrato, Date dataContrato,Double valorContrato, Taxa taxa) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
		this.taxa = taxa;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	public Double gerarValorParcela(int parcela, int indice) {
		return taxa.taxa(getValorContrato(), parcela, indice);
	}
	
	public Date gerarData(Date date, int indice) {
		/// não deu tive que copiar no git do professor XD
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, indice);
		return cal.getTime();
	}
}
